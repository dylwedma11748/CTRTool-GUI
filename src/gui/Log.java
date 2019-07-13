package gui;

import javax.swing.JFrame;

public class Log extends JFrame {

    public Log() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLabel = new javax.swing.JLabel();
        LogScrollPane = new javax.swing.JScrollPane();
        Log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Log");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("Log");
        getContentPane().add(TopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 20));

        Log.setEditable(false);
        Log.setColumns(20);
        Log.setRows(5);
        LogScrollPane.setViewportView(Log);

        getContentPane().add(LogScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 920, 300));

        setSize(new java.awt.Dimension(970, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GUI.ShowLog.setSelected(false);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Log;
    private javax.swing.JScrollPane LogScrollPane;
    private javax.swing.JLabel TopLabel;
    // End of variables declaration//GEN-END:variables
}
