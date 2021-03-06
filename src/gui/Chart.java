/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import java.text.ParseException;
import  java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author anwer
 */
public class Chart extends javax.swing.JFrame {

    /**
     * Creates new form Chart
     */
 private void clock(){
 
 
Calendar cal=new GregorianCalendar();
int day=cal.get(Calendar.DAY_OF_MONTH);
 int mont=cal.get(Calendar.MONTH);
 int month=mont+1;
 int year =cal.get(Calendar.YEAR);
 int seconde=cal.get(Calendar.SECOND);
 int minute=cal.get(Calendar.MINUTE);
 int heure =cal.get(Calendar.HOUR);
 Lab_date.setText("Date :"+day+"/"+month+"/"+year);
 
 
 }
 
 
    public Chart() {
        initComponents();
        clock();
         
        
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
        jPanel2 = new javax.swing.JPanel();
        jBt_backChart = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jB_availability = new javax.swing.JButton();
        jB_percentage = new javax.swing.JButton();
        jB_scorebar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCBox_selectPramter = new javax.swing.JComboBox();
        jB_ok = new javax.swing.JButton();
        Lab_date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("graph of the particular parameter");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 100, 180, 20);

        jPanel2.setLayout(null);

        jBt_backChart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBt_backChart.setForeground(new java.awt.Color(255, 255, 255));
        jBt_backChart.setText("Back");
        jBt_backChart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBt_backChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBt_backChartMouseClicked(evt);
            }
        });
        jBt_backChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_backChartActionPerformed(evt);
            }
        });
        jPanel2.add(jBt_backChart);
        jBt_backChart.setBounds(0, 0, 100, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 110, 40);

        jPanel3.setLayout(null);

        jB_availability.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_availability.setText("Availability bar chart");
        jB_availability.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jB_availability);
        jB_availability.setBounds(10, 12, 220, 21);

        jB_percentage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_percentage.setText("Availability percentage  bar");
        jB_percentage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jB_percentage);
        jB_percentage.setBounds(10, 59, 220, 21);

        jB_scorebar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_scorebar.setText("Availability score  bar");
        jB_scorebar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_scorebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_scorebarActionPerformed(evt);
            }
        });
        jPanel3.add(jB_scorebar);
        jB_scorebar.setBounds(10, 110, 220, 21);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 90, 240, 150);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jCBox_selectPramter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCBox_selectPramter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Paramter", "User", "Offer", "Administrator", "" }));
        jPanel4.add(jCBox_selectPramter);
        jCBox_selectPramter.setBounds(30, 20, 130, 21);

        jB_ok.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_ok.setForeground(new java.awt.Color(255, 255, 255));
        jB_ok.setText("OK");
        jPanel4.add(jB_ok);
        jB_ok.setBounds(60, 60, 80, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(330, 120, 210, 120);

        Lab_date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Lab_date.setForeground(new java.awt.Color(0, 0, 102));
        Lab_date.setText("Date");
        jPanel1.add(Lab_date);
        Lab_date.setBounds(460, 10, 110, 14);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 20, 10, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt_backChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_backChartActionPerformed
        // TODO add your handling code here:
//        compteAdmin a=new compteAdmin();
//        a.setVisible(true);
//        this.setVisible(false); 
    }//GEN-LAST:event_jBt_backChartActionPerformed

    private void jB_scorebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_scorebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_scorebarActionPerformed

    private void jBt_backChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt_backChartMouseClicked
        // TODO add your handling code here:
        // SuperAdmin ins = new SuperAdmin();
       // ins.setVisible(true);
        this.setVisible(false);
        pack();
    }//GEN-LAST:event_jBt_backChartMouseClicked

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
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    } catch (ParseException ex) {
                        Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Chart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lab_date;
    private javax.swing.JButton jB_availability;
    private javax.swing.JButton jB_ok;
    private javax.swing.JButton jB_percentage;
    private javax.swing.JButton jB_scorebar;
    private javax.swing.JButton jBt_backChart;
    private javax.swing.JComboBox jCBox_selectPramter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
