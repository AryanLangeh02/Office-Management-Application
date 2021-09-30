/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import com.mydia.cs.Utility;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class projectResources extends javax.swing.JFrame {

    /**
     * Creates new form projectResources
     */
    public projectResources() {
        initComponents();
        fillCombo();
        fillCombo1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        projectNames = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        materialName = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        amountToUse = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Project Resources");

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Project Name: ");

        projectNames.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        projectNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNamesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Material Name: ");

        materialName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount to be used (kg): ");

        amountToUse.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        amountToUse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountToUseKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountToUse))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(materialName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(projectNames, 0, 468, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(projectNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(materialName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amountToUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void fillCombo() {
    try {
        Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            ResultSet rs1 = statement2.executeQuery(); 
                if (rs1.next()){
                    String name1 = rs1.getString("emp_name");
                    
                    String query = "select * from projectdetails where head_employee = ?";
                    PreparedStatement statement = con.prepareStatement(query);
                    statement.setString(1, name1);
                    ResultSet result = statement.executeQuery();
                    
                    while (result.next()){
                
                    String name = result.getString("project_name");
                    //String clientname = result.getString("client_name");
                        projectNames.addItem(name);
                        //clientName.setText(clientname);
                    }}
    }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }
    private void fillCombo1() {
        try {
            Connection con = null;
                con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
                        String query = "select * from materials";
                        PreparedStatement statement = con.prepareStatement(query);
                        ResultSet result = statement.executeQuery();

                        while (result.next()){

                        String name = result.getString("material_name");
                        //String clientname = result.getString("client_name");
                            materialName.addItem(name);
                            //clientName.setText(clientname);
                        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    private void projectNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNamesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String materialname = (String) materialName.getSelectedItem();
            int amtForUse = Integer.parseInt(amountToUse.getText());
            String query2 = "Select existing_quantity from materials where material_name = ?" ;
            PreparedStatement statement = con.prepareStatement(query2);
            statement.setString(1, (String)materialName.getSelectedItem());
            ResultSet rs = statement.executeQuery();
            
            int existingAmount = 0;
            
            while(rs.next()) {
                existingAmount = rs.getInt("existing_quantity");
                Integer newAmount = existingAmount - amtForUse;
            
            String query = "UPDATE materials SET existing_quantity=? WHERE material_name = ?"; 
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(2, materialname);
            pstmt.setInt(1, newAmount);
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(addProjectRejected.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            
            ResultSet rs = statement2.executeQuery();
            if (rs.next()){
                String name1 = rs.getString("emp_name");
                String query3 = "select type from credentials where name = ?";
                PreparedStatement statement3 = con.prepareStatement(query3);
                statement3.setString(1, name1);
                ResultSet rs3 = statement3.executeQuery();
                    if (rs3.next()){
                        String employeeRole = rs3.getString("type");
                            if (employeeRole.equalsIgnoreCase("manager")){
                                new manager().setVisible(true);   
                            }
                            else if (employeeRole.equalsIgnoreCase("employee")){
                                new employee().setVisible(true);
                            }
                    }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(addProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void amountToUseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountToUseKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_amountToUseKeyTyped

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
            java.util.logging.Logger.getLogger(projectResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projectResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projectResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projectResources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountToUse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox materialName;
    private javax.swing.JComboBox projectNames;
    // End of variables declaration//GEN-END:variables
}
