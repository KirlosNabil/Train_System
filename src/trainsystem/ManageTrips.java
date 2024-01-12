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

public class ManageTrips extends javax.swing.JFrame {

    Admin admin = new Admin();
    public ManageTrips(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddTripBTN = new javax.swing.JButton();
        CancelTripBTN = new javax.swing.JButton();
        UpdateTripBTN = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        AddTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddTripBTN.setText("Add Trip");
        AddTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AddTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 45));

        CancelTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelTripBTN.setText("Cancel Trip");
        CancelTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 140, 49));

        UpdateTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdateTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdateTripBTN.setText("Update Trip");
        UpdateTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 140, 47));

        BackBTN.setBackground(new java.awt.Color(0, 0, 0));
        BackBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 140, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTripBTNActionPerformed
        new AddTrip(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddTripBTNActionPerformed

    private void UpdateTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTripBTNActionPerformed
        new UpdateTrip(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UpdateTripBTNActionPerformed

    private void CancelTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelTripBTNActionPerformed
        new CancelTrip(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelTripBTNActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new AdminOptionsPage(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBTNActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new ManageTrips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTripBTN;
    private javax.swing.JButton BackBTN;
    private javax.swing.JButton CancelTripBTN;
    private javax.swing.JButton UpdateTripBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
