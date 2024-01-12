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

public class ManageTrains extends javax.swing.JFrame
{


    Admin admin = new Admin();
    public ManageTrains(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddTrainAdminBTN = new javax.swing.JButton();
        UpdateTrainAdminBTN = new javax.swing.JButton();
        RemoveTrainAdminBTN = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddTrainAdminBTN.setBackground(new java.awt.Color(0, 0, 0));
        AddTrainAdminBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddTrainAdminBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddTrainAdminBTN.setText("Add Train");
        AddTrainAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainAdminBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AddTrainAdminBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 208, 50));

        UpdateTrainAdminBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdateTrainAdminBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateTrainAdminBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdateTrainAdminBTN.setText("Update Train");
        UpdateTrainAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTrainAdminBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateTrainAdminBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 208, 50));

        RemoveTrainAdminBTN.setBackground(new java.awt.Color(0, 0, 0));
        RemoveTrainAdminBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RemoveTrainAdminBTN.setForeground(new java.awt.Color(255, 255, 255));
        RemoveTrainAdminBTN.setText("Remove Train");
        RemoveTrainAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainAdminBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveTrainAdminBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 208, 60));

        BackBTN.setBackground(new java.awt.Color(0, 0, 0));
        BackBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 208, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTrainAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainAdminBTNActionPerformed
        new AddTrain(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddTrainAdminBTNActionPerformed

    private void UpdateTrainAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTrainAdminBTNActionPerformed
        new UpdateTrain(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UpdateTrainAdminBTNActionPerformed

    private void RemoveTrainAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainAdminBTNActionPerformed
        new RemoveTrain(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RemoveTrainAdminBTNActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new AdminOptionsPage(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ManageTrains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainAdminBTN;
    private javax.swing.JButton BackBTN;
    private javax.swing.JButton RemoveTrainAdminBTN;
    private javax.swing.JButton UpdateTrainAdminBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
