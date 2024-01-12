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

public class RemoveTrain extends javax.swing.JFrame {

    Admin admin = new Admin();
    public RemoveTrain(Admin a) {
        admin = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TrainName = new javax.swing.JTextField();
        RemoveTrainbtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Train Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 33));
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 340, 30));

        RemoveTrainbtn.setBackground(new java.awt.Color(0, 0, 0));
        RemoveTrainbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RemoveTrainbtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveTrainbtn.setText("Remove Train");
        RemoveTrainbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainbtnActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveTrainbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 235, 150, 50));

        Cancelbtn.setBackground(new java.awt.Color(0, 0, 0));
        Cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 235, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveTrainbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainbtnActionPerformed
        if(this.TrainName.getText().equals(""))
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
                statement.setString(1, this.TrainName.getText());                    
                ResultSet result = statement.executeQuery();
                if (result.next()) 
                {
                    try
                    {
                        String sql1 = "DELETE FROM Train WHERE Train_Name = ?";  
                        PreparedStatement statement1 = con.prepareStatement(sql1);
                        statement1.setString(1, this.TrainName.getText());                
                        int rowsInserted1 = statement1.executeUpdate();                
                        if (rowsInserted1 > 0)
                        {
                            JOptionPane.showMessageDialog(this,"Train Removed!"); 
                            new ManageTrains(admin).setVisible(true);
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
                    JOptionPane.showMessageDialog(this,"Invalid Train Name!");                
                }
            } 
            catch (SQLException e) 
            {
                System.out.println("Error connecting to database: " + e.getMessage());            
            }
        }
        
    }//GEN-LAST:event_RemoveTrainbtnActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        new ManageTrains(admin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelbtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new RemoveTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JButton RemoveTrainbtn;
    private javax.swing.JTextField TrainName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
