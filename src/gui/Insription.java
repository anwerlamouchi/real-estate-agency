/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.classes.*;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.User;

import exception.AdminException;

import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author anwer
 */
public class Insription extends javax.swing.JFrame {

    /**
     * Creates new form Insription
     * 
     * 
     * 
     */
    public Insription() {
        initComponents();
    }
        private static boolean isValideTel(String Tel)
{
	if( Tel!=null && Tel.trim().length()>0 )
		return Tel.matches("[+]+[[0-9]{3}|[0-9]{2}]+[0-9]{2}+[0-9]{3}+[0-9]{3}?");
	return false;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TfPrenom = new javax.swing.JTextField();
        TfLogin = new javax.swing.JTextField();
        TfAdr = new javax.swing.JTextField();
        TfEmail = new javax.swing.JTextField();
        TfTel = new javax.swing.JTextField();
        TfNom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmdValiderInscri = new javax.swing.JButton();
        motDePasse2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        TfMP1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 1200));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nom");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 43, 18);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Prénom");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 63, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Téléphone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 90, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Adresse Postal");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 170, 100, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 140, 60, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText(" Retaper mot de passe");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 270, 140, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Login");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 200, 60, 20);

        TfPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfPrenomActionPerformed(evt);
            }
        });
        jPanel1.add(TfPrenom);
        TfPrenom.setBounds(170, 70, 120, 20);

        TfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfLoginActionPerformed(evt);
            }
        });
        jPanel1.add(TfLogin);
        TfLogin.setBounds(170, 200, 120, 20);

        TfAdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfAdrActionPerformed(evt);
            }
        });
        jPanel1.add(TfAdr);
        TfAdr.setBounds(170, 170, 120, 20);

        TfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEmailActionPerformed(evt);
            }
        });
        jPanel1.add(TfEmail);
        TfEmail.setBounds(170, 140, 120, 20);

        TfTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfTelActionPerformed(evt);
            }
        });
        jPanel1.add(TfTel);
        TfTel.setBounds(170, 100, 120, 20);

        TfNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomActionPerformed(evt);
            }
        });
        jPanel1.add(TfNom);
        TfNom.setBounds(170, 40, 120, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Inscrivez Vous !");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 50, 230, 40);

        cmdValiderInscri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdValiderInscri.setText("Valider");
        cmdValiderInscri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdValiderInscriMouseClicked(evt);
            }
        });
        cmdValiderInscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValiderInscriActionPerformed(evt);
            }
        });
        jPanel1.add(cmdValiderInscri);
        cmdValiderInscri.setBounds(500, 250, 100, 30);

        motDePasse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motDePasse2ActionPerformed(evt);
            }
        });
        jPanel1.add(motDePasse2);
        motDePasse2.setBounds(170, 270, 120, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Mot de passe");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 240, 100, 17);
        jPanel1.add(TfMP1);
        TfMP1.setBounds(170, 240, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNomActionPerformed

    private void TfTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfTelActionPerformed

    private void TfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEmailActionPerformed

    private void TfAdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfAdrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfAdrActionPerformed

    private void TfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfLoginActionPerformed

    private void TfPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfPrenomActionPerformed

    private void cmdValiderInscriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdValiderInscriMouseClicked
              // TODO add your handling code here:
               
    }//GEN-LAST:event_cmdValiderInscriMouseClicked

    private void cmdValiderInscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValiderInscriActionPerformed

       
            
               String EMAIL ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
              String nom="^[a-zA-Z]+$";
              String prenom="^[a-zA-Z]+$";
              
              
          User user=new User();
          user.setPrenom(TfPrenom.getText().toString());
        user.setNom(TfNom.getText().toString());
        user.setEmail(TfEmail.getText().toString());
          Pattern pattern = Pattern.compile(EMAIL);
         Matcher matcher = pattern.matcher(user.getEmail());
          Pattern pattern1 = Pattern.compile(nom);
         Matcher matcher1 = pattern1.matcher(user.getNom());
           Pattern pattern2 = Pattern.compile(prenom);
         Matcher matcher2 = pattern2.matcher(user.getPrenom());
         
    user.setTelephone(TfTel.getText());
        user.setPass(TfMP1.getText().toString());
        user.setAdresse(TfAdr.getText().toString());
        user.setTelephone(TfTel.getText());
     
         user.setLogin(TfLogin.getText().toString());
        
        String motdepasse2 = motDePasse2.getText().toString();
        
        
       ClientDAO admindao = ClientDAO.getInstance() ;
       
        

        try {

            if (user.getNom().equals("")) {
                throw new AdminException("svp ! tapez votre nom");
            }
              if (!matcher1.matches()) {
                       throw new AdminException("tapez  un    nom  valide svp");
                   }
            
            if (user.getNom().length() > 30) {
                throw new AdminException("nom est trop long");
            }
            if (user.getPrenom().equals("")) {

                throw new AdminException("Tapez votre Prenom svp ");
            }
              if (!matcher2.matches()) {
                       throw new AdminException("tapez un prenom valide svp");
                   }
            if (user.getPrenom().length() > 30) {
                throw new AdminException("prenom est trop long");
            }
            if (user.getTelephone().equals("")) {

                throw new AdminException("Tapez votre Telephone svp ");
            }
             if (isValideTel(user.getTelephone()) == false) {
          throw new AdminException( "Veuillez saisir votre numéro de télèphone correctement !");}
            if (user.getTelephone().length() > 30) {
                throw new AdminException("Telephone est trop long");
            }
            if (user.getEmail().equals("")) {

                throw new AdminException("Tapez votre Emailsvp ");
            }
             if (!matcher.matches()) {
                       throw new AdminException("tapez  une adresse  email valide svp");
                   }
            if (user.getEmail().length() > 30) {
                throw new AdminException("Email est trop long");
            }
             if (user.getAdresse().equals("")) {

                throw new AdminException("Tapez votre Adresse svp ");
            }
            if (user.getAdresse().length() > 30) {
                throw new AdminException("Adresse est trop long");
            }
            
             if (user.getLogin().equals("")) {
                throw new AdminException("tapez votre Login de passe svp ");
            }
            if (user.getLogin().length() > 30) {
                throw new AdminException("login est trop long");
            }
              if (user.getPass().equals("")) {
                throw new AdminException("tapez votre mot de passe svp ");
            }
            if (user.getPass().length() > 30) {
                throw new AdminException("mot de passe  est trop long");
            }
           
            if (motdepasse2.equals("")) {
                throw new AdminException("retapez votre  mot de passe svp ");
            }
            if (!motdepasse2.equals(user.getPass())) {
                throw new AdminException(" les deux mot de passe ne sont pas identique");
            }
            
            admindao.ajoutClient(user);
            JOptionPane.showMessageDialog(null, "client ajouter", "OK", JOptionPane.OK_CANCEL_OPTION);
            cmdValiderInscri.setEnabled(true);//ouis chager false
         
        } catch (AdminException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
                   
              
  

    }//GEN-LAST:event_cmdValiderInscriActionPerformed

    private void motDePasse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motDePasse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motDePasse2ActionPerformed

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
            java.util.logging.Logger.getLogger(Insription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
               
                new Insription().setVisible(true);
                 } catch (ParseException ex) {
                    Logger.getLogger(Insription.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Insription.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfAdr;
    private javax.swing.JTextField TfEmail;
    private javax.swing.JTextField TfLogin;
    private javax.swing.JPasswordField TfMP1;
    private javax.swing.JTextField TfNom;
    private javax.swing.JTextField TfPrenom;
    private javax.swing.JTextField TfTel;
    private javax.swing.JButton cmdValiderInscri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField motDePasse2;
    // End of variables declaration//GEN-END:variables
}
