
package securesafeguardsystem;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import static securesafeguardsystem.ActiveUser.active;

public class EncryptVideo extends javax.swing.JFrame {

    public EncryptVideo() {
        initComponents();
        images1();
    }
    void images1()
    {
        System.out.println("Images function run");
        File F = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Videos");
		
		name = F.list();
		for(String n:name)
		{
                    B1[i] = new StringBuffer(n);
                    
                    while(j<=n.length())
                    {    
                        B1[i].insert(j,"<br>");
                        j+=15;
                    }
                    B2[i] = new StringBuffer("<html>"+B1[i]+"</html>");
                    System.out.println("Images function runn"+B2[i]);
                    L[i] = new JLabel(""+B2[i],SwingConstants.CENTER);
                    L[i].setSize(300, 100);
                    L[i].setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\vlc_96px.png"));
                    L[i].setVerticalTextPosition(JLabel.BOTTOM);
                    //L[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    
                    L[i].setHorizontalTextPosition(JLabel.CENTER);
                     Border border = BorderFactory.createLineBorder(Color.BLACK);
                    L[i].setBorder(border);
                    L[i].setOpaque(true);
                    L[i].setBackground(new java.awt.Color(204,204,255));
                    L[i].addMouseListener(new PoppupTriggerListener());
                    jPanel2.add(L[i]);
                    
                    i++;
                   
                    j=0;
                   
		}
    }
     class PoppupTriggerListener extends MouseAdapter 
{
      public void mousePressed(MouseEvent ev) 
      {
        if (ev.isPopupTrigger()) 
        {
            
          labelclikedname=""+((JLabel)ev.getSource()).getText();
          String st = labelclikedname.replaceAll("<br>","");
          labelclikedname= st.replace("<html>","").replace("</html>","");
          
          
          popmenu.show(ev.getComponent(), ev.getX(), ev.getY());
          
          
        }
      }

      public void mouseReleased(MouseEvent ev) 
      {
         labelclikedname=""+((JLabel)ev.getSource()).getText();
          String st = labelclikedname.replaceAll("<br>","");
          labelclikedname= st.replace("<html>","").replace("</html>","");
        if (ev.isPopupTrigger()) 
        {
          
          popmenu.show(ev.getComponent(), ev.getX(), ev.getY());
          
          
        }
      }

      public void mouseClicked(MouseEvent ev) 
      {
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenu = new javax.swing.JPopupMenu();
        decrypt = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        openvideo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        decrypt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        decrypt.setText("Decrypt");
        decrypt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });
        popmenu.add(decrypt);

        delete.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popmenu.add(delete);

        openvideo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        openvideo.setText("Open");
        openvideo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        openvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openvideoActionPerformed(evt);
            }
        });
        popmenu.add(openvideo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Secured Safe");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guard System");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_________________");

        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_new_48px.png"))); // NOI18N
        jButton1.setText(" Add Video");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go_back_30px.png"))); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton)
                .addGap(100, 100, 100)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(122, 72, 180));
        jPanel2.add(jScrollPane1);

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        JFileChooser file1 = new JFileChooser();
        file1.setAcceptAllFileFilterUsed(false);
        file1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter extFilter1 = new FileNameExtensionFilter("Video Files", "m4v","mpeg","avi","mkv","mp4");
        //FileNameExtensionFilter extFilter2 = new FileNameExtensionFilter("Video Files", "mp4 ");
        file1.addChoosableFileFilter(extFilter1);
        //file1.addChoosableFileFilter(extFilter2);
        file1.showOpenDialog(null);
        
    // Code for Image ENcryption
        
        String str =""+file1.getSelectedFile();//Jchooser image file path with name
        File inputFile = new File(str);
        Test T = new Test();
        String newPath="" ;
        // spit String str so that only file name can get "pratik.mp4" 
        int len = str.length();
        int last = str.lastIndexOf("\\");
        String filename = str.substring(last+1); // pratik.mp4
       
        try
        {
            newPath = T.move(str); //cut copy paste the file
        }
        catch (IOException ex) 
        {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);  
            JOptionPane.showMessageDialog(jPanel2,ex,"Exception!!!",JOptionPane.ERROR_MESSAGE);
        
        }
        
        File newinputFile = new File(newPath);
        File encryptedFile = new File(newPath+".encrypted");
         
        try 
        {
            CryptoUtils.encrypt(key, newinputFile, encryptedFile);
            newinputFile.delete();// to delete the moved image file in Folder
            //CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        }
        catch (CryptoException ex) 
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(jPanel2,ex,"Exception!!!",JOptionPane.ERROR_MESSAGE);
        } 
        catch(NegativeArraySizeException ex)
        {
            JOptionPane.showMessageDialog(jPanel2,"Size is Too Big to Encrypt","Exception!!!",JOptionPane.ERROR_MESSAGE);
        }
        catch (InvalidKeyException ex) 
        {
            Logger.getLogger(EncryptImage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(jPanel2,"Invalid Key"," Exception!!!",JOptionPane.ERROR_MESSAGE);
        }
        //count++;
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
        
        int len = labelclikedname.length();
        int last = labelclikedname.lastIndexOf(".");
        String filename = labelclikedname.substring(0,last);
        
        JOptionPane.showMessageDialog(jPanel2,"Decrypt Click"+labelclikedname,"Decrypt",JOptionPane.INFORMATION_MESSAGE);
        File enc = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Videos\\"+labelclikedname);
        File dec = new File("C:\\Users\\Admin\\Desktop\\New folder\\"+filename);
       
        try {
            CryptoUtils.decrypt(key, enc, dec);
            enc.delete();
        } catch (CryptoException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(EncryptVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_decryptActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jPanel2,"Delete Click "+labelclikedname,"Delete",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void openvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openvideoActionPerformed
        File enc = new File("C:\\securedsafeguardsystem\\"+active[0]+"\\Videos\\"+labelclikedname);
        
    }//GEN-LAST:event_openvideoActionPerformed
   /* public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EncryptVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptVideo().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JMenuItem decrypt;
    private javax.swing.JMenuItem delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem openvideo;
    private javax.swing.JPopupMenu popmenu;
    // End of variables declaration//GEN-END:variables
    JLabel[] L = new JLabel[8];
    String[] name;
    int i=0;
    String labelclikedname="";
    int j=0;
    StringBuffer B1[] = new StringBuffer[8];
    StringBuffer B2[] = new StringBuffer[8];
    String key = "Mary has one cat";
}
