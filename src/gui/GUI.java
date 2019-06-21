package gui;

import ctr.CTRTool;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame 
{
    public GUI() 
    {
        initComponents();
    }
    
    private boolean executed = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLabel = new javax.swing.JLabel();
        TargetFileField = new javax.swing.JFormattedTextField();
        TargetFileLabel = new javax.swing.JLabel();
        BrowseTargetFile = new javax.swing.JButton();
        Execute = new javax.swing.JButton();
        Extract = new javax.swing.JCheckBox();
        ExtractWithoutDecrypting = new javax.swing.JCheckBox();
        KeepRawData = new javax.swing.JCheckBox();
        SpecifyKeysetFile = new javax.swing.JCheckBox();
        FileTypeLabel = new javax.swing.JLabel();
        KeysetFileField = new javax.swing.JFormattedTextField();
        BrowseKeysetFile = new javax.swing.JButton();
        KeysetFileLabel = new javax.swing.JLabel();
        SpecifyCertificateChainFile = new javax.swing.JCheckBox();
        CertificateChainFileField = new javax.swing.JFormattedTextField();
        BrowseCertificateChainFile = new javax.swing.JButton();
        SpecifyTicketFile = new javax.swing.JCheckBox();
        TicketFileField = new javax.swing.JFormattedTextField();
        BrowseTicketFile = new javax.swing.JButton();
        CTRToolPathLabel = new javax.swing.JLabel();
        CTRToolPath = new javax.swing.JLabel();
        SpecifyTMDFile = new javax.swing.JCheckBox();
        TMDFileField = new javax.swing.JFormattedTextField();
        BrowseTMDFile = new javax.swing.JButton();
        SpecifyContentsFile = new javax.swing.JCheckBox();
        ContentsFileField = new javax.swing.JFormattedTextField();
        BrowseContentsFile = new javax.swing.JButton();
        SpecifyMetaFile = new javax.swing.JCheckBox();
        MetaFileField = new javax.swing.JFormattedTextField();
        BrowseMetaFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CTRTool GUI");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("CTRTool GUI by Dylan Wedman");
        getContentPane().add(TopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 20));
        getContentPane().add(TargetFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 750, -1));

        TargetFileLabel.setText("Target File:");
        getContentPane().add(TargetFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        BrowseTargetFile.setText("Browse");
        BrowseTargetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTargetFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseTargetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        Execute.setText("Execute");
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });
        getContentPane().add(Execute, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 80, -1));

        Extract.setText("Extract");
        Extract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtractActionPerformed(evt);
            }
        });
        getContentPane().add(Extract, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ExtractWithoutDecrypting.setText("Extract Data Without Decrypting");
        ExtractWithoutDecrypting.setEnabled(false);
        getContentPane().add(ExtractWithoutDecrypting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        KeepRawData.setText("Keep Raw Data (Don't Unpack)");
        getContentPane().add(KeepRawData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        SpecifyKeysetFile.setText("Specify Keyset File");
        SpecifyKeysetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyKeysetFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyKeysetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        FileTypeLabel.setText("File Type: CIA");
        getContentPane().add(FileTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        KeysetFileField.setEnabled(false);
        getContentPane().add(KeysetFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 750, -1));

        BrowseKeysetFile.setText("Browse");
        BrowseKeysetFile.setEnabled(false);
        BrowseKeysetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseKeysetFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseKeysetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        KeysetFileLabel.setText("Keyset File:");
        getContentPane().add(KeysetFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        SpecifyCertificateChainFile.setText("Specify Certificate Chain File");
        SpecifyCertificateChainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyCertificateChainFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyCertificateChainFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 40, 170, -1));

        CertificateChainFileField.setEnabled(false);
        getContentPane().add(CertificateChainFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 160, -1));

        BrowseCertificateChainFile.setText("Browse");
        BrowseCertificateChainFile.setEnabled(false);
        BrowseCertificateChainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseCertificateChainFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseCertificateChainFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        SpecifyTicketFile.setText("Specify Ticket File");
        SpecifyTicketFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyTicketFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyTicketFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 110, -1));

        TicketFileField.setEnabled(false);
        getContentPane().add(TicketFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 160, -1));

        BrowseTicketFile.setText("Browse");
        BrowseTicketFile.setEnabled(false);
        BrowseTicketFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTicketFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseTicketFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        CTRToolPathLabel.setText("CTRTool Path:");
        getContentPane().add(CTRToolPathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        CTRToolPath.setText(" ");
        getContentPane().add(CTRToolPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 850, -1));

        SpecifyTMDFile.setText("Specify TMD File");
        SpecifyTMDFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyTMDFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyTMDFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        TMDFileField.setEnabled(false);
        getContentPane().add(TMDFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 190, 160, -1));

        BrowseTMDFile.setText("Browse");
        BrowseTMDFile.setEnabled(false);
        BrowseTMDFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseTMDFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseTMDFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        SpecifyContentsFile.setText("Specify Contents File");
        SpecifyContentsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyContentsFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyContentsFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 130, -1));

        ContentsFileField.setEnabled(false);
        getContentPane().add(ContentsFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 160, -1));

        BrowseContentsFile.setText("Browse");
        BrowseContentsFile.setEnabled(false);
        BrowseContentsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseContentsFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseContentsFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        SpecifyMetaFile.setText("Specify Meta File");
        SpecifyMetaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecifyMetaFileActionPerformed(evt);
            }
        });
        getContentPane().add(SpecifyMetaFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        MetaFileField.setEnabled(false);
        getContentPane().add(MetaFileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 160, -1));

        BrowseMetaFile.setText("Browse");
        BrowseMetaFile.setEnabled(false);
        BrowseMetaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseMetaFileActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseMetaFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        setSize(new java.awt.Dimension(970, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseTargetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTargetFileActionPerformed
        FileFilter cia = new FileNameExtensionFilter("Cia Files", "cia");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(cia);
        
        int returnValue = fileChooser.showOpenDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            TargetFileField.setText("\"" + filePath + "\"");
        }
    }//GEN-LAST:event_BrowseTargetFileActionPerformed

    private void ExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtractActionPerformed
        if(Extract.isSelected())
        {
            ExtractWithoutDecrypting.setEnabled(true);
        }
        
        else
        {
            ExtractWithoutDecrypting.setSelected(false);
            ExtractWithoutDecrypting.setEnabled(false);
        }
    }//GEN-LAST:event_ExtractActionPerformed

    private void SpecifyKeysetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyKeysetFileActionPerformed
        if(SpecifyKeysetFile.isSelected())
        {
            KeysetFileField.setEnabled(true);
            BrowseKeysetFile.setEnabled(true);
        }
        
        else
        {
            KeysetFileField.setText("");
            KeysetFileField.setEnabled(false);
            BrowseKeysetFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyKeysetFileActionPerformed

    private void SpecifyCertificateChainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyCertificateChainFileActionPerformed
        if(SpecifyCertificateChainFile.isSelected())
        {
            CertificateChainFileField.setEnabled(true);
            BrowseCertificateChainFile.setEnabled(true);
        }
        
        else
        {
            CertificateChainFileField.setText("");
            CertificateChainFileField.setEnabled(false);
            BrowseCertificateChainFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyCertificateChainFileActionPerformed

    private void SpecifyTicketFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyTicketFileActionPerformed
        if(SpecifyTicketFile.isSelected())
        {
            TicketFileField.setEnabled(true);
            BrowseTicketFile.setEnabled(true);
        }

        else
        {
            TicketFileField.setText("");
            TicketFileField.setEnabled(false);
            BrowseTicketFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyTicketFileActionPerformed

    private void SpecifyTMDFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyTMDFileActionPerformed
        if(SpecifyTMDFile.isSelected())
        {
            TMDFileField.setEnabled(true);
            BrowseTMDFile.setEnabled(true);
        }
        
        else
        {
            TMDFileField.setText("");
            TMDFileField.setEnabled(false);
            BrowseTMDFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyTMDFileActionPerformed

    private void SpecifyContentsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyContentsFileActionPerformed
        if(SpecifyContentsFile.isSelected())
        {
            ContentsFileField.setEnabled(true);
            BrowseContentsFile.setEnabled(true);
        }
        
        else
        {
            ContentsFileField.setText("");
            ContentsFileField.setEnabled(false);
            BrowseContentsFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyContentsFileActionPerformed

    private void SpecifyMetaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecifyMetaFileActionPerformed
        if(SpecifyMetaFile.isSelected())
        {
            MetaFileField.setEnabled(true);
            BrowseMetaFile.setEnabled(true);
        }
        
        else
        {
            MetaFileField.setText("");
            MetaFileField.setEnabled(false);
            BrowseMetaFile.setEnabled(false);
        }
    }//GEN-LAST:event_SpecifyMetaFileActionPerformed

    private void BrowseCertificateChainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseCertificateChainFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        
        int returnValue = fileChooser.showSaveDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            CertificateChainFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseCertificateChainFileActionPerformed

    private void BrowseTicketFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTicketFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        
        int returnValue = fileChooser.showSaveDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            TicketFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseTicketFileActionPerformed

    private void BrowseTMDFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseTMDFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        
        int returnValue = fileChooser.showSaveDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            TMDFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseTMDFileActionPerformed

    private void BrowseContentsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseContentsFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        
        int returnValue = fileChooser.showSaveDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            ContentsFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseContentsFileActionPerformed

    private void BrowseMetaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseMetaFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose File");
        fileChooser.setAcceptAllFileFilterUsed(true);
        
        int returnValue = fileChooser.showSaveDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
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
        
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            KeysetFileField.setText("\"" + path + "\"");
        }
    }//GEN-LAST:event_BrowseKeysetFileActionPerformed

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        if(executed != true)
        {
            FileFilter exe = new FileNameExtensionFilter("Exe Files", "exe");
        
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Open CTRTool Program");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(exe);
        
            int returnValue = fileChooser.showOpenDialog(null);
        
            if(returnValue == JFileChooser.APPROVE_OPTION)
            {
                File ctrTool = fileChooser.getSelectedFile();
                CTRToolPath.setText(ctrTool.getAbsolutePath());
                CTRTool.execute(ctrTool);
                executed = true;
            }
        }
        
        else
        {
            File ctrTool = new File(CTRToolPath.getText());
            CTRTool.execute(ctrTool);
        }
    }//GEN-LAST:event_ExecuteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseCertificateChainFile;
    private javax.swing.JButton BrowseContentsFile;
    private javax.swing.JButton BrowseKeysetFile;
    private javax.swing.JButton BrowseMetaFile;
    private javax.swing.JButton BrowseTMDFile;
    private javax.swing.JButton BrowseTargetFile;
    private javax.swing.JButton BrowseTicketFile;
    public static javax.swing.JLabel CTRToolPath;
    private javax.swing.JLabel CTRToolPathLabel;
    public static javax.swing.JFormattedTextField CertificateChainFileField;
    public static javax.swing.JFormattedTextField ContentsFileField;
    private javax.swing.JButton Execute;
    public static javax.swing.JCheckBox Extract;
    public static javax.swing.JCheckBox ExtractWithoutDecrypting;
    private javax.swing.JLabel FileTypeLabel;
    public static javax.swing.JCheckBox KeepRawData;
    public static javax.swing.JFormattedTextField KeysetFileField;
    private javax.swing.JLabel KeysetFileLabel;
    public static javax.swing.JFormattedTextField MetaFileField;
    public static javax.swing.JCheckBox SpecifyCertificateChainFile;
    public static javax.swing.JCheckBox SpecifyContentsFile;
    public static javax.swing.JCheckBox SpecifyKeysetFile;
    public static javax.swing.JCheckBox SpecifyMetaFile;
    public static javax.swing.JCheckBox SpecifyTMDFile;
    public static javax.swing.JCheckBox SpecifyTicketFile;
    public static javax.swing.JFormattedTextField TMDFileField;
    public static javax.swing.JFormattedTextField TargetFileField;
    private javax.swing.JLabel TargetFileLabel;
    public static javax.swing.JFormattedTextField TicketFileField;
    private javax.swing.JLabel TopLabel;
    // End of variables declaration//GEN-END:variables
}