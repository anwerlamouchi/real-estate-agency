/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import DAO.classes.ClientDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;

import entities.User;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import technique.DataSource;

import technique.TableClient;


/**
 *
 * @author anwer
 */
public class GestionCompteClient extends javax.swing.JFrame {

    /**
     * Creates new form SuperAdmin
     */
    

 
 
    public void update(){
//      String requete = "select * from administrateur";
//            PreparedStatement ps;
//        try {
//            ps = MyConnection.getInstance().prepareStatement(requete);
//            ResultSet result = ps.executeQuery();
           JTab_admin.setModel(new TableClient());
//        } catch (SQLException ex) {
//            Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
    
    
    }
    
    
    public GestionCompteClient() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jB_modifier = new javax.swing.JButton();
        jB_ajouter = new javax.swing.JButton();
        jB_suuprimer = new javax.swing.JButton();
        jB_clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTab_admin = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTF_prenom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTF_password = new javax.swing.JTextField();
        jTF_nom = new javax.swing.JTextField();
        jTF_telephone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jTF_postal = new javax.swing.JTextField();
        jTF_login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jtf_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(857, 593));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jB_modifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_modifier.setText("Modifier");
        jB_modifier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modifierActionPerformed(evt);
            }
        });
        jPanel2.add(jB_modifier);
        jB_modifier.setBounds(10, 40, 90, 21);

        jB_ajouter.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_ajouter.setText("Ajouter");
        jB_ajouter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ajouterActionPerformed(evt);
            }
        });
        jPanel2.add(jB_ajouter);
        jB_ajouter.setBounds(10, 10, 90, 20);

        jB_suuprimer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_suuprimer.setText("Supprimer");
        jB_suuprimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_suuprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_suuprimerActionPerformed(evt);
            }
        });
        jPanel2.add(jB_suuprimer);
        jB_suuprimer.setBounds(10, 70, 90, 21);

        jB_clear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_clear.setText("vider");
        jB_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearActionPerformed(evt);
            }
        });
        jPanel2.add(jB_clear);
        jB_clear.setBounds(10, 100, 90, 21);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 110, 140);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        JTab_admin.setModel(new TableClient());
        JTab_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTab_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTab_admin);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 570, 110);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Nom");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 40, 70, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Prénom");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 70, 49, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("EmailL");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 130, 50, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Login");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 190, 34, 14);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Password");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 220, 70, 14);
        jPanel4.add(jTF_prenom);
        jTF_prenom.setBounds(110, 70, 100, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Téléphone");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 100, 70, 14);
        jPanel4.add(jTF_password);
        jTF_password.setBounds(110, 220, 100, 20);
        jPanel4.add(jTF_nom);
        jTF_nom.setBounds(110, 40, 100, 20);
        jPanel4.add(jTF_telephone);
        jTF_telephone.setBounds(110, 100, 100, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Adresse Postal");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, 160, 90, 14);
        jPanel4.add(jTF_email);
        jTF_email.setBounds(110, 130, 100, 20);
        jPanel4.add(jTF_postal);
        jTF_postal.setBounds(110, 160, 100, 20);
        jPanel4.add(jTF_login);
        jTF_login.setBounds(110, 190, 100, 20);

        jLabel2.setText("Id");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 10, 34, 14);
        jPanel4.add(Jtf_id);
        Jtf_id.setBounds(110, 10, 100, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Client information");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Gestion compte Gerant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gestion de compte Client");
        jButton2.setPreferredSize(new java.awt.Dimension(143, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mon compte ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Visualiser statistique ");
        jButton4.setPreferredSize(new java.awt.Dimension(143, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Commande");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ajouterActionPerformed
        // TODO add your handling code here:
      
     
      User client=new  User(WIDTH,jTF_nom.getText() , jTF_prenom.getText(), jTF_telephone.getText(), jTF_email.getText(), jTF_postal.getText(), jTF_login.getText(), jTF_password.getText(),"client");
        ClientDAO clientDAO= ClientDAO.getInstance();
        clientDAO.ajoutClient(client);
        JOptionPane.showMessageDialog(this, " vous avez ajouter un client!!");
        update();

        //JTab_admin.jB_ajouter(new Object[]{});
    }//GEN-LAST:event_jB_ajouterActionPerformed

    private void jB_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearActionPerformed
        // TODO add your handling code here:
        Jtf_id.setText("");
        jTF_nom.setText("");       
        jTF_prenom.setText("");
        jTF_telephone.setText("");
        jTF_email.setText("");
        jTF_postal.setText("");
         jTF_login.setText("");
         jTF_password.setText("");
        
                
    }//GEN-LAST:event_jB_clearActionPerformed

    private void JTab_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTab_adminMouseClicked
        // TODO add your handling code here:
         int row =  JTab_admin.getSelectedRow();
        System.out.println(""+row);
        //int id =(int) (jTable1.getValueAt(row, 0));
        String nom =( JTab_admin.getValueAt(row, 1).toString());
        String prenom =( JTab_admin.getValueAt(row, 2).toString());
        String telphone =( JTab_admin.getValueAt(row, 3).toString());
        String email =( JTab_admin.getValueAt(row, 4).toString());
        String adresse =( JTab_admin.getValueAt(row, 5).toString());
        String login =( JTab_admin.getValueAt(row, 6).toString());
        String password =( JTab_admin.getValueAt(row, 6).toString());
       Jtf_id.setText(( JTab_admin.getValueAt(row, 0).toString()));
      jTF_nom.setText(nom);
     jTF_prenom.setText(prenom);
      jTF_telephone.setText(telphone);
     jTF_email.setText(email);
     jTF_postal.setText(adresse);
    jTF_login.setText(login);
     jTF_password.setText(password);
    }//GEN-LAST:event_JTab_adminMouseClicked

    private void jB_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_modifierActionPerformed
        // TODO add your handling code here:
        try {
            String value1=Jtf_id.getText();
             String value2=jTF_nom.getText();
              String value3=jTF_prenom.getText();
               String value4=jTF_telephone.getText();
                String value5=jTF_email.getText();
                String value6=jTF_postal.getText(); 
                 String value7=jTF_login.getText();
                  String value8=jTF_password.getText();
                  
                  String requete="UPDATE  `data`.`user` SET  `prenom` =  '"+value3+"',\n" +
"`nom` =  '"+value2+"',\n" +
"`email` =  '"+value5+"',\n" +
"`telephone` =  '"+value4+"',\n" +
"`adresse` =  '"+value6+"',\n" +
"`login` =  '"+value7+"',\n" +
"`pass` =  '"+value8+"' WHERE  `user`.`Id` ='"+value1+"';";
            PreparedStatement ps =  DataSource.getInstance().prepareStatement(requete);
            ps.executeUpdate();
              JOptionPane.showMessageDialog(this, "Vous avez modifier un client!!");
            
        } catch (SQLException | HeadlessException e) {
        }
        update();
    }//GEN-LAST:event_jB_modifierActionPerformed

    private void jB_suuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_suuprimerActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "vous voulez le supprimer ","delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String value1=Jtf_id.getText();
                
           String requete="DELETE FROM `user` WHERE  `user`.`Id` ='"+value1+"';";
            PreparedStatement ps =  DataSource.getInstance().prepareStatement(requete);
               ps.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Vous avez supprimer un client!!");
            } catch (SQLException ex) {
                Logger.getLogger(GestionCompteClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        update();
    }//GEN-LAST:event_jB_suuprimerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GestionCompteGerant admin=new  GestionCompteGerant();
          admin.setVisible(true);
        this.setVisible(false);
        pack();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//      compteAdmin_principale admin=new compteAdmin_principale();
//          admin.setVisible(true);
//        this.setVisible(false);
//        pack();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       Chart admin=new Chart();
          admin.setVisible(true);
        this.setVisible(false);
        pack();
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         GestionCompteClient admin=new GestionCompteClient();
          admin.setVisible(true);
        this.setVisible(false);
        pack();
         
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    } catch (ParseException ex) {
                        Logger.getLogger(GestionCompteClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(GestionCompteClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                new GestionCompteClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTab_admin;
    private javax.swing.JTextField Jtf_id;
    private javax.swing.JButton jB_ajouter;
    private javax.swing.JButton jB_clear;
    private javax.swing.JButton jB_modifier;
    private javax.swing.JButton jB_suuprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_email;
    private javax.swing.JTextField jTF_login;
    private javax.swing.JTextField jTF_nom;
    private javax.swing.JTextField jTF_password;
    private javax.swing.JTextField jTF_postal;
    private javax.swing.JTextField jTF_prenom;
    private javax.swing.JTextField jTF_telephone;
    // End of variables declaration//GEN-END:variables
}