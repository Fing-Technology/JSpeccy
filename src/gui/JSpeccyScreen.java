/*
 * JScreen.java
 *
 * Created on 15 de enero de 2008, 12:50
 */
package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import machine.Spectrum;

/**
 *
 * @author  jsanchez
 */
public class JSpeccyScreen extends javax.swing.JComponent {

    private BufferedImage tvImage;
    private AffineTransform escala;
    private AffineTransformOp escalaOp;
    private RenderingHints renderHints;
    private boolean doubleSize;

    /** Creates new form JScreen */
    public JSpeccyScreen() {
        initComponents();

        escala = AffineTransform.getScaleInstance(2.0f, 2.0f);
        renderHints = new RenderingHints(RenderingHints.KEY_INTERPOLATION,
            RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        renderHints.put(RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_SPEED);
        renderHints.put(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_OFF);
        renderHints.put(RenderingHints.KEY_COLOR_RENDERING,
            RenderingHints.VALUE_COLOR_RENDER_SPEED);
        escalaOp = new AffineTransformOp(escala, renderHints);

        setMaximumSize(new java.awt.Dimension(Spectrum.SCREEN_WIDTH * 2,
            Spectrum.SCREEN_HEIGHT * 2));
        setMinimumSize(new java.awt.Dimension(Spectrum.SCREEN_WIDTH,
            Spectrum.SCREEN_HEIGHT));
        setPreferredSize(new java.awt.Dimension(Spectrum.SCREEN_WIDTH,
            Spectrum.SCREEN_HEIGHT));
    }

    public void setTvImage(BufferedImage bImage) {
        tvImage = bImage;
    }

    public void setDoubleSize(boolean doubled) {
        doubleSize = doubled;
        if (doubleSize) {
            this.setPreferredSize(new Dimension(Spectrum.SCREEN_WIDTH * 2,
                Spectrum.SCREEN_HEIGHT * 2));
        } else {
            this.setPreferredSize(new Dimension(Spectrum.SCREEN_WIDTH,
                Spectrum.SCREEN_HEIGHT));
        }
    }

    public boolean isDoubleSized() {
        return doubleSize;
    }

    @Override
    public void paintComponent(Graphics gc) {
        //super.paintComponent(gc);
        Graphics2D gc2 = (Graphics2D) gc;

        if (doubleSize) {
            gc2.drawImage(tvImage, escalaOp, 0, 0);
//            gc2.drawImage(tvImage, 0, 0, Spectrum.SCREEN_WIDTH * 2,
//                    Spectrum.SCREEN_HEIGHT * 2, null);
        } else {
            gc2.drawImage(tvImage, 0, 0, null);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setDoubleBuffered(false);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
