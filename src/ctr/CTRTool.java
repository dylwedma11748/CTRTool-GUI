package ctr;

import gui.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CTRTool 
{
    public static String determineCommandLine()
    {
        String command = "";
        
        if(gui.GUI.ExtractWithoutDecrypting.isSelected())
        {
            command = command + "-x ";
        }
        
        else
        {
            command = command + "-x ";
        }
        
        if(gui.GUI.KeepRawData.isSelected())
        {
            command = command + "-r ";
        }
        
        if(gui.GUI.SpecifyKeysetFile.isSelected())
        {
            String keysetFile = gui.GUI.KeysetFileField.getText();
            command = command + "-k " + keysetFile + " ";
        }
        
        command = command + "-t cia " + gui.GUI.TargetFileField.getText() + " ";
        
        if(gui.GUI.SpecifyCertificateChainFile.isSelected())
        {
            String certificateChainFile = gui.GUI.CertificateChainFileField.getText();
            command = command + "--certs=" + certificateChainFile + "";
        }
        
        if(gui.GUI.SpecifyTicketFile.isSelected())
        {
            String ticketFile = gui.GUI.TicketFileField.getText();
            command = command + "--tik=" + ticketFile + " ";
        }
        
        if(gui.GUI.SpecifyTMDFile.isSelected())
        {
            String tmdFile = gui.GUI.TMDFileField.getText();
            command = command + "--tmd=" + tmdFile + " ";
        }
        
        if(gui.GUI.SpecifyContentsFile.isSelected())
        {
            String contentsFile = gui.GUI.ContentsFileField.getText();
            command = command + "--contents=" + contentsFile + " ";
        }
        
        if(gui.GUI.SpecifyMetaFile.isSelected())
        {
            String metaFile = gui.GUI.MetaFileField.getText();
            command = command + "--meta=" + metaFile + " ";
        }
        
        if(command.endsWith(" "))
        {
            command = command.substring(0, command.lastIndexOf(" "));
        }
        
        return command;
    }
    
    public static void execute(File ctrtool)
    {
        if(ctrtool.exists() && ctrtool.canExecute())
        {
            try 
            {
                Log.Log.setText(null);
                Process process = Runtime.getRuntime().exec(ctrtool.getAbsolutePath() + " " + determineCommandLine());
                InputStreamReader normalStream = new InputStreamReader(process.getInputStream());
                InputStreamReader errorStream = new InputStreamReader(process.getErrorStream());
                BufferedReader normalReader = new BufferedReader(normalStream);
                BufferedReader errorReader = new BufferedReader(errorStream);
                String line;
            
                Log.Log.append("Output Log:");
                Log.Log.append("\n");
            
                while((line = normalReader.readLine()) != null)
                {
                    if(! "".equals(line))
                    {
                        Log.Log.append("\n" + line);
                    }
                }
            
                Log.Log.append("\n");
                Log.Log.append("\nError Log:");
                Log.Log.append("\n");
            
                while((line = errorReader.readLine()) != null)
                {
                    if(! "".equals(line))
                    {
                        Log.Log.append("\n" + line);
                    }
                }
            }
        
            catch (IOException ex) 
            {
                Logger.getLogger(CTRTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Provided CTRTool file doesn't exist or cannot be executed!", "Invalid File", JOptionPane.ERROR_MESSAGE);
        }
    }
}