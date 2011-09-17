/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JSpeccyKeyboard.java
 *
 * Created on 11-mar-2010, 20:00:24
 */

package gui;

import javax.swing.JFrame;

/**
 *
 * @author jsanchez
 */
public class JSpeccyKeyboard extends javax.swing.JPanel {

    JFrame window;

    JSpeccyKeyboard(JFrame myWindow) {
        window = myWindow;
    }
    /** Creates new form JSpeccyKeyboard */
    public JSpeccyKeyboard() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        closeWindow = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Spectkey.png"))); // NOI18N
        add(jLabel1, java.awt.BorderLayout.CENTER);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/Bundle"); // NOI18N
        closeWindow.setText(bundle.getString("CLOSE")); // NOI18N
        closeWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowActionPerformed(evt);
            }
        });
        add(closeWindow, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowActionPerformed
        // TODO add your handling code here:
        window.setVisible(false);
    }//GEN-LAST:event_closeWindowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeWindow;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}