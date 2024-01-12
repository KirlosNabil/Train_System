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

public class AddTrain extends javax.swing.JFrame {

    Admin admin = new Admin();
    public AddTrain(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TrainNameAdmin = new javax.swing.JTextField();
        TrainSeatsAdmin = new javax.swing.JTextField();
        AddTrainBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Train Name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Train Seats: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 103, 34));
        getContentPane().add(TrainNameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 429, -1));
        getContentPane().add(TrainSeatsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 432, -1));

        AddTrainBTN.setBackground(new java.awt.Color(0, 0, 0));
        AddTrainBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddTrainBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddTrainBTN.setText("Add Train");
        AddTrainBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AddTrainBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 168, 52));

        CancelBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 167, 52));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTrainBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainBTNActionPerformed
        if(this.TrainNameAdmin.getText().equals("") || this.TrainSeatsAdmin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            Train train = new Train();       
            train.adminID = admin.admin_id;
            train.Train_Name = this.TrainNameAdmin.getText();
            train.Train_Seats = Integer.parseInt(this.TrainSeatsAdmin.getText());
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            try {
                Connection con = DriverManager.getConnection(url);            
                String sql = "INSERT INTO Train (Train_Name, Train_Seats, adminID) VALUES (?, ?, ?)";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, train.Train_Name);
                statement.setInt(2, train.Train_Seats);
                statement.setInt(3, train.adminID);            
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) 
                {
                    JOptionPane.showMessageDialog(this,"Train added successfully!"); 
                    new ManageTrains(admin).setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this,"Couldn't add train");               
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
        }
    }//GEN-LAST:event_AddTrainBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        new ManageTrains(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainBTN;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JTextField TrainNameAdmin;
    private javax.swing.JTextField TrainSeatsAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
