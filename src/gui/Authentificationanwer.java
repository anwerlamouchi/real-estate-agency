/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import DAO.classes.*; 


import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.User;
import entities.User;



import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import technique.DataSource;

/**
 *
 * @author anwer
 */
public class Authentificationanwer extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    Statement ste;
    DataSource cnx;


    public Authentificationanwer() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Bt_connexion = new javax.swing.JButton();
        TFLOGIN = new javax.swing.JTextField();
        TFPASS = new javax.swing.JPasswordField();
        jLab_login = new javax.swing.JLabel();
        jLab_mdp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_inscrire = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Type d'utilisateur");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setMinimumSize(new java.awt.Dimension(554, 299));

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 768));
        jPanel1.setLayout(null);

        Bt_connexion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Bt_connexion.setText("Connexion");
        Bt_connexion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt_connexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_connexionMouseClicked(evt);
            }
        });
        Bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_connexionActionPerformed(evt);
            }
        });
        jPanel1.add(Bt_connexion);
        Bt_connexion.setBounds(340, 225, 110, 30);
        jPanel1.add(TFLOGIN);
        TFLOGIN.setBounds(340, 150, 140, 30);
        jPanel1.add(TFPASS);
        TFPASS.setBounds(340, 190, 140, 30);

        jLab_login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLab_login.setText("Login");
        jPanel1.add(jLab_login);
        jLab_login.setBounds(210, 160, 90, 20);

        jLab_mdp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLab_mdp.setText("Mot de passe");
        jPanel1.add(jLab_mdp);
        jLab_mdp.setBounds(210, 200, 90, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Si vous n'avez pas de compte, veuillez s'inscrire");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 270, 270, 20);

        bt_inscrire.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_inscrire.setText("S'inscrire");
        bt_inscrire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_inscrireMouseClicked(evt);
            }
        });
        bt_inscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inscrireActionPerformed(evt);
            }
        });
        jPanel1.add(bt_inscrire);
        bt_inscrire.setBounds(340, 260, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_connexionActionPerformed
 
        User user =new User();
     AdministrateurDAO  aO= AdministrateurDAO.getInstance();
        user =aO.finduserByLogin(TFLOGIN.getText());
        if(user != null){
        if(user.getRole().equals("client")){
            if (user.getPass().equals(TFPASS.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                Client c=new Client();
                c.setVisible(true);
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        }
        if(user.getRole().equals("gerant")){
        
        if (user.getPass().equals(TFPASS.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                
               
             
                        
                
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        
        }  if(user.getRole().equals("administrateur")){
        
        if (user.getPass().equals(TFPASS.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                Admin a=new Admin();
                a.setVisible(true);
                
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        }}
        else {    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);
        }
        
        
    }//GEN-LAST:event_Bt_connexionActionPerformed

    private void bt_inscrireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_inscrireMouseClicked

        //fais laison ici
//        ins = new Insription();
//        ins.setVisible(true);
//        this.setVisible(false);
//        pack();
//        
//    
        
    }//GEN-LAST:event_bt_inscrireMouseClicked

    private void bt_inscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inscrireActionPerformed
  
    }//GEN-LAST:event_bt_inscrireActionPerformed

    private void Bt_connexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_connexionMouseClicked
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_Bt_connexionMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentificationanwer .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentificationanwer .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentificationanwer .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentificationanwer .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    try {
                        new Authentificationanwer().setVisible(true);
                    } catch (Exception ex) {
                        Logger.getLogger(Authentificationanwer .class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (        UnsupportedLookAndFeelException | ParseException ex) {
                    Logger.getLogger(Authentificationanwer .class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_connexion;
    private javax.swing.JTextField TFLOGIN;
    private javax.swing.JPasswordField TFPASS;
    private javax.swing.JButton bt_inscrire;
    private javax.swing.JLabel jLab_login;
    private javax.swing.JLabel jLab_mdp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
