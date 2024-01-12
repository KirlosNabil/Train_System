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

public class LogInAdmin extends javax.swing.JFrame {

    public LogInAdmin() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminSignInBTN = new javax.swing.JButton();
        RegisterAdminBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        AdminPassword = new javax.swing.JTextField();
        AdminEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login Page");
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 94, 46));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 94, 46));

        AdminSignInBTN.setBackground(new java.awt.Color(0, 0, 0));
        AdminSignInBTN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdminSignInBTN.setForeground(new java.awt.Color(255, 255, 255));
        AdminSignInBTN.setText("Sign In");
        AdminSignInBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminSignInBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminSignInBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AdminSignInBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 186, 42));

        RegisterAdminBTN.setBackground(new java.awt.Color(0, 0, 0));
        RegisterAdminBTN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        RegisterAdminBTN.setForeground(new java.awt.Color(255, 255, 255));
        RegisterAdminBTN.setText("Register a new account");
        RegisterAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAdminBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterAdminBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 284, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 1130, 510);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setLayout(null);
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 28, -1, -1));
        getContentPane().add(AdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 400, 34));

        AdminEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEmailActionPerformed(evt);
            }
        });
        getContentPane().add(AdminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 400, 36));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 910, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminSignInBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminSignInBTNActionPerformed

        Admin admin = new Admin();
        if(this.AdminEmail.getText().equals("") || this.AdminPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;"; 
          

            try 
            {
                Connection con = DriverManager.getConnection(url);        
                String sql = "SELECT * FROM Admin WHERE Email = ? AND Password = ?";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, this.AdminEmail.getText());
                statement.setString(2, this.AdminPassword.getText());
                ResultSet result = statement.executeQuery();                                             
                if (result.next()) {

                    String sql1 = "SELECT admin_id FROM Admin WHERE Email = ? AND Password = ?";
                    PreparedStatement statement1 = con.prepareStatement(sql1);
                    statement1.setString(1, this.AdminEmail.getText());
                    statement1.setString(2, this.AdminPassword.getText());
                    ResultSet result1 = statement1.executeQuery();
                    if (result1.next())
                        admin.admin_id = result1.getInt("admin_id");     
                    new AdminOptionsPage(admin).setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {                    
                    JOptionPane.showMessageDialog(this,"Login failed, Email or Password is incorrect!");
                }                             
            }

            catch (SQLException e) {
                System.out.println("Error connecting to database: " + e.getMessage());        
            }   
        }
                     
    }//GEN-LAST:event_AdminSignInBTNActionPerformed

    private void RegisterAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAdminBTNActionPerformed
       new RegisterAdmin().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegisterAdminBTNActionPerformed

    private void AdminEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminEmailActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminEmail;
    private javax.swing.JTextField AdminPassword;
    private javax.swing.JButton AdminSignInBTN;
    private javax.swing.JButton RegisterAdminBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
