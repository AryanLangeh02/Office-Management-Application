/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import com.mydia.cs.Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class addProject extends javax.swing.JFrame {

    /**
     * Creates new form addProject
     */
    public addProject() {
        initComponents();
        fillCombo();
    }
    private void fillCombo() {
    try {
        /*Connection con = null; this is for viewing all clients
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1","postgres","postgres");
            
            String query = "select * from clients";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
            String name = result.getString("client_name");
            clientNames.addItem(name); 
            }*/
        Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            ResultSet rs1 = statement2.executeQuery(); 
                if (rs1.next()){
                    String name1 = rs1.getString("emp_name");
                    
                    String query = "select * from clients where head_employee = ?";
                    PreparedStatement statement = con.prepareStatement(query);
                    statement.setString(1, name1);
                    ResultSet result = statement.executeQuery();
                    
                    while (result.next()){
                
                    String name = result.getString("client_name");
                    //String clientname = result.getString("client_name");
                        clientName.addItem(name);
                        //clientName.setText(clientname);
                    }}
    }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clientName = new javax.swing.JComboBox();
        projectName = new javax.swing.JTextField();
        structureType = new javax.swing.JComboBox();
        date = new com.toedter.calendar.JDateChooser();
        location = new javax.swing.JTextField();
        totalAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Projects");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Client Name: ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Project Name: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Structure Type:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Delivery Date: ");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Location:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Amount (AED): ");

        clientName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        projectName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        structureType.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        structureType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gate", "Staircase", "Railing", " " }));

        date.setDateFormatString("yyyy-MM-dd");
        date.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        location.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        totalAmount.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        totalAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalAmountKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(structureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(clientName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11))
                                    .addComponent(jButton1))))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(structureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        if (projectName.getText().trim().isEmpty() || location.getText().trim().isEmpty() || totalAmount.getText().trim().isEmpty() || date.getDate() == null){
        JOptionPane.showMessageDialog(null, "One of the fields is missing data. Please re-check.");
        }
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                Date todayDate = new Date();
                Date deliveryDate = date.getDate();
                sdf1.format(todayDate);
                long differenceMilliseconds = date.getDate().getTime() - todayDate.getTime();
                float differenceDays = (differenceMilliseconds / (1000 * 60 * 60 * 24));
        if (differenceDays < 2){
      JOptionPane.showMessageDialog(null, "Delivery date is too soon. Please re-check.");}
        else {
        
            try {
                // TODO add your handling code here:
                Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            
            String query = "INSERT INTO projectDetails" + "(Project_Name, Client_Name, Delivery_Date, Head_Employee, Location, Project_Status,  Structure_Type, Total_Amount)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; //fix date and select client name from clients table
            PreparedStatement statement = con.prepareStatement(query);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String varDate = sdf.format(date.getDate());
             
            statement.setString(1,projectName.getText());
            statement.setObject(2,clientName.getSelectedItem()); //need to select from client list
            statement.setString(3, varDate );
            statement.setString(7,(String) structureType.getSelectedItem());
            
            //statement.setString(4,employee.getText());
            //statement.setString(4,username); This saves username of person logged into the computer
            //statement.setString(4,date.getText());
            statement.setString(6,"In-Progress");
            statement.setString(5,location.getText());
            statement.setInt(8,Integer.parseInt(totalAmount.getText()));
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            ResultSet rs = statement2.executeQuery(); 
                        if (rs.next()){
                           String name1 = rs.getString("emp_name");
                            statement.setString(4,name1);
                            statement.executeUpdate();
                        }
            String query1 = "INSERT INTO payments" + "(project_Name, client_Name, total_amount, amount_paid, amount_outstanding, payable_date)" + "VALUES (?, ?, ?, ?, ?, ?)"; 
            PreparedStatement pstmt1 = con.prepareStatement(query1);
            //String query4 = "select amount_paid, amount_outstanding from payments order by account_id DESC LIMIT 1";
            //PreparedStatement statement4 = con.prepareStatement(query4);
            //ResultSet rs4 = statement4.executeQuery();
            pstmt1.setObject(2, clientName.getSelectedItem());
            pstmt1.setString(1, projectName.getText());
            pstmt1.setInt(3,Integer.parseInt(totalAmount.getText()));
            pstmt1.setInt(4, 0); 
            pstmt1.setInt(5,Integer.parseInt(totalAmount.getText()));
            pstmt1.setString(6, varDate );
            pstmt1.executeUpdate();
                
                String query3 = "SELECT * from clients where client_name = ?";
                PreparedStatement statement3 = con.prepareStatement(query3);
                statement3.setObject(1, clientName.getSelectedItem());
                ResultSet rs3 = statement3.executeQuery();
                if (rs3.next()){
                    Integer numOrders = rs3.getInt("number_of_orders");
                    System.out.println("got num order " + numOrders);
                    //statement3.executeUpdate();
                    
                    Integer newNumOrders = numOrders + 1;
                    String query4 = "Update clients set number_of_orders = ? where client_name = ?";
                    PreparedStatement statement4 = con.prepareStatement(query4);
                    statement4.setInt(1, newNumOrders);
                    statement4.setString(2, (String)clientName.getSelectedItem());
                    statement4.executeUpdate();
                    System.out.println("new num orders " + newNumOrders);
                }
                JOptionPane.showMessageDialog(null, "Inserted successfully. Please assign project resources.");
                clientName.setSelectedItem(0);
                date.setCalendar(null);
                location.setText("");
                projectName.setText("");
                totalAmount.setText("");
                structureType.setSelectedItem(0);
            } catch (SQLException ex) {
                Logger.getLogger(addProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }//GEN-LAST:event_saveActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalAmountKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_totalAmountKeyTyped

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
            java.util.logging.Logger.getLogger(addProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox clientName;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField projectName;
    private javax.swing.JButton save;
    private javax.swing.JComboBox structureType;
    private javax.swing.JTextField totalAmount;
    // End of variables declaration//GEN-END:variables
}
