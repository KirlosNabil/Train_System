package trainsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;



public class AdminOptionsPage extends javax.swing.JFrame {

    Admin admin = new Admin();
    public AdminOptionsPage(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ManageTripsBTN = new javax.swing.JButton();
        ManageTrainsBTN = new javax.swing.JButton();
        UpdateAdminPasswordBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageTripsBTN.setBackground(new java.awt.Color(0, 0, 0));
        ManageTripsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ManageTripsBTN.setForeground(new java.awt.Color(255, 255, 255));
        ManageTripsBTN.setText("Manage Trips");
        ManageTripsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTripsBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ManageTripsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 202, 60));

        ManageTrainsBTN.setBackground(new java.awt.Color(0, 0, 0));
        ManageTrainsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ManageTrainsBTN.setForeground(new java.awt.Color(255, 255, 255));
        ManageTrainsBTN.setText("Manage Trains");
        ManageTrainsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTrainsBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ManageTrainsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 202, 64));

        UpdateAdminPasswordBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdateAdminPasswordBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateAdminPasswordBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdateAdminPasswordBTN.setText("Change Password");
        UpdateAdminPasswordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAdminPasswordBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateAdminPasswordBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 202, 63));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 200, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageTripsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTripsBTNActionPerformed
        new ManageTrips(admin).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ManageTripsBTNActionPerformed

    private void ManageTrainsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTrainsBTNActionPerformed
        new ManageTrains(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ManageTrainsBTNActionPerformed

    private void UpdateAdminPasswordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAdminPasswordBTNActionPerformed
        new ChangeAdminPassword(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UpdateAdminPasswordBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new SystemReport(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminOptionsPage(admin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageTrainsBTN;
    private javax.swing.JButton ManageTripsBTN;
    private javax.swing.JButton UpdateAdminPasswordBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
