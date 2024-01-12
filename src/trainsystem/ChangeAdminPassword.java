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

public class ChangeAdminPassword extends javax.swing.JFrame {


    Admin admin = new Admin();
    public ChangeAdminPassword(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OldPasswordAdminUpdate = new javax.swing.JTextField();
        ConfirmNewPasswordAdminUpdate1 = new javax.swing.JTextField();
        NewPasswordAdminUpdate = new javax.swing.JTextField();
        UpdatePasswordAdminBTN = new javax.swing.JButton();
        CancelUpdatePasswordAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Old Password: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 176, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 176, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm New Password: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 54));
        getContentPane().add(OldPasswordAdminUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 432, -1));
        getContentPane().add(ConfirmNewPasswordAdminUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 431, -1));
        getContentPane().add(NewPasswordAdminUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 432, -1));

        UpdatePasswordAdminBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdatePasswordAdminBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdatePasswordAdminBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdatePasswordAdminBTN.setText("Update");
        UpdatePasswordAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePasswordAdminBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePasswordAdminBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 171, 48));

        CancelUpdatePasswordAdmin.setBackground(new java.awt.Color(0, 0, 0));
        CancelUpdatePasswordAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelUpdatePasswordAdmin.setForeground(new java.awt.Color(255, 255, 255));
        CancelUpdatePasswordAdmin.setText("Cancel");
        CancelUpdatePasswordAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelUpdatePasswordAdminActionPerformed(evt);
            }
        });
        getContentPane().add(CancelUpdatePasswordAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 173, 48));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelUpdatePasswordAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelUpdatePasswordAdminActionPerformed
        new AdminOptionsPage(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelUpdatePasswordAdminActionPerformed

    private void UpdatePasswordAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePasswordAdminBTNActionPerformed
        if(this.NewPasswordAdminUpdate.getText().equals("") || this.OldPasswordAdminUpdate.getText().equals("") || this.ConfirmNewPasswordAdminUpdate1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all the blanks!");
        }
        else if(!(this.NewPasswordAdminUpdate.getText().equals(this.ConfirmNewPasswordAdminUpdate1.getText())))
        {
            JOptionPane.showMessageDialog(this,"Confirm password doesn't match new password!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";        
            try 
            {
                Connection con = DriverManager.getConnection(url);        
                String sql = "SELECT Password FROM Admin WHERE admin_ID = ?";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, admin.admin_id);            
                ResultSet result = statement.executeQuery();                                             
                if (result.next()) {
                    if(this.OldPasswordAdminUpdate.getText().equals(result.getString("Password")))
                    {
                        String sql1 = "Update Admin\n" +
                                  "SET Password = ?\n" +
                                  "WHERE admin_ID = ?";  
                        PreparedStatement statement1 = con.prepareStatement(sql1);
                        statement1.setString(1, this.NewPasswordAdminUpdate.getText());
                        statement1.setInt(2,admin.admin_id);
                        int rowsInserted1 = statement1.executeUpdate();
                        if (rowsInserted1 > 0)
                        {
                             JOptionPane.showMessageDialog(this,"Password updated!");
                             new AdminOptionsPage(admin).setVisible(true);
                             this.setVisible(false);
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this,"Old Password is wrong!");
                } 
                else 
                {                    
                    System.out.println("Admin not found!");                        
                }                             
            }            
            catch (SQLException e) {
                System.out.println("Error connecting to database: " + e.getMessage());        
            }
        }
    }//GEN-LAST:event_UpdatePasswordAdminBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ChangeAdminPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelUpdatePasswordAdmin;
    private javax.swing.JTextField ConfirmNewPasswordAdminUpdate1;
    private javax.swing.JTextField NewPasswordAdminUpdate;
    private javax.swing.JTextField OldPasswordAdminUpdate;
    private javax.swing.JButton UpdatePasswordAdminBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
