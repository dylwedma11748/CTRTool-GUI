package ctr;

import gui.Log;
import static gui.GUI.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class CTRTool {

    public static String determineCommandLine() {
        String command = "";

        if (ExtractWithoutDecrypting.isSelected()) {
            command = command + "-p ";
        } else {
            command = command + "-x ";
        }

        if (KeepRawData.isSelected()) {
            command = command + "-r ";
        }

        if (SpecifyKeysetFile.isSelected()) {
            String keysetFile = KeysetFileField.getText();
            command = command + "-k " + keysetFile + " ";
        }

        command = command + "-t " + getInputFileType() + " " + TargetFileField.getText() + " ";

        if (SpecifyCertificateChainFile.isSelected()) {
            String certificateChainFile = CertificateChainFileField.getText();
            command = command + "--certs=" + certificateChainFile + "";
        }

        if (SpecifyTicketFile.isSelected()) {
            String ticketFile = TicketFileField.getText();
            command = command + "--tik=" + ticketFile + " ";
        }

        if (SpecifyTMDFile.isSelected()) {
            String tmdFile = TMDFileField.getText();
            command = command + "--tmd=" + tmdFile + " ";
        }

        if (SpecifyContentsFile.isSelected()) {
            String contentsFile = ContentsFileField.getText();
            command = command + "--contents=" + contentsFile + " ";
        }

        if (SpecifyMetaFile.isSelected()) {
            String metaFile = MetaFileField.getText();
            command = command + "--meta=" + metaFile + " ";
        }

        if (SpecifyLZSSOutputFile.isSelected()) {
            String lzssFile = LZSSOutputFileField.getText();
            command = command + "--lzssout=" + lzssFile + " ";
        }

        if (SpecifyNCCHPartitionIndex.isSelected()) {
            String index = NCCHPartitionIndexField.getText();
            command = command + "--ncch=" + index + " ";
        }

        if (SpecifyExtendedHeaderFile.isSelected()) {
            String exheaderFile = ExtendedHeaderFileField.getText();
            command = command + "--exheader=" + exheaderFile;
        }

        if (SpecifyPlainRegionFile.isSelected()) {
            String plainRegionFile = PlainRegionFileField.getText();
            command = command + "--plainrgn=" + plainRegionFile + " ";
        }

        if (SpecifyExeFSDirectory.isSelected()) {
            String exeFSDirectory = ExeFSDirectoryField.getText();
            command = command + "--exefsdir=" + exeFSDirectory + " ";
        }

        if (SpecifyExeFSFile.isSelected()) {
            String exeFSFile = ExeFSFileField.getText();
            command = command + "--exefs=" + exeFSFile + " ";
        }

        if (SpecifyRomFSFile.isSelected()) {
            String romFSFile = RomFSFileField.getText();
            command = command + "--romfs=" + romFSFile + " ";
        }

        if (SpecifyRomFSDirectory.isSelected()) {
            String romFSDirectory = RomFSDirectoryField.getText();
            command = command + "--romfsdir=" + romFSDirectory + " ";
        }

        if (ListFilesInRomFS.isSelected()) {
            command = command + "--listromfs" + " ";
        }

        if (SpecifyFirmDirectory.isSelected()) {
            String firmDirectory = FirmDirectoryField.getText();
            command = command + "--firmdir=" + firmDirectory + " ";
        }

        if (SpecifyWavOutputFile.isSelected()) {
            String waveFile = WavOutputFileField.getText();
            command = command + "--wav=" + waveFile + " ";
        }

        if (SpecifyWavLoopCount.isSelected()) {
            String loopCount = WavLoopCountField.getText();
            command = command + "--wavloops=" + loopCount + " ";
        }

        if (DecompressCodeSection.isSelected()) {
            command = command + "--decompresscode" + " ";
        }

        if (command.endsWith(" ")) {
            command = command.substring(0, command.lastIndexOf(" "));
        }

        return command;
    }

    private static String getInputFileType() {
        String returnString = null;
        String inputTypeText = InputFileTypeLabel.getText();

        for (FileFilter filter : inputFilters) {
            String desc = filter.getDescription();

            if (inputTypeText.contains(desc)) {
                if (filter.getDescription().equals(inputFilters[2].getDescription())) {
                    returnString = "exheader";
                } else if (filter.getDescription().equals(inputFilters[3].getDescription())) {
                    returnString = "cia";
                } else if (filter.getDescription().equals(inputFilters[4].getDescription())) {
                    returnString = "tmd";
                } else {
                    returnString = desc.substring(0, 4).toLowerCase();
                }
            }
        }

        System.out.println(returnString);
        return returnString;
    }

    private static boolean keysetFileValid(File keysetFile) {
        boolean valid = false;

        if (!SpecifyKeysetFile.isSelected()) {
            valid = true;
        }

        if (SpecifyKeysetFile.isSelected() && keysetFile.exists()) {
            valid = true;
        }

        return valid;
    }

    private static boolean ctrtoolFileValid(File ctrtool) {
        boolean valid = false;

        if (ctrtool.exists() && ctrtool.canExecute()) {
            valid = true;
        }

        return valid;
    }

    public static void execute(File ctrtool, File keysetFile) {
        if (ctrtoolFileValid(ctrtool) && keysetFileValid(keysetFile)) {
            try {
                Log.Log.setText(null);
                Process process = Runtime.getRuntime().exec(ctrtool.getAbsolutePath() + " " + determineCommandLine());
                InputStreamReader normalStream = new InputStreamReader(process.getInputStream());
                InputStreamReader errorStream = new InputStreamReader(process.getErrorStream());
                BufferedReader normalReader = new BufferedReader(normalStream);
                BufferedReader errorReader = new BufferedReader(errorStream);
                String line;

                Log.Log.append("Output Log:");
                Log.Log.append("\n");

                while ((line = normalReader.readLine()) != null) {
                    if (!"".equals(line)) {
                        Log.Log.append("\n" + line);
                    }
                }

                Log.Log.append("\n");
                Log.Log.append("\nError Log:");
                Log.Log.append("\n");

                while ((line = errorReader.readLine()) != null) {
                    if (!"".equals(line)) {
                        Log.Log.append("\n" + line);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(CTRTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (keysetFileValid(keysetFile) == false) {
                JOptionPane.showMessageDialog(null, "Provided Keyset file doesn't exist or cannot be used!", "Invalid Keyset File", JOptionPane.ERROR_MESSAGE);
            }

            if (ctrtoolFileValid(ctrtool) == false) {
                JOptionPane.showMessageDialog(null, "Provided CTRTool file doesn't exist or cannot be executed!", "Invalid CTRTool Program", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
