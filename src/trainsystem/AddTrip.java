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

public class AddTrip extends javax.swing.JFrame {

    Admin admin = new Admin();
    public AddTrip(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TripSource = new javax.swing.JTextField();
        TripTime = new javax.swing.JTextField();
        TripPrice = new javax.swing.JTextField();
        TripDay = new javax.swing.JTextField();
        TripDestination = new javax.swing.JTextField();
        TripYear = new javax.swing.JTextField();
        TripMonth = new javax.swing.JTextField();
        AddTripBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TrainName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trip Time:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 107, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 107, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destination:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 107, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trip Day:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 107, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Trip Month:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 107, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trip Year:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 87, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Source:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 63, 35));
        getContentPane().add(TripSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 432, -1));
        getContentPane().add(TripTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 432, -1));
        getContentPane().add(TripPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 432, -1));
        getContentPane().add(TripDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 432, -1));
        getContentPane().add(TripDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 432, -1));
        getContentPane().add(TripYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 432, -1));
        getContentPane().add(TripMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 432, -1));

        AddTripBTN.setBackground(new java.awt.Color(0, 0, 0));
        AddTripBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddTripBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddTripBTN.setText("Add Trip");
        AddTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTripBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AddTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 172, 42));

        CancelBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 170, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Train Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 432, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTripBTNActionPerformed
        
        if(this.TrainName.getText().equals("") || this.TripDay.getText().equals("") || this.TripDestination.getText().equals("") || this.TripMonth.getText().equals("") || this.TripPrice.getText().equals("") || this.TripSource.getText().equals("") || this.TripTime.getText().equals("") || this.TripYear.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            Trip trip = new Trip();   
            trip.Price = Float.parseFloat(this.TripPrice.getText());
            trip.Trip_Time = this.TripTime.getText();
            trip.Source = this.TripSource.getText();
            trip.Destination = this.TripDestination.getText();
            trip.Trip_Year = Integer.parseInt(this.TripYear.getText());
            trip.Trip_Month = Integer.parseInt(this.TripMonth.getText());
            trip.Trip_Day = Integer.parseInt(this.TripDay.getText());              
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            try {
                Connection con = DriverManager.getConnection(url);            
                String sql = "SELECT Train_ID FROM Train WHERE Train_Name = ?";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, this.TrainName.getText());                    
                ResultSet result = statement.executeQuery();
                if (result.next())
                {
                    trip.trainID = result.getInt("Train_ID");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Invalid Train Name!");               
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
            trip.adminID = admin.admin_id;        
            try {
                Connection con = DriverManager.getConnection(url);            
                String sql = "INSERT INTO Trip (Price, Trip_Time, Source, Destination, Trip_Year, Trip_Month, Trip_Day, adminID, trainID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setFloat(1, trip.Price);
                statement.setString(2, trip.Trip_Time);
                statement.setString(3, trip.Source);
                statement.setString(4, trip.Destination);
                statement.setInt(5, trip.Trip_Year);
                statement.setInt(6, trip.Trip_Month);
                statement.setInt(7, trip.Trip_Day);
                statement.setInt(8, trip.adminID);
                statement.setInt(9, trip.trainID);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) 
                {
                    JOptionPane.showMessageDialog(this,"Trip Added Successfully"); 
                    new ManageTrips(admin).setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Could't add trip");                
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
        }
    }//GEN-LAST:event_AddTripBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        new ManageTrips(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddTrip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTripBTN;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JTextField TrainName;
    private javax.swing.JTextField TripDay;
    private javax.swing.JTextField TripDestination;
    private javax.swing.JTextField TripMonth;
    private javax.swing.JTextField TripPrice;
    private javax.swing.JTextField TripSource;
    private javax.swing.JTextField TripTime;
    private javax.swing.JTextField TripYear;
    private javax.swing.JLabel jLabel1;
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
