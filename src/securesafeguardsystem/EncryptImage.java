/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securesafeguardsystem;

import java.awt.Color;
import java.awt.Label;
import static java.awt.SystemColor.menu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EncryptImage extends javax.swing.JFrame implements ActiveUser {


    public EncryptImage() {
        initComponents();
        
        
        
        images();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenu = new javax.swing.JPopupMenu();
        decrypt = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        softname1 = new javax.swing.JLabel();
        addImage = new javax.swing.JButton();
        countlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        popmenu.setBackground(new java.awt.Color(153, 153, 255));
        popmenu.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        popmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        decrypt.setBackground(new java.awt.Color(153, 153, 255));
        decrypt.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });
        popmenu.add(decrypt);

        delete.setBackground(new java.awt.Color(153, 153, 255));
        delete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popmenu.add(delete);

        open.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        popmenu.add(open);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1300, 773));
        setSize(new java.awt.Dimension(1000, 700));

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(54, 33, 79));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("________________");

        softname1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        softname1.setForeground(new java.awt.Color(255, 255, 255));
        softname1.setText(" Secured safe");

        addImage.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        addImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_new_30px.png"))); // NOI18N
        addImage.setText("Add Image");
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        countlabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guard System");

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go_back_30px.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(softname1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(countlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(addImage)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(softname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(addImage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(countlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        JOptionPane.showMessageDialog(mainPanel,"Decrypt Is Clicked "+labelclikedname,"Decrypt",JOptionPane.INFORMATION_MESSAGE);
        int len = labelclikedname.length();
        int last = labelclikedname.lastIndexOf(".");
        
        String filename = labelclikedname.substring(0,last);
        //int st = filename.lastIndexOf(".");
        //String f = filename.substring(0,st);
        
        File enc = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Images\\"+filename+".encrypted");
        File thumbfile = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Thumb\\"+labelclikedname);
        File dec = new File("C:\\Users\\Pankaj\\Desktop\\"+filename);
       // System.out.println("New File name: "+f);
       System.out.println("New File name: "+filename);
       
        try {
            CryptoUtils.decrypt(key, enc, dec);
            enc.delete();
            thumbfile.delete();
            mainPanel.repaint();
        } catch (CryptoException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(mainPanel,ex,"Exception",JOptionPane.ERROR_MESSAGE);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_decryptActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int len = labelclikedname.length();
        int last = labelclikedname.lastIndexOf(".");
        String filename = labelclikedname.substring(0,last);
        File enc = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Images\\"+filename+".encrypted");
        File thumbfile = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Thumb\\"+labelclikedname);
        enc.delete();
        thumbfile.delete();
        JOptionPane.showMessageDialog(mainPanel,"Delete Is Clicked "+labelclikedname,"Delete",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteActionPerformed

    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg","png");
        file.addChoosableFileFilter(extFilter);
        file.showOpenDialog(null);
       
        mainPanel.repaint();
        // Code for Image ENcryption
        
        
        String str =""+file.getSelectedFile();//Jchooser image file path with name
        File inputFile = new File(str);
        Test T = new Test();
        String newPath="" ;
        String oldActualPath = str;
        // spit String str so that only file name can get "pratik.jpg" 
        int len = str.length();
        int last = str.lastIndexOf("\\");
        String onlypath=str.substring(0,last);
        String filename = str.substring(last+1);
        
        try
        {
            new ImageThumbnail().saveScaledImage(str,"C:\\securedsafeguardsystem\\"+active[0]+"\\Thumb\\"+filename+".jpg");
            newPath = T.move(str);
            
            T.copyFileUsingStream(new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Black\\Black.jpg"),new File(str));
        }
        catch(IOException E)
        {
            System.out.println("Exception in Test"+E);
        }
        File newinputFile = new File(newPath);

        File encryptedFile = new File(newPath+".encrypted");
         
        try 
        {
            CryptoUtils.encrypt(key, newinputFile, encryptedFile);
            newinputFile.delete();// to delete the moved image file in Folder
            //CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
            mainPanel.repaint();
        }
        catch (CryptoException ex) 
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(mainPanel,ex,"Exception!!!",JOptionPane.ERROR_MESSAGE);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(EncryptImage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(mainPanel,"Invalid Key ","Exception!!!",JOptionPane.ERROR_MESSAGE);
        }
        catch(NegativeArraySizeException ex)
        {
            JOptionPane.showMessageDialog(mainPanel,"Size is Too Big to Encrypt","Exception!!!",JOptionPane.ERROR_MESSAGE);
        }
        count++;
        mainPanel.repaint();
        countlabel.setText(""+count);
    }//GEN-LAST:event_addImageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
            ImageViewer Img = new ImageViewer();
            Img.setVisible(true);
            Img.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
    }//GEN-LAST:event_openActionPerformed

    /*THIS Function is used to display the image thumbnail on the frame  */
    void images()
    {
        System.out.println("Images function run");
        File F = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Thumb");
		
		name = F.list();
		for(String n:name)
		{
                    System.out.println("Images function runn"+n);
                    L[i] = new JLabel(""+n);
                    L[i].setIcon(new ImageIcon("C:\\securedsafeguardsystem\\"+active[0]+"\\Thumb\\"+n));
                    L[i].setVerticalTextPosition(JLabel.BOTTOM);
                    L[i].setHorizontalTextPosition(JLabel.CENTER);
                     Border border = BorderFactory.createLineBorder(Color.BLACK);
                    L[i].setBorder(border);
                    L[i].setOpaque(true);
                    L[i].setBackground(new java.awt.Color(204,204,255));
                    L[i].addMouseListener(new PopupTriggerListener());
                    mainPanel.add(L[i]);
                    mainPanel.repaint();
                    i++;
                   
		}
    }
    
    class PopupTriggerListener extends MouseAdapter 
{
      public void mousePressed(MouseEvent ev) 
      {
        if (ev.isPopupTrigger()) 
        {
            
            labelclikedname=""+((JLabel)ev.getSource()).getText();
          popmenu.show(ev.getComponent(), ev.getX(), ev.getY());
          
          
        }
      }

      public void mouseReleased(MouseEvent ev) 
      {
        labelclikedname=""+((JLabel)ev.getSource()).getText();
        if (ev.isPopupTrigger()) 
        {
          
          popmenu.show(ev.getComponent(), ev.getX(), ev.getY());
          
          
        }
      }

      public void mouseClicked(MouseEvent ev) 
      {
      }
    }
   /*public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new EncryptImage().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImage;
    private javax.swing.JLabel countlabel;
    private javax.swing.JMenuItem decrypt;
    private javax.swing.JMenuItem delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem open;
    private javax.swing.JPopupMenu popmenu;
    private javax.swing.JLabel softname1;
    // End of variables declaration//GEN-END:variables
    String[] name;
    
    public static String labelclikedname="";
    JLabel L[]= new JLabel[10];
    int count=0;
    int i=0;
    String key = "Mary has one cat";
}

  
