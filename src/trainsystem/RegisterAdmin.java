
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

public class RegisterAdmin extends javax.swing.JFrame {

    public RegisterAdmin() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AdminLName = new javax.swing.JTextField();
        AdminFName = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JTextField();
        AdminEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AdminConfirmPassword = new javax.swing.JTextField();
        RegisterAdmin = new javax.swing.JButton();
        CancelRegisteration = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 124, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 114, 34));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 114, 44));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 124, 47));
        getContentPane().add(AdminLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 426, -1));
        getContentPane().add(AdminFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 426, -1));
        getContentPane().add(AdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 426, -1));
        getContentPane().add(AdminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 426, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 41));
        getContentPane().add(AdminConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 426, -1));

        RegisterAdmin.setBackground(new java.awt.Color(0, 0, 0));
        RegisterAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegisterAdmin.setForeground(new java.awt.Color(255, 255, 255));
        RegisterAdmin.setText("Register");
        RegisterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAdminActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 157, 41));

        CancelRegisteration.setBackground(new java.awt.Color(0, 0, 0));
        CancelRegisteration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelRegisteration.setForeground(new java.awt.Color(255, 255, 255));
        CancelRegisteration.setText("Cancel");
        CancelRegisteration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegisterationActionPerformed(evt);
            }
        });
        getContentPane().add(CancelRegisteration, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 176, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAdminActionPerformed
        Pattern regexPattern = Pattern.compile("^\\w+([.-]?\\w+)@\\w+([.-]?\\w+)(.\\w{2,3})+$");
        Matcher m1 = regexPattern.matcher(this.AdminEmail.getText()); 
        regexPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,15}$");
        Matcher m2 = regexPattern.matcher(this.AdminPassword.getText());
        if(this.AdminFName.getText().equals("") || this.AdminLName.getText().equals("") || this.AdminEmail.getText().equals("") || this.AdminPassword.getText().equals("") || this.AdminConfirmPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all the blanks!");
        }
        else if(!m1.matches())
        {
            JOptionPane.showMessageDialog(this,"Imvalid email!, Enter a valid one");
        }
        else if(!m2.matches())
        {
            JOptionPane.showMessageDialog(this,"Imvalid Password!, Enter a valid one");
        }
        else if(!(this.AdminPassword.getText().equals(this.AdminConfirmPassword.getText())))
        {
            JOptionPane.showMessageDialog(this,"Confirm Password doesn't match password");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            try 
            {
                Connection con = DriverManager.getConnection(url);            
                String sql = "INSERT INTO Admin (Fname, Lname, Email,Password) VALUES (?, ?, ?, ?)";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, this.AdminFName.getText());
                statement.setString(2, this.AdminLName.getText());
                statement.setString(3, this.AdminEmail.getText());
                statement.setString(4, this.AdminPassword.getText());            
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) 
                {
                    JOptionPane.showMessageDialog(this,"Account registered successfully");
                    new LogInAdmin().setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Registeration failed!");
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());

            }
        }
    }//GEN-LAST:event_RegisterAdminActionPerformed

    private void CancelRegisterationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegisterationActionPerformed
                new LogInAdmin().setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_CancelRegisterationActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminConfirmPassword;
    private javax.swing.JTextField AdminEmail;
    private javax.swing.JTextField AdminFName;
    private javax.swing.JTextField AdminLName;
    private javax.swing.JTextField AdminPassword;
    private javax.swing.JButton CancelRegisteration;
    private javax.swing.JButton RegisterAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
