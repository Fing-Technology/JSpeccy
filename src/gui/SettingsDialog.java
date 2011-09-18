/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SettingsDialog.java
 *
 * Created on 03-sep-2010, 16:42:01
 */

package gui;

import configuration.*;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

/**
 *
 * @author jsanchez
 */
public class SettingsDialog extends javax.swing.JPanel {

    private JSpeccySettingsType settings;
    private JDialog settingsDialog;

    /** Creates new form SettingsDialog */
    public SettingsDialog(JSpeccySettingsType userSettings) {
        initComponents();
        settings = userSettings;
    }

    private void updateUserSettings() {

        if (settings.getSpectrumSettings().isULAplus()) {
            jCheckBox1.setSelected(true);
        }

        if (settings.getSpectrumSettings().isIssue2()) {
            jCheckBox2.setSelected(true);
        }
    }

    public boolean showDialog(Component parent, String title) {
        Frame owner = null;
        if (parent instanceof Frame) {
            owner = (Frame) parent;
        } else {
            owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);
        }

        if (settingsDialog == null || settingsDialog.getOwner() != owner) {
            owner = null;
            settingsDialog = new JDialog(owner, true);
            settingsDialog.getContentPane().add(this);
            settingsDialog.pack();
        }

        updateUserSettings();
        settingsDialog.setTitle(title);
        settingsDialog.setVisible(true);
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("ULAplus support");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, java.awt.BorderLayout.CENTER);

        jCheckBox2.setText("Issue 2 Keyboard");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            settings.getSpectrumSettings().setULAplus(true);
        } else {
            settings.getSpectrumSettings().setULAplus(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            settings.getSpectrumSettings().setIssue2(true);
        } else {
            settings.getSpectrumSettings().setIssue2(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        settingsDialog.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    // End of variables declaration//GEN-END:variables

}
