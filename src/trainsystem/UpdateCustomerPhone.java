/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Seif
 */
public class UpdateCustomerPhone extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomerPhone
     */
    Customer customer = new Customer();
    public UpdateCustomerPhone(Customer c) {
        customer = c;
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

        jLabel1 = new javax.swing.JLabel();
        UpdatePhonebtn = new javax.swing.JButton();
        NewPhoneNumber = new javax.swing.JTextField();
        Cancelbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Phone Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, 48));

        UpdatePhonebtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdatePhonebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdatePhonebtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdatePhonebtn.setText("Update");
        UpdatePhonebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePhonebtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePhonebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 157, 55));
        getContentPane().add(NewPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 443, 30));

        Cancelbtn.setBackground(new java.awt.Color(0, 0, 0));
        Cancelbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 149, 55));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        // TODO add your handling code here:
        new UpdateAccountOptions(customer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void UpdatePhonebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePhonebtnActionPerformed
        // TODO add your handling code here:
        if(this.NewPhoneNumber.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";        
            try 
            {
                Connection con = DriverManager.getConnection(url);        
                String sql = "Update Customer\n" +
                             "  Set PhoneNo = ? \n" +
                             "  Where Customer_id = ?";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, this.NewPhoneNumber.getText());  
                statement.setInt(2, customer.Customer_id);  
                int rowsInserted1 = statement.executeUpdate();
                if (rowsInserted1 > 0)
                {
                    JOptionPane.showMessageDialog(this,"Phone Number Updated Successfully!!");
                    new UpdateAccountOptions(customer).setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {                    
                    JOptionPane.showMessageDialog(this,"Customer not Found!");                        
                }                             
            }            
            catch (SQLException e) {
                System.out.println("Error connecting to database: " + e.getMessage());        
            }
        }        
    }//GEN-LAST:event_UpdatePhonebtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCustomerPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomerPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomerPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomerPhone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UpdateCustomerPhone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField NewPhoneNumber;
    private javax.swing.JButton UpdatePhonebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
