
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

public class CancelTrip extends javax.swing.JFrame {
    Admin admin = new Admin();
    public CancelTrip(Admin a) {
        admin = a;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TripID = new javax.swing.JTextField();
        CancelTripBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trip ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 67, 34));
        getContentPane().add(TripID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 382, -1));

        CancelTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelTripBTN.setText("Cancel Trip");
        CancelTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 161, 46));

        CancelBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 160, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelTripBTNActionPerformed
        
        if(this.TripID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            try {
                Connection con = DriverManager.getConnection(url);            
                String sql = "SELECT * FROM Trip WHERE Trip_ID = ?";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(this.TripID.getText()));                    
                ResultSet result = statement.executeQuery();
                if (result.next()) 
                {
                    try
                    {
                        String sql1 = "DELETE FROM Trip WHERE Trip_ID = ?";  
                        PreparedStatement statement1 = con.prepareStatement(sql1);
                        statement1.setInt(1, Integer.parseInt(this.TripID.getText()));                
                        int rowsInserted1 = statement1.executeUpdate();                
                        if (rowsInserted1 > 0)
                        {
                            JOptionPane.showMessageDialog(this,"Trip Cancelled!"); 
                            new ManageTrips(admin).setVisible(true);
                            this.setVisible(false);
                        }  
                    }
                    catch (SQLException e) 
                    {
                        System.out.println("Error connecting to database: " + e.getMessage());            
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Invalid Trip ID!");                
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
        }
    }//GEN-LAST:event_CancelTripBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        new ManageTrips(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CancelTrip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBTN;
    private javax.swing.JButton CancelTripBTN;
    private javax.swing.JTextField TripID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
