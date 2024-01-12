
package trainsystem;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChooseAdminOrCustomer extends javax.swing.JFrame {            
    public ChooseAdminOrCustomer()
    {
        initComponents();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AdminBTNChoice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CustomerBTNChoice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setBackground(new java.awt.Color(129, 168, 168));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 105, 37, -1));

        jPanel1.setLayout(null);

        AdminBTNChoice.setBackground(new java.awt.Color(0, 0, 0));
        AdminBTNChoice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AdminBTNChoice.setForeground(new java.awt.Color(255, 255, 255));
        AdminBTNChoice.setText("Admin");
        AdminBTNChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminBTNChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBTNChoiceActionPerformed(evt);
            }
        });
        jPanel1.add(AdminBTNChoice);
        AdminBTNChoice.setBounds(344, 146, 222, 84);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your role");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 90, 160, 40);

        CustomerBTNChoice.setBackground(new java.awt.Color(0, 0, 0));
        CustomerBTNChoice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CustomerBTNChoice.setForeground(new java.awt.Color(255, 255, 255));
        CustomerBTNChoice.setText("Customer");
        CustomerBTNChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerBTNChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBTNChoiceActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerBTNChoice);
        CustomerBTNChoice.setBounds(344, 268, 222, 87);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seif\\Desktop\\blur-city-dark-depth-of-field.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 510);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBTNChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBTNChoiceActionPerformed
        new LogInAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminBTNChoiceActionPerformed

    private void CustomerBTNChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBTNChoiceActionPerformed
        // TODO add your handling code here:
        new LogInCustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustomerBTNChoiceActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseAdminOrCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBTNChoice;
    private javax.swing.JButton CustomerBTNChoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
