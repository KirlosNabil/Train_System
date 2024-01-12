
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

public class UpdateTrip extends javax.swing.JFrame {

    Admin admin = new Admin();
    public UpdateTrip(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NewPrice = new javax.swing.JTextField();
        TripID = new javax.swing.JTextField();
        NewSource = new javax.swing.JTextField();
        NewTime = new javax.swing.JTextField();
        NewDay = new javax.swing.JTextField();
        NewDestination = new javax.swing.JTextField();
        NewYear = new javax.swing.JTextField();
        NewMonth = new javax.swing.JTextField();
        UpdateTripBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setText("Trip ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trip ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 139, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Price:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 139, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 139, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Source:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 139, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Destination:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Day:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 139, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("New Month:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 139, 28));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("New Year:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 139, 27));

        NewPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPriceActionPerformed(evt);
            }
        });
        getContentPane().add(NewPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 392, -1));

        TripID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripIDActionPerformed(evt);
            }
        });
        getContentPane().add(TripID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 392, -1));

        NewSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSourceActionPerformed(evt);
            }
        });
        getContentPane().add(NewSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 392, -1));

        NewTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTimeActionPerformed(evt);
            }
        });
        getContentPane().add(NewTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 392, -1));

        NewDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDayActionPerformed(evt);
            }
        });
        getContentPane().add(NewDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 392, -1));

        NewDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDestinationActionPerformed(evt);
            }
        });
        getContentPane().add(NewDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 392, -1));

        NewYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewYearActionPerformed(evt);
            }
        });
        getContentPane().add(NewYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 392, -1));

        NewMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMonthActionPerformed(evt);
            }
        });
        getContentPane().add(NewMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 392, -1));

        UpdateTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdateTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdateTripBTN.setText("Update Trip");
        UpdateTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 153, 40));

        CancelBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 157, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPriceActionPerformed

    private void TripIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TripIDActionPerformed

    private void NewSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSourceActionPerformed

    private void NewTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTimeActionPerformed

    private void NewDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewDayActionPerformed

    private void NewDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewDestinationActionPerformed

    private void NewYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewYearActionPerformed

    private void NewMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewMonthActionPerformed

    private void UpdateTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTripBTNActionPerformed
        if(this.TripID.getText().equals("") || this.NewDay.getText().equals("") || this.NewDestination.getText().equals("") || this.NewMonth.getText().equals("") || this.NewPrice.getText().equals("") || this.NewSource.getText().equals("") || this.NewTime.getText().equals("") || this.NewYear.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            Trip trip = new Trip();
            try {
                Connection con = DriverManager.getConnection(url);
                String sql = "SELECT * FROM Trip WHERE Trip_ID = ?";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(this.TripID.getText()));                    
                ResultSet result = statement.executeQuery();
                if (result.next()) 
                {
                    trip.Price = Float.parseFloat(this.NewPrice.getText());
                    trip.Trip_Time = this.NewTime.getText();
                    trip.Source = this.NewSource.getText();
                    trip.Destination = this.NewDestination.getText();
                    trip.Trip_Year = Integer.parseInt(this.NewYear.getText());
                    trip.Trip_Month = Integer.parseInt(this.NewMonth.getText());
                    trip.Trip_Day = Integer.parseInt(this.NewDay.getText());

                    String sql1 = "Update Trip\n" +
                                  "SET Price = ?,\n" +
                                  "Trip_Time = ?,\n" +
                                  "Source = ?,\n" +
                                  "Destination = ?,\n" +
                                  "Trip_Year = ?,\n" +
                                  "Trip_Month = ?,\n" +
                                  "Trip_Day = ?\n" +
                                  "WHERE Trip_ID = ?";  
                    PreparedStatement statement1 = con.prepareStatement(sql1);
                    statement1.setFloat(1, trip.Price);
                    statement1.setString(2, trip.Trip_Time);
                    statement1.setString(3, trip.Source);
                    statement1.setString(4, trip.Destination);
                    statement1.setInt(5, trip.Trip_Year);
                    statement1.setInt(6, trip.Trip_Month);
                    statement1.setInt(7, trip.Trip_Day);
                    statement1.setInt(8, Integer.parseInt(this.TripID.getText()));
                    int rowsInserted1 = statement1.executeUpdate();                
                    if (rowsInserted1 > 0)
                    { 
                        JOptionPane.showMessageDialog(this,"Trip Updated Successfully!");
                        new ManageTrips(admin).setVisible(true);
                        this.setVisible(false);
                    }
                       
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Invalid Trip ID :(");                
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
        }
    }//GEN-LAST:event_UpdateTripBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        new ManageTrips(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new UpdateTrip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBTN;
    private javax.swing.JTextField NewDay;
    private javax.swing.JTextField NewDestination;
    private javax.swing.JTextField NewMonth;
    private javax.swing.JTextField NewPrice;
    private javax.swing.JTextField NewSource;
    private javax.swing.JTextField NewTime;
    private javax.swing.JTextField NewYear;
    private javax.swing.JTextField TripID;
    private javax.swing.JButton UpdateTripBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
