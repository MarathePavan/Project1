
package securesafeguardsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.media.*;
import java.net.*;

public class VideoPlayer extends javax.swing.JFrame 
{
    static Player mp4Player = null;
    public VideoPlayer() 
    {
        super("Demo JMF");
        this.setTitle("VideoViewer");
        
        
        initComponents();
        play();
        Component panelControl = mp4Player.getControlPanelComponent();
        Component visualComponent = mp4Player.getVisualComponent();
        this.getContentPane().add(panelControl, BorderLayout.WEST);
        this.getContentPane().add(visualComponent, BorderLayout.CENTER);
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
        stop();
        System.exit(0);
        }});
        this.pack();
        this.setSize(new Dimension(1080, 720));
        this.setVisible(true);
    }
    void play()
    {
        try 
        {
            URL url = new URL("file",null,"C:\\Users\\Admin\\Desktop\\New folder\\po.au");
            mp4Player = Manager.createRealizedPlayer(url);
            mp4Player.start();
        }
        catch (Exception e)
        {
        System.out.println("unable to play :" + e);
        }
    }
    void stop()
    {
        mp4Player.stop();
        mp4Player.close();
    }

       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
