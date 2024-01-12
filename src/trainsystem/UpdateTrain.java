
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

public class UpdateTrain extends javax.swing.JFrame {

    Admin admin = new Admin();
    public UpdateTrain(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddTrainBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TrainNameAdmin = new javax.swing.JTextField();
        TrainNewSeatsAdmin = new javax.swing.JTextField();
        UpdateTrainBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        AddTrainBTN.setText("Add Train");
        AddTrainBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainBTNActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Train New Seats: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 55));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Train Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 131, 55));
        getContentPane().add(TrainNameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 400, -1));
        getContentPane().add(TrainNewSeatsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 400, -1));

        UpdateTrainBTN.setBackground(new java.awt.Color(0, 0, 0));
        UpdateTrainBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateTrainBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpdateTrainBTN.setText("Update Train");
        UpdateTrainBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTrainBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateTrainBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 160, 39));

        CancelBTN.setBackground(new java.awt.Color(0, 0, 0));
        CancelBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 171, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTrainBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainBTNActionPerformed
        
    }//GEN-LAST:event_AddTrainBTNActionPerformed

    private void UpdateTrainBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTrainBTNActionPerformed
       
        if(this.TrainNameAdmin.getText().equals("") || this.TrainNewSeatsAdmin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Fill all blank forms!");
        }
        else
        {
            String url = "jdbc:sqlserver://SEIFELDEEN:1433;databaseName=TrainSystem;user=sa;password=sa123456;encrypt=false;";
            try {
                Connection con = DriverManager.getConnection(url);            
                String sql = "SELECT * FROM Train WHERE Train_Name = ?";             
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, this.TrainNameAdmin.getText());                    
                ResultSet result = statement.executeQuery();
                if (result.next()) 
                {
                    String sql1 = "Update Train\n" +
                                  "SET Train_Seats = ?\n" +
                                  "WHERE Train_Name = ?";  
                    PreparedStatement statement1 = con.prepareStatement(sql1);
                    statement1.setInt(1, Integer.parseInt(this.TrainNewSeatsAdmin.getText()));
                    statement1.setString(2, this.TrainNameAdmin.getText());
                    int rowsInserted1 = statement1.executeUpdate();
                    if (rowsInserted1 > 0)
                    {
                        JOptionPane.showMessageDialog(this,"Train Updated Successfully!");
                        new ManageTrains(admin).setVisible(true);
                        this.setVisible(false);
                    }
                         
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
        }   
    }//GEN-LAST:event_UpdateTrainBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        new ManageTrains(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UpdateTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainBTN;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JTextField TrainNameAdmin;
    private javax.swing.JTextField TrainNewSeatsAdmin;
    private javax.swing.JButton UpdateTrainBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
