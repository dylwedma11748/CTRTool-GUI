package gui;

import ctr.CTRTool;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {

    public GUI() {
        initComponents();
    }

    private Changelog changelog;
    private int count = 0;
    private String storedCTRToolPath = null;
    private int d1 = 0, d2 = 0;

    private static final FileFilter ncsd = new FileNameExtensionFilter("NCSD File (.cci, .csu)", "cci", "csu");
    private static final FileFilter ncch = new FileNameExtensionFilter("NCCH File (.cxi, .cfa, .app, .caa)", "cxi", "cfa", "app", "caa");
    private static final FileFilter exheader = new FileNameExtensionFilter("NCCH Extended Header (.exheader)", "exheader");
    private static final FileFilter cia = new FileNameExtensionFilter("CTR Importable Archive (.cia)", "cia");
    private static final FileFilter tmd = new FileNameExtensionFilter("Title Meta Data (.tmd)", "tmd");

    /**
     * Just an array that contains all the FileFilter objects used in the input
     * file chooser, this is needed for CTRTool.getInputFileType() to work.
     */
    @SuppressWarnings("StaticNonFinalUsedInInitialization")
    public static final FileFilter[] inputFilters = {ncsd, ncch, exheader, cia, tmd};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLabel = new javax.swing.JLabel();
        TargetFileField = new javax.swing.JFormattedTextField();
        TargetFileLabel = new javax.swing.JLabel();
        BrowseTargetFile = new javax.swing.JButton();
        Execute = new javax.swing.JButton();
        ExtractWithoutDecrypting = new javax.swing.JCheckBox();
        KeepRawData = new javax.swing.JCheckBox();
        SpecifyKeysetFile = new javax.swing.JCheckBox();
        KeysetFileField = new javax.swing.JFormattedTextField();
        BrowseKeysetFile = new javax.swing.JButton();
        KeysetFileLabel = new javax.swing.JLabel();
        CTRToolPathLabel = new javax.swing.JLabel();
        CTRToolPath = new javax.swing.JLabel();
        VersionLabel = new javax.swing.JLabel();
        OptionsPane = new javax.swing.JTabbedPane();
        CIA = new javax.swing.JLayeredPane();
        CIAPanel = new javax.swing.JPanel();
        SpecifyCertificateChainFile = new javax.swing.JCheckBox();
        CertificateChainFileField = new javax.swing.JFormattedTextField();
        BrowseCertificateChainFile = new javax.swing.JButton();
        BrowseTicketFile = new javax.swing.JButton();
        SpecifyTicketFile = new javax.swing.JCheckBox();
        TicketFileField = new javax.swing.JFormattedTextField();
        SpecifyTMDFile = new javax.swing.JCheckBox();
        BrowseTMDFile = new javax.swing.JButton();
        TMDFileField = new javax.swing.JFormattedTextField();
        SpecifyContentsFile = new javax.swing.JCheckBox();
        ContentsFileField = new javax.swing.JFormattedTextField();
        BrowseContentsFile = new javax.swing.JButton();
        SpecifyMetaFile = new javax.swing.JCheckBox();
        MetaFileField = new javax.swing.JFormattedTextField();
        BrowseMetaFile = new javax.swing.JButton();
        LZSS = new javax.swing.JLayeredPane();
        LZSSPanel = new javax.swing.JPanel();
        SpecifyLZSSOutputFile = new javax.swing.JCheckBox();
        BrowseLZZOutputFile = new javax.swing.JButton();
        LZSSOutputFileField = new javax.swing.JFormattedTextField();
        CXICII = new javax.swing.JLayeredPane();
        CXICIIPanel = new javax.swing.JPanel();
        SpecifyExtendedHeaderFile = new javax.swing.JCheckBox();
        BrowseExtendedHeaderFile = new javax.swing.JButton();
        ExtendedHeaderFileField = new javax.swing.JFormattedTextField();
        BrowseLogoFile = new javax.swing.JButton();
        SpecifyLogoFile = new javax.swing.JCheckBox();
        LogoFileField = new javax.swing.JFormattedTextField();
        BrowsePlainRegionFile = new javax.swing.JButton();
        SpecifyPlainRegionFile = new javax.swing.JCheckBox();
        PlainRegionFileField = new javax.swing.JFormattedTextField();
        SpecifyExeFSFile = new javax.swing.JCheckBox();
        BrowseExeFSFile = new javax.swing.JButton();
        ExeFSFileField = new javax.swing.JFormattedTextField();
        SpecifyExeFSDirectory = new javax.swing.JCheckBox();
        BrowseExeFSDirectory = new javax.swing.JButton();
        ExeFSDirectoryField = new javax.swing.JFormattedTextField();
        SpecifyRomFSFile = new javax.swing.JCheckBox();
        RomFSFileField = new javax.swing.JFormattedTextField();
        BrowseRomFSFile = new javax.swing.JButton();
        RomFSDirectoryField = new javax.swing.JFormattedTextField();
        SpecifyRomFSDirectory = new javax.swing.JCheckBox();
        BrowseRomFSDirectory = new javax.swing.JButton();
        ListFilesInRomFS = new javax.swing.JCheckBox();
        SpecifyNCCHPartitionIndex = new javax.swing.JCheckBox();
        NCCHPartitionIndexField = new javax.swing.JFormattedTextField();
        FIRM = new javax.swing.JLayeredPane();
        FIRMPanel = new javax.swing.JPanel();
        SpecifyFirmDirectory = new javax.swing.JCheckBox();
        BrowseFirmDirectory = new javax.swing.JButton();
        FirmDirectoryField = new javax.swing.JFormattedTextField();
        CWAV = new javax.swing.JLayeredPane();
        CWAVPanel = new javax.swing.JPanel();
        SpecifyWavOutputFile = new javax.swing.JCheckBox();
        BrowseWaveOutputFile = new javax.swing.JButton();
        WavOutputFileField = new javax.swing.JFormattedTextField();
        SpecifyWavLoopCount = new javax.swing.JCheckBox();
        WavLoopCountField = new javax.swing.JFormattedTextField();
        EXEFS = new javax.swing.JLayeredPane();
        EXEFSPanel = new javax.swing.JPanel();
        DecompressCodeSection = new javax.swing.JCheckBox();
        InputFileTypeLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        DownloadLatestCTRTool = new javax.swing.JMenuItem();
        ChangeCTRToolFilePath = new javax.swing.JMenuItem();
        Tools = new javax.swing.JMenu();
        ShowLog = new javax.swing.JCheckBoxMenuItem();
        ShowChangelog = new javax.swing.JCheckBoxMenuItem();
        Help = new javax.swing.JMenu();
        Update = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CTRTool GUI");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("CTRTool GUI by Dylan Wedman");
        getContentPane().add(TopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 20));

        TargetFileField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TargetFileFieldKeyPressed(evt);
            }
        });
        getContentPane().add(TargetFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 750, -1));

        TargetFileLabel.setText("Target File:");
        getContentPane().add(TargetFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        BrowseTargetFile.setText("Browse");
        BrowseTargetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTargetFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseTargetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, -1));

        Execute.setText("Execute");
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });
        getContentPane().add(Execute, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 80, -1));

        ExtractWithoutDecrypting.setText("Extract Data Without Decrypting");
        getContentPane().add(ExtractWithoutDecrypting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        KeepRawData.setText("Keep Raw Data (Don't Unpack)");
        getContentPane().add(KeepRawData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        SpecifyKeysetFile.setText("Specify Keyset File");
        SpecifyKeysetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyKeysetFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyKeysetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        KeysetFileField.setEnabled(false);
        getContentPane().add(KeysetFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 750, -1));

        BrowseKeysetFile.setText("Browse");
        BrowseKeysetFile.setEnabled(false);
        BrowseKeysetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseKeysetFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseKeysetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));

        KeysetFileLabel.setText("Keyset File:");
        getContentPane().add(KeysetFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        CTRToolPathLabel.setText("CTRTool Path:");
        getContentPane().add(CTRToolPathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        CTRToolPath.setText(" ");
        getContentPane().add(CTRToolPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 850, -1));

        VersionLabel.setText("v1.2");
        VersionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VersionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VersionLabelMouseReleased(evt);
            }
        });
        getContentPane().add(VersionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        CIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CIAPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecifyCertificateChainFile.setText("Specify Certificate Chain File");
        SpecifyCertificateChainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyCertificateChainFileActionPerformed(evt);
            }
        });
        CIAPanel.add(SpecifyCertificateChainFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, -1));

        CertificateChainFileField.setEnabled(false);
        CIAPanel.add(CertificateChainFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, -1));

        BrowseCertificateChainFile.setText("Browse");
        BrowseCertificateChainFile.setEnabled(false);
        BrowseCertificateChainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseCertificateChainFileActionPerformed(evt);
            }
        });
        CIAPanel.add(BrowseCertificateChainFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        BrowseTicketFile.setText("Browse");
        BrowseTicketFile.setEnabled(false);
        BrowseTicketFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTicketFileActionPerformed(evt);
            }
        });
        CIAPanel.add(BrowseTicketFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        SpecifyTicketFile.setText("Specify Ticket File");
        SpecifyTicketFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyTicketFileActionPerformed(evt);
            }
        });
        CIAPanel.add(SpecifyTicketFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        TicketFileField.setEnabled(false);
        CIAPanel.add(TicketFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 160, -1));

        SpecifyTMDFile.setText("Specify TMD File");
        SpecifyTMDFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyTMDFileActionPerformed(evt);
            }
        });
        CIAPanel.add(SpecifyTMDFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        BrowseTMDFile.setText("Browse");
        BrowseTMDFile.setEnabled(false);
        BrowseTMDFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTMDFileActionPerformed(evt);
            }
        });
        CIAPanel.add(BrowseTMDFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        TMDFileField.setEnabled(false);
        CIAPanel.add(TMDFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, -1));

        SpecifyContentsFile.setText("Specify Contents File");
        SpecifyContentsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyContentsFileActionPerformed(evt);
            }
        });
        CIAPanel.add(SpecifyContentsFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 130, -1));

        ContentsFileField.setEnabled(false);
        CIAPanel.add(ContentsFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 160, -1));

        BrowseContentsFile.setText("Browse");
        BrowseContentsFile.setEnabled(false);
        BrowseContentsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseContentsFileActionPerformed(evt);
            }
        });
        CIAPanel.add(BrowseContentsFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        SpecifyMetaFile.setText("Specify Meta File");
        SpecifyMetaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyMetaFileActionPerformed(evt);
            }
        });
        CIAPanel.add(SpecifyMetaFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        MetaFileField.setEnabled(false);
        CIAPanel.add(MetaFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, -1));

        BrowseMetaFile.setText("Browse");
        BrowseMetaFile.setEnabled(false);
        BrowseMetaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseMetaFileActionPerformed(evt);
            }
        });
        CIAPanel.add(BrowseMetaFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        CIA.add(CIAPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 220));

        OptionsPane.addTab("CIA", CIA);

        LZSS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LZSSPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecifyLZSSOutputFile.setText("Specify LZSS Output File");
        SpecifyLZSSOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyLZSSOutputFileActionPerformed(evt);
            }
        });
        LZSSPanel.add(SpecifyLZSSOutputFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        BrowseLZZOutputFile.setText("Browse");
        BrowseLZZOutputFile.setEnabled(false);
        BrowseLZZOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseLZZOutputFileActionPerformed(evt);
            }
        });
        LZSSPanel.add(BrowseLZZOutputFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        LZSSOutputFileField.setEnabled(false);
        LZSSPanel.add(LZSSOutputFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, -1));

        LZSS.add(LZSSPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        OptionsPane.addTab("LZSS", LZSS);

        CXICII.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CXICIIPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecifyExtendedHeaderFile.setText("Specify Extended Header File");
        SpecifyExtendedHeaderFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyExtendedHeaderFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyExtendedHeaderFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, -1));

        BrowseExtendedHeaderFile.setText("Browse");
        BrowseExtendedHeaderFile.setEnabled(false);
        BrowseExtendedHeaderFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseExtendedHeaderFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseExtendedHeaderFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        ExtendedHeaderFileField.setEnabled(false);
        CXICIIPanel.add(ExtendedHeaderFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 160, -1));

        BrowseLogoFile.setText("Browse");
        BrowseLogoFile.setEnabled(false);
        BrowseLogoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseLogoFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseLogoFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        SpecifyLogoFile.setText("Specify Logo file");
        SpecifyLogoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyLogoFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyLogoFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        LogoFileField.setEnabled(false);
        CXICIIPanel.add(LogoFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 160, -1));

        BrowsePlainRegionFile.setText("Browse");
        BrowsePlainRegionFile.setEnabled(false);
        BrowsePlainRegionFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowsePlainRegionFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowsePlainRegionFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        SpecifyPlainRegionFile.setText("Specify Plain Region File");
        SpecifyPlainRegionFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyPlainRegionFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyPlainRegionFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        PlainRegionFileField.setEnabled(false);
        CXICIIPanel.add(PlainRegionFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, -1));

        SpecifyExeFSFile.setText("Specify ExeFS File");
        SpecifyExeFSFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyExeFSFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyExeFSFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        BrowseExeFSFile.setText("Browse");
        BrowseExeFSFile.setEnabled(false);
        BrowseExeFSFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseExeFSFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseExeFSFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        ExeFSFileField.setEnabled(false);
        CXICIIPanel.add(ExeFSFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));

        SpecifyExeFSDirectory.setText("Specify ExeFS directory");
        SpecifyExeFSDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyExeFSDirectoryActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyExeFSDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        BrowseExeFSDirectory.setText("Browse");
        BrowseExeFSDirectory.setEnabled(false);
        BrowseExeFSDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseExeFSDirectoryActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseExeFSDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        ExeFSDirectoryField.setEnabled(false);
        CXICIIPanel.add(ExeFSDirectoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, -1));

        SpecifyRomFSFile.setText("Specify RomFS file");
        SpecifyRomFSFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyRomFSFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyRomFSFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, -1));

        RomFSFileField.setEnabled(false);
        CXICIIPanel.add(RomFSFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, -1));

        BrowseRomFSFile.setText("Browse");
        BrowseRomFSFile.setEnabled(false);
        BrowseRomFSFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseRomFSFileActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseRomFSFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        RomFSDirectoryField.setEnabled(false);
        CXICIIPanel.add(RomFSDirectoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, -1));

        SpecifyRomFSDirectory.setText("Specify RomFS directory");
        SpecifyRomFSDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyRomFSDirectoryActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyRomFSDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        BrowseRomFSDirectory.setText("Browse");
        BrowseRomFSDirectory.setEnabled(false);
        BrowseRomFSDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseRomFSDirectoryActionPerformed(evt);
            }
        });
        CXICIIPanel.add(BrowseRomFSDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        ListFilesInRomFS.setText("List files in RomFS");
        ListFilesInRomFS.setEnabled(false);
        CXICIIPanel.add(ListFilesInRomFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        SpecifyNCCHPartitionIndex.setText("Specify NCCH Partition Index");
        SpecifyNCCHPartitionIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyNCCHPartitionIndexActionPerformed(evt);
            }
        });
        CXICIIPanel.add(SpecifyNCCHPartitionIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        NCCHPartitionIndexField.setEnabled(false);
        CXICIIPanel.add(NCCHPartitionIndexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 20, -1));

        CXICII.add(CXICIIPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        OptionsPane.addTab("CXI/CCI", CXICII);

        FIRM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FIRMPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecifyFirmDirectory.setText("Specify Firm directory");
        SpecifyFirmDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyFirmDirectoryActionPerformed(evt);
            }
        });
        FIRMPanel.add(SpecifyFirmDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        BrowseFirmDirectory.setText("Browse");
        BrowseFirmDirectory.setEnabled(false);
        BrowseFirmDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFirmDirectoryActionPerformed(evt);
            }
        });
        FIRMPanel.add(BrowseFirmDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        FirmDirectoryField.setEnabled(false);
        FIRMPanel.add(FirmDirectoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, -1));

        FIRM.add(FIRMPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        OptionsPane.addTab("FIRM", FIRM);

        CWAV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CWAVPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecifyWavOutputFile.setText("Specify Wav Output File");
        SpecifyWavOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyWavOutputFileActionPerformed(evt);
            }
        });
        CWAVPanel.add(SpecifyWavOutputFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        BrowseWaveOutputFile.setText("Browse");
        BrowseWaveOutputFile.setEnabled(false);
        BrowseWaveOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseWaveOutputFileActionPerformed(evt);
            }
        });
        CWAVPanel.add(BrowseWaveOutputFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        WavOutputFileField.setEnabled(false);
        CWAVPanel.add(WavOutputFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, -1));

        SpecifyWavLoopCount.setText("Specify Wav Loop Count");
        SpecifyWavLoopCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyWavLoopCountActionPerformed(evt);
            }
        });
        CWAVPanel.add(SpecifyWavLoopCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        WavLoopCountField.setEnabled(false);
        CWAVPanel.add(WavLoopCountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 20, -1));

        CWAV.add(CWAVPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        OptionsPane.addTab("CWAV", CWAV);

        EXEFS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXEFSPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DecompressCodeSection.setText("Decompress .code section");
        EXEFSPanel.add(DecompressCodeSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        EXEFS.add(EXEFSPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        OptionsPane.addTab("EXEFS", EXEFS);

        getContentPane().add(OptionsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 600, 230));

        InputFileTypeLabel.setText("Input File Type:");
        getContentPane().add(InputFileTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 320, -1));

        File.setText("File");

        DownloadLatestCTRTool.setText("Download CTRTool");
        DownloadLatestCTRTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadLatestCTRToolActionPerformed(evt);
            }
        });
        File.add(DownloadLatestCTRTool);

        ChangeCTRToolFilePath.setText("Set CTRTool File Path");
        ChangeCTRToolFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeCTRToolFilePathActionPerformed(evt);
            }
        });
        File.add(ChangeCTRToolFilePath);

        MenuBar.add(File);

        Tools.setText("Window");

        ShowLog.setText("Show Log");
        ShowLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLogActionPerformed(evt);
            }
        });
        Tools.add(ShowLog);

        ShowChangelog.setText("Show Changelog");
        ShowChangelog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowChangelogActionPerformed(evt);
            }
        });
        Tools.add(ShowChangelog);

        MenuBar.add(Tools);

        Help.setText("Help");

        Update.setText("Check for Updates");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        Help.add(Update);

        MenuBar.add(Help);

        setJMenuBar(MenuBar);

        setSize(new java.awt.Dimension(970, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseTargetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTargetFileActionPerformed
        if (TargetFileField.getText().equals("<debug>")) {
            d1 = 1;
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Choose File");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(cia);
            fileChooser.addChoosableFileFilter(ncsd);
            fileChooser.addChoosableFileFilter(ncch);
            fileChooser.addChoosableFileFilter(exheader);
            fileChooser.addChoosableFileFilter(tmd);

            int returnValue = fileChooser.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                TargetFileField.setText("\"" + filePath + "\"");
                String fileName = selectedFile.getName();
                String extension = fileName.substring(fileName.indexOf("."));

                switch (extension) {
                    case ".cci":
                    case ".csu":
                        InputFileTypeLabel.setText("Input File Type: " + ncsd.getDescription());
                        break;

                    case ".cxi":
                    case ".cfa":
                    case ".app":
                    case ".caa":
                        InputFileTypeLabel.setText("Input File Type: " + ncch.getDescription());
                        break;

                    case ".exheader":
                        InputFileTypeLabel.setText("Input File Type: " + exheader.getDescription());
                        break;

                    case ".cia":
                        InputFileTypeLabel.setText("Input File Type: " + cia.getDescription());
                        break;

                    case ".tmd":
                        InputFileTypeLabel.setText("Input File Type: " + tmd.getDescription());
                        break;

                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_BrowseTargetFileActionPerformed

    private void SpecifyKeysetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyKeysetFileActionPerformed
        if (SpecifyKeysetFile.isSelected()) {
            KeysetFileField.setEnabled(true);
            BrowseKeysetFile.setEnabled(true);
        } else {
            KeysetFileField.setText("");
            KeysetFileField.setEnabled(false);
            BrowseKeysetFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyKeysetFileActionPerformed

    private void SpecifyCertificateChainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyCertificateChainFileActionPerformed
        if (SpecifyCertificateChainFile.isSelected()) {
            CertificateChainFileField.setEnabled(true);
            BrowseCertificateChainFile.setEnabled(true);
        } else {
            CertificateChainFileField.setText("");
            CertificateChainFileField.setEnabled(false);
            BrowseCertificateChainFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyCertificateChainFileActionPerformed

    private void SpecifyTicketFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyTicketFileActionPerformed
        if (SpecifyTicketFile.isSelected()) {
            TicketFileField.setEnabled(true);
            BrowseTicketFile.setEnabled(true);
        } else {
            TicketFileField.setText("");
            TicketFileField.setEnabled(false);
            BrowseTicketFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyTicketFileActionPerformed

    private void SpecifyTMDFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyTMDFileActionPerformed
        if (SpecifyTMDFile.isSelected()) {
            TMDFileField.setEnabled(true);
            BrowseTMDFile.setEnabled(true);
        } else {
            TMDFileField.setText("");
            TMDFileField.setEnabled(false);
            BrowseTMDFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyTMDFileActionPerformed

    private void SpecifyContentsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyContentsFileActionPerformed
        if (SpecifyContentsFile.isSelected()) {
            ContentsFileField.setEnabled(true);
            BrowseContentsFile.setEnabled(true);
        } else {
            ContentsFileField.setText("");
            ContentsFileField.setEnabled(false);
            BrowseContentsFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyContentsFileActionPerformed

    private void SpecifyMetaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyMetaFileActionPerformed
        if (SpecifyMetaFile.isSelected()) {
            MetaFileField.setEnabled(true);
            BrowseMetaFile.setEnabled(true);
        } else {
            MetaFileField.setText("");
            MetaFileField.setEnabled(false);
            BrowseMetaFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyMetaFileActionPerformed

    private void BrowseCertificateChainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseCertificateChainFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            CertificateChainFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseCertificateChainFileActionPerformed

    private void BrowseTicketFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTicketFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            TicketFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseTicketFileActionPerformed

    private void BrowseTMDFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTMDFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            TMDFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseTMDFileActionPerformed

    private void BrowseContentsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseContentsFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            ContentsFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseContentsFileActionPerformed

    private void BrowseMetaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseMetaFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            MetaFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseMetaFileActionPerformed

    private void BrowseKeysetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseKeysetFileActionPerformed
        FileFilter xml = new FileNameExtensionFilter("XML Files", "xml");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(xml);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File keysetFile = fileChooser.getSelectedFile();

            if (keysetFile.exists()) {
                String path = keysetFile.getAbsolutePath();
                KeysetFileField.setText("\"" + path + "\"");
            } else {
                showMessageDialog(this, "Provided Keyset file doesn't exist!", "Invalid File", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BrowseKeysetFileActionPerformed

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        if (TargetFileField.getText().equals("<debug>")) {
            d2 = 1;
        } else {
            if (CTRToolPath.getText().equals(" ")) {
                FileFilter exe = new FileNameExtensionFilter("Exe Files", "exe");

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Open CTRTool Program");
                fileChooser.setAcceptAllFileFilterUsed(false);
                fileChooser.addChoosableFileFilter(exe);

                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File ctrTool = fileChooser.getSelectedFile();

                    if (ctrTool.exists() && ctrTool.canExecute()) {
                        CTRToolPath.setText(ctrTool.getAbsolutePath());

                        if (ctrTool.exists() && ctrTool.canExecute()) {
                            CTRTool.execute(ctrTool, new File(KeysetFileField.getText()));
                        } else {
                            showMessageDialog(this, "Provided CTRTool file doesn't exist or cannot be executed!", "Invalid File", ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                File ctrTool = new File(CTRToolPath.getText());

                if (ctrTool.exists() && ctrTool.canExecute()) {
                    CTRTool.execute(ctrTool, new File(KeysetFileField.getText()));
                } else {
                    showMessageDialog(this, "Provided CTRTool file doesn't exist or cannot be executed!", "Invalid File", ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ExecuteActionPerformed

    private void ShowLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLogActionPerformed
        if (ShowLog.isSelected()) {
            main.Main.log.setVisible(true);
        } else {
            main.Main.log.dispose();
        }
    }//GEN-LAST:event_ShowLogActionPerformed

    private void ChangeCTRToolFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeCTRToolFilePathActionPerformed
        FileFilter exe = new FileNameExtensionFilter("Exe Files", "exe");

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open CTRTool Program");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(exe);

        if (storedCTRToolPath != null) {
            if (new File(storedCTRToolPath).exists()) {
                fileChooser.setSelectedFile(new File(storedCTRToolPath));
            }
        }

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File ctrTool = fileChooser.getSelectedFile();

            if (ctrTool.exists() && ctrTool.canExecute()) {
                CTRToolPath.setText(ctrTool.getAbsolutePath());
                storedCTRToolPath = ctrTool.getAbsolutePath();
            } else {
                showMessageDialog(this, "Provided CTRTool file doesn't exist or cannot be executed!", "Invalid File", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ChangeCTRToolFilePathActionPerformed

    private void ShowChangelogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowChangelogActionPerformed
        if (ShowChangelog.isSelected()) {
            changelog = new Changelog();
            changelog.setVisible(true);
        } else {
            changelog.dispose();
        }
    }//GEN-LAST:event_ShowChangelogActionPerformed

    private void VersionLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VersionLabelMouseReleased
        switch (count) {
            case 0:
                changelog = new Changelog();
                changelog.setVisible(true);
                ShowChangelog.setSelected(true);
                count = 1;
                break;

            case 1:
                changelog.dispose();
                ShowChangelog.setSelected(false);
                count = 0;
                break;
        }
    }//GEN-LAST:event_VersionLabelMouseReleased

    private void TargetFileFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TargetFileFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (TargetFileField.getText().equals("<debug>")) {
                if (d1 == 1 && d2 == 1) {
                    loadDebugValues();
                }
            }
        }
    }//GEN-LAST:event_TargetFileFieldKeyPressed

    private void SpecifyLZSSOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyLZSSOutputFileActionPerformed
        if (SpecifyLZSSOutputFile.isSelected()) {
            BrowseLZZOutputFile.setEnabled(true);
            LZSSOutputFileField.setEnabled(true);
        } else {
            LZSSOutputFileField.setText("");
            BrowseLZZOutputFile.setEnabled(false);
            LZSSOutputFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyLZSSOutputFileActionPerformed

    private void BrowseLZZOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseLZZOutputFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            LZSSOutputFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseLZZOutputFileActionPerformed

    private void SpecifyExtendedHeaderFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyExtendedHeaderFileActionPerformed
        if (SpecifyExtendedHeaderFile.isSelected()) {
            BrowseExtendedHeaderFile.setEnabled(true);
            ExtendedHeaderFileField.setEnabled(true);
        } else {
            ExtendedHeaderFileField.setText("");
            BrowseExtendedHeaderFile.setEnabled(false);
            ExtendedHeaderFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyExtendedHeaderFileActionPerformed

    private void BrowseExtendedHeaderFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseExtendedHeaderFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            ExtendedHeaderFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseExtendedHeaderFileActionPerformed

    private void BrowseLogoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseLogoFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            LogoFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseLogoFileActionPerformed

    private void SpecifyLogoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyLogoFileActionPerformed
        if (SpecifyLogoFile.isSelected()) {
            BrowseLogoFile.setEnabled(true);
            LogoFileField.setEnabled(true);
        } else {
            LogoFileField.setText("");
            BrowseLogoFile.setEnabled(false);
            LogoFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyLogoFileActionPerformed

    private void BrowsePlainRegionFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowsePlainRegionFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            PlainRegionFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowsePlainRegionFileActionPerformed

    private void SpecifyPlainRegionFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyPlainRegionFileActionPerformed
        if (SpecifyPlainRegionFile.isSelected()) {
            BrowsePlainRegionFile.setEnabled(true);
            PlainRegionFileField.setEnabled(true);
        } else {
            PlainRegionFileField.setText("");
            BrowsePlainRegionFile.setEnabled(false);
            PlainRegionFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyPlainRegionFileActionPerformed

    private void SpecifyExeFSFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyExeFSFileActionPerformed
        if (SpecifyExeFSFile.isSelected()) {
            BrowseExeFSFile.setEnabled(true);
            ExeFSFileField.setEnabled(true);
        } else {
            ExeFSFileField.setText("");
            BrowseExeFSFile.setEnabled(false);
            ExeFSFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyExeFSFileActionPerformed

    private void BrowseExeFSFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseExeFSFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            ExeFSFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseExeFSFileActionPerformed

    private void SpecifyExeFSDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyExeFSDirectoryActionPerformed
        if (SpecifyExeFSDirectory.isSelected()) {
            BrowseExeFSDirectory.setEnabled(true);
            ExeFSDirectoryField.setEnabled(true);
        } else {
            ExeFSDirectoryField.setText("");
            BrowseExeFSDirectory.setEnabled(false);
            ExeFSDirectoryField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyExeFSDirectoryActionPerformed

    private void BrowseExeFSDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseExeFSDirectoryActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            ExeFSDirectoryField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseExeFSDirectoryActionPerformed

    private void SpecifyRomFSFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyRomFSFileActionPerformed
        if (SpecifyRomFSFile.isSelected()) {
            BrowseRomFSFile.setEnabled(true);
            RomFSFileField.setEnabled(true);
        } else {
            RomFSFileField.setText("");
            BrowseRomFSFile.setEnabled(false);
            RomFSFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyRomFSFileActionPerformed

    private void BrowseRomFSFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseRomFSFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            RomFSFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseRomFSFileActionPerformed

    private void SpecifyRomFSDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyRomFSDirectoryActionPerformed
        if (SpecifyRomFSDirectory.isSelected()) {
            BrowseRomFSDirectory.setEnabled(true);
            RomFSDirectoryField.setEnabled(true);
            ListFilesInRomFS.setEnabled(true);
        } else {
            RomFSDirectoryField.setText("");
            BrowseRomFSDirectory.setEnabled(false);
            RomFSDirectoryField.setEnabled(false);
            ListFilesInRomFS.setSelected(false);
            ListFilesInRomFS.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyRomFSDirectoryActionPerformed

    private void BrowseRomFSDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseRomFSDirectoryActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            RomFSDirectoryField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseRomFSDirectoryActionPerformed

    private void SpecifyFirmDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyFirmDirectoryActionPerformed
        if (SpecifyFirmDirectory.isSelected()) {
            BrowseFirmDirectory.setEnabled(true);
            FirmDirectoryField.setEnabled(true);
        } else {
            FirmDirectoryField.setText("");
            BrowseFirmDirectory.setEnabled(false);
            FirmDirectoryField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyFirmDirectoryActionPerformed

    private void BrowseFirmDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFirmDirectoryActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            FirmDirectoryField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseFirmDirectoryActionPerformed

    private void SpecifyWavOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyWavOutputFileActionPerformed
        if (SpecifyWavOutputFile.isSelected()) {
            BrowseWaveOutputFile.setEnabled(true);
            WavOutputFileField.setEnabled(true);
        } else {
            WavOutputFileField.setText("");
            BrowseWaveOutputFile.setEnabled(false);
            WavOutputFileField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyWavOutputFileActionPerformed

    private void BrowseWaveOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseWaveOutputFileActionPerformed
        FileFilter wav = new FileNameExtensionFilter("Wave files", "wav");

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(wav);
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            WavOutputFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseWaveOutputFileActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        new Thread() {
            @Override
            public void run() {
                try {
                    String git = "https://github.com/dylwedma11748/CTRTool-GUI/releases";
                    URL github = new URL(git);
                    URLConnection connection = github.openConnection();
                    InputStreamReader reader = new InputStreamReader(connection.getInputStream());

                    try (BufferedReader bReader = new BufferedReader(reader)) {
                        String line;

                        while ((line = bReader.readLine()) != null) {
                            if (line.contains("<a href=\"/dylwedma11748/CTRTool-GUI/releases")) {
                                String latestVersion = line.substring(line.indexOf(">") + 1, line.lastIndexOf("<"));
                                String versionNumber = latestVersion.substring(latestVersion.indexOf("v") + 1);
                                String currentVersion = VersionLabel.getText();
                                float latestVersionFloat = Float.valueOf(versionNumber);
                                float currentVersionFloat = Float.valueOf(currentVersion.substring(currentVersion.indexOf("v") + 1));

                                if (currentVersionFloat < latestVersionFloat) {
                                    int downloadUpdate = showOptionDialog(null, "A new update has been released. Download Now?", "CTRTool GUI Update", YES_NO_OPTION, INFORMATION_MESSAGE, null, null, null);

                                    if (downloadUpdate == YES_OPTION) {
                                        FileFilter jar = new FileNameExtensionFilter("Jar files", "jar");

                                        JFileChooser chooser = new JFileChooser();
                                        chooser.setDialogTitle("Save file as");
                                        chooser.setAcceptAllFileFilterUsed(false);
                                        chooser.addChoosableFileFilter(jar);

                                        int returnValue = chooser.showSaveDialog(null);

                                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                                            String downloadURL = git + "/download/" + latestVersionFloat + "/CTRToolGUI.jar";
                                            URL download = new URL(downloadURL);

                                            try (BufferedInputStream bis = new BufferedInputStream(download.openStream()); FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile())) {
                                                byte[] buffer = new byte[1024];
                                                int bytes;

                                                while ((bytes = bis.read(buffer, 0, 1024)) != -1) {
                                                    fos.write(buffer, 0, bytes);
                                                }

                                                showMessageDialog(null, "Download Complete", "CTRTool GUI Update", INFORMATION_MESSAGE);
                                            }
                                        }
                                    }
                                } else if (latestVersionFloat < currentVersionFloat || currentVersionFloat == latestVersionFloat) {
                                    showMessageDialog(null, "You are using the latest version", "CTRTool GUI Update", INFORMATION_MESSAGE);
                                }

                                break;
                            }
                        }
                    }
                } catch (MalformedURLException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    showMessageDialog(null, "Unable to proceed with update", "MalformedURLException", ERROR_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    showMessageDialog(null, "Unable to proceed with update", "IOException", ERROR_MESSAGE);
                }
            }
        }.start();
    }//GEN-LAST:event_UpdateActionPerformed

    private void SpecifyNCCHPartitionIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyNCCHPartitionIndexActionPerformed
        if (SpecifyNCCHPartitionIndex.isSelected()) {
            NCCHPartitionIndexField.setEnabled(true);
        } else {
            NCCHPartitionIndexField.setText("");
            NCCHPartitionIndexField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyNCCHPartitionIndexActionPerformed

    private void SpecifyWavLoopCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyWavLoopCountActionPerformed
        if (SpecifyWavLoopCount.isSelected()) {
            WavLoopCountField.setEnabled(true);
        } else {
            WavLoopCountField.setText("");
            WavLoopCountField.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyWavLoopCountActionPerformed

    private void DownloadLatestCTRToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadLatestCTRToolActionPerformed
        FileFilter zip = new FileNameExtensionFilter("ZIP Archive", "zip");

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save file as");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(zip);

        int returnValue = chooser.showSaveDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String downloadURL = "https://github.com/profi200/Project_CTR/releases/download/0.15/makerom_015_ctrtool.zip";

            try {
                URL download = new URL(downloadURL);

                try (BufferedInputStream bis = new BufferedInputStream(download.openStream()); FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile())) {
                    byte[] buffer = new byte[1024];
                    int bytes;

                    while ((bytes = bis.read(buffer, 0, 1024)) != -1) {
                        fos.write(buffer, 0, bytes);
                    }

                    showMessageDialog(null, "Download Complete", "Download CTRTool", INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    showMessageDialog(null, "Unable to proceed with download", "IOException", ERROR_MESSAGE);
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                showMessageDialog(null, "Unable to proceed with download", "MalformedURLException", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DownloadLatestCTRToolActionPerformed

    private void loadDebugValues() {
        showMessageDialog(null, "Debug Mode is disabled on offical releases", "Debug Mode", ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseCertificateChainFile;
    private javax.swing.JButton BrowseContentsFile;
    private javax.swing.JButton BrowseExeFSDirectory;
    private javax.swing.JButton BrowseExeFSFile;
    private javax.swing.JButton BrowseExtendedHeaderFile;
    private javax.swing.JButton BrowseFirmDirectory;
    private javax.swing.JButton BrowseKeysetFile;
    private javax.swing.JButton BrowseLZZOutputFile;
    private javax.swing.JButton BrowseLogoFile;
    private javax.swing.JButton BrowseMetaFile;
    private javax.swing.JButton BrowsePlainRegionFile;
    private javax.swing.JButton BrowseRomFSDirectory;
    private javax.swing.JButton BrowseRomFSFile;
    private javax.swing.JButton BrowseTMDFile;
    private javax.swing.JButton BrowseTargetFile;
    private javax.swing.JButton BrowseTicketFile;
    private javax.swing.JButton BrowseWaveOutputFile;
    private javax.swing.JLayeredPane CIA;
    private javax.swing.JPanel CIAPanel;
    public static javax.swing.JLabel CTRToolPath;
    private javax.swing.JLabel CTRToolPathLabel;
    private javax.swing.JLayeredPane CWAV;
    private javax.swing.JPanel CWAVPanel;
    private javax.swing.JLayeredPane CXICII;
    private javax.swing.JPanel CXICIIPanel;
    public static javax.swing.JFormattedTextField CertificateChainFileField;
    private javax.swing.JMenuItem ChangeCTRToolFilePath;
    public static javax.swing.JFormattedTextField ContentsFileField;
    public static javax.swing.JCheckBox DecompressCodeSection;
    private javax.swing.JMenuItem DownloadLatestCTRTool;
    private javax.swing.JLayeredPane EXEFS;
    private javax.swing.JPanel EXEFSPanel;
    public static javax.swing.JFormattedTextField ExeFSDirectoryField;
    public static javax.swing.JFormattedTextField ExeFSFileField;
    private javax.swing.JButton Execute;
    public static javax.swing.JFormattedTextField ExtendedHeaderFileField;
    public static javax.swing.JCheckBox ExtractWithoutDecrypting;
    private javax.swing.JLayeredPane FIRM;
    private javax.swing.JPanel FIRMPanel;
    private javax.swing.JMenu File;
    public static javax.swing.JFormattedTextField FirmDirectoryField;
    private javax.swing.JMenu Help;
    public static javax.swing.JLabel InputFileTypeLabel;
    public static javax.swing.JCheckBox KeepRawData;
    public static javax.swing.JFormattedTextField KeysetFileField;
    private javax.swing.JLabel KeysetFileLabel;
    private javax.swing.JLayeredPane LZSS;
    public static javax.swing.JFormattedTextField LZSSOutputFileField;
    private javax.swing.JPanel LZSSPanel;
    public static javax.swing.JCheckBox ListFilesInRomFS;
    public static javax.swing.JFormattedTextField LogoFileField;
    private javax.swing.JMenuBar MenuBar;
    public static javax.swing.JFormattedTextField MetaFileField;
    public static javax.swing.JFormattedTextField NCCHPartitionIndexField;
    private javax.swing.JTabbedPane OptionsPane;
    public static javax.swing.JFormattedTextField PlainRegionFileField;
    public static javax.swing.JFormattedTextField RomFSDirectoryField;
    public static javax.swing.JFormattedTextField RomFSFileField;
    public static javax.swing.JCheckBoxMenuItem ShowChangelog;
    public static javax.swing.JCheckBoxMenuItem ShowLog;
    public static javax.swing.JCheckBox SpecifyCertificateChainFile;
    public static javax.swing.JCheckBox SpecifyContentsFile;
    public static javax.swing.JCheckBox SpecifyExeFSDirectory;
    public static javax.swing.JCheckBox SpecifyExeFSFile;
    public static javax.swing.JCheckBox SpecifyExtendedHeaderFile;
    public static javax.swing.JCheckBox SpecifyFirmDirectory;
    public static javax.swing.JCheckBox SpecifyKeysetFile;
    public static javax.swing.JCheckBox SpecifyLZSSOutputFile;
    public static javax.swing.JCheckBox SpecifyLogoFile;
    public static javax.swing.JCheckBox SpecifyMetaFile;
    public static javax.swing.JCheckBox SpecifyNCCHPartitionIndex;
    public static javax.swing.JCheckBox SpecifyPlainRegionFile;
    public static javax.swing.JCheckBox SpecifyRomFSDirectory;
    public static javax.swing.JCheckBox SpecifyRomFSFile;
    public static javax.swing.JCheckBox SpecifyTMDFile;
    public static javax.swing.JCheckBox SpecifyTicketFile;
    public static javax.swing.JCheckBox SpecifyWavLoopCount;
    public static javax.swing.JCheckBox SpecifyWavOutputFile;
    public static javax.swing.JFormattedTextField TMDFileField;
    public static javax.swing.JFormattedTextField TargetFileField;
    private javax.swing.JLabel TargetFileLabel;
    public static javax.swing.JFormattedTextField TicketFileField;
    private javax.swing.JMenu Tools;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JMenuItem Update;
    private javax.swing.JLabel VersionLabel;
    public static javax.swing.JFormattedTextField WavLoopCountField;
    public static javax.swing.JFormattedTextField WavOutputFileField;
    // End of variables declaration//GEN-END:variables
}
