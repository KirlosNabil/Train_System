/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Seif
 */
public class BookTrip extends javax.swing.JFrame {

    /**
     * Creates new form BookTrip
     */
    Customer customer = new Customer();
    Trip trip = new Trip();
    public BookTrip(Customer c) { 
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
        TripID = new javax.swing.JTextField();
        BookTripbtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trip ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 89, 34));
        getContentPane().add(TripID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 404, -1));

        BookTripbtn.setBackground(new java.awt.Color(0, 0, 0));
        BookTripbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BookTripbtn.setForeground(new java.awt.Color(255, 255, 255));
        BookTripbtn.setText("Book The Trip");
        BookTripbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTripbtnActionPerformed(evt);
            }
        });
        getContentPane().add(BookTripbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 161, 60));

        Cancelbtn.setBackground(new java.awt.Color(0, 0, 0));
        Cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 153, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookTripbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTripbtnActionPerformed
        
                
        String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";        
        try {
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM Trip WHERE Trip_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, this.TripID.getText());
            ResultSet result = statement.executeQuery();            
            if (result.next()) 
            {
                try
                {
                    
                    String sql1 = "INSERT INTO Booking (customer_id, trip_id, Status, Booking_date) VALUES (?, ?, ?, ?)";
                    PreparedStatement statement1 = con.prepareStatement(sql1);
                    statement1.setInt(1, customer.Customer_id);
                    statement1.setString(2, this.TripID.getText());
                    statement1.setString(3, 'T' + "");
                    statement1.setString(4, LocalDate.now().toString());
                    int rowsInserted1 = statement1.executeUpdate();
                    if (rowsInserted1 > 0)
                    {
                        try
                        {                        
                            String sql_seats = "Update Train\n" +
                                               "  SET Train_Seats = Train_Seats - 1\n" +
                                               "  Where Train_ID = (SELECT trainID From Trip WHERE Trip_ID = ?)";                    
                            PreparedStatement statement2 = con.prepareStatement(sql_seats);
                            statement2.setString(1, this.TripID.getText());
                            int rowsInserted2 = statement2.executeUpdate();                
                            if (rowsInserted2 > 0)
                            {
                                JOptionPane.showMessageDialog(this,"Trip Booked Successfully!");
                                new CustomerOptions(customer).setVisible(true);
                                this.setVisible(false);
                            }                                
                        }
                        catch (SQLException e) 
                        {
                            System.out.println("Error connecting to database: " + e.getMessage());
                        }
                    }
                }
                catch (SQLException e) 
                {
                    System.out.println("Error connecting to seif database: " + e.getMessage());            
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(this,"Invalid Trip ID! , Try again");
            }
        } 
        catch (SQLException e)
        {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }//GEN-LAST:event_BookTripbtnActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        new CustomerOptions(customer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(BookTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new BookTrip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookTripbtn;
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField TripID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
