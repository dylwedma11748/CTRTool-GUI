package gui;

import javax.swing.JFrame;

public class Changelog extends JFrame {

    public Changelog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLabel = new javax.swing.JLabel();
        ChangelogScrollPane = new javax.swing.JScrollPane();
        Changelog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Changelog");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("Changelog");
        getContentPane().add(TopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 20));

        Changelog.setEditable(false);
        Changelog.setColumns(20);
        Changelog.setRows(5);
        Changelog.setText("v1.2\nAdded support for NSCD files.\nAdded support for NCCH files.\nAdded support for exheader files.\nAdded support for LZSS files.\nAdded support for firm files.\nAdded support for cwav files.\nAdded support for ExeFS files.\nAdded support for RomFS files.\nAdded an update checker.\nAdded the ability to download CTRTool from directly from this program.\nAdded a Tabbed Pane with the new options for the new file formats.\nThe file type for the target file is now shown on the Main GUI.\nFixed incorrect command line arguments from previous release.\nUpdated file checking system.\nCTRTool file chooser now goes to the last selected file if already set.\nMinor bug fixes.\n\nv1.1\nAdded Version Number on Main GUI.\nAdded Changelog GUI.\nLog no longer shows up on it's own.\nAdded Menu Bar on Main GUI.\nAdded \"Show Log\", \"Show Changelog\", and \"Change CTRTool File Path\" buttons to the Menu Bar.\nAdded the ability to set the CTRTool file path before executing as well as changing it.\nAdded simple checks for the Target, Keyset, and CTRTool Program files to see if they exist.\nRemoved \"Extract\" option from the Main GUI as it's the default action in CTRTool.\nMinor bug fixes.\n\nv1.0\nInitial Release");
        ChangelogScrollPane.setViewportView(Changelog);

        getContentPane().add(ChangelogScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 920, 300));

        setSize(new java.awt.Dimension(970, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GUI.ShowChangelog.setSelected(false);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Changelog;
    private javax.swing.JScrollPane ChangelogScrollPane;
    private javax.swing.JLabel TopLabel;
    // End of variables declaration//GEN-END:variables
}
