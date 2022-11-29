
package securesafeguardsystem;

import java.awt.Frame;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static securesafeguardsystem.ActiveUser.active;

public class ImageViewer extends javax.swing.JFrame {
    public ImageViewer() {
        initComponents();
      
        jLabel1.setText("");
        int len;
        //EncryptImage I = new EncryptImage();
        len = EncryptImage.labelclikedname.length();
        int last = EncryptImage.labelclikedname.lastIndexOf(".");
        String filename = EncryptImage.labelclikedname.substring(0,last);
        System.out.println("filename: "+filename);
        
        File enc = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Images\\"+filename+".encrypted");
        System.out.println("Active user: "+active[0]);
        File dec = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\img\\"+filename);
        String key = "Mary has one cat";
        try
        {
            CryptoUtils.decrypt(key, enc, dec);
        }
        catch (CryptoException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex,"Exception",JOptionPane.ERROR_MESSAGE);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // To Resize the Image so that it is fit in JLabel;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\securedsafeguardsystem\\"+active[0]+"\\img\\"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
        Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        
        jLabel1.setIcon(imageIcon);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
