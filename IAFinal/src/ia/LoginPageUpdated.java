/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import com.mydia.cs.Utility;
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class LoginPageUpdated extends javax.swing.JFrame {

    /**
     * Creates new form LoginPageUpdated
     */
    public LoginPageUpdated() {
        //this.userEmail = email.getText();
        initComponents();
        //this.setTitle("CS IA");
        /*try {
            BufferedReader br = new BufferedReader(new FileReader("db.txt"));
            String line="";
            line=br.readLine();
            while((line=br.readLine())!=null) /* as long as there is data in the file, it runs.
            We repeat line=br.readLine() again to ignore the header at the top of the files**/
            /*{
               String [] tempstringarray = line.split(",");
               Utility.dbUser = tempstringarray[0];
               Utility.dbPass = tempstringarray[1];
               Utility.dbPort = tempstringarray[2];
            }  
            
        } catch (IOException ex) {
            Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        try {
            BufferedReader br=null;
            br = new BufferedReader(new FileReader("details.txt"));
            String line = br.readLine(); 
            String[] tempstringarray = line.split(",");
            Utility.dbUser=tempstringarray[0];
            Utility.dbPass=tempstringarray[1];
            Utility.dbPort=tempstringarray[2];
        } catch (IOException ex) {
            Logger.getLogger(LoginPageUpdated.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //public String userEmail;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        setup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fair Deal Office Portal");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ia/Dubai-skyline_16d7de0fdce_medium.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        email.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        Login.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Email : ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Password : ");

        setup.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        setup.setText("Setup Database");
        setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(setup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(Login))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(email))
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

            try
            {    
            String employeeEmail = email.getText();
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
                String query = "select  email, password, type from credentials where email LIKE '%"+
                        email.getText()+"%'";
                /*this query is comparing the inputted email with the database to see whether an employee
                or manager, and to verify their password is using the program*/
                PreparedStatement statement = con.prepareStatement(query);
                ResultSet result = statement.executeQuery();
                if (result.next())
                {
                    String dbasePassword = result.getString("Password").toString().trim();
                    String dbaseType = result.getString("Type").toString().trim();
                    String dbaseEmail = result.getString("email").toString().trim();
                    /*storing the password and employee type as variables*/
                    String enteredPassword = new String(pass.getText().trim()); //the password entered by the user
                    String enteredEmail = email.getText();
                    if (employeeEmail.contains("@gmail.com")) {
                    if((dbasePassword.equals(enteredPassword)) && (dbaseType.equalsIgnoreCase("manager")))
                    /*an if-statement is being used here to check and see whether the employee type is employee
                        or manager and if the password is correct*/
                    {

            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
                        new manager().setVisible(true);
                        this.setVisible(false);
                        String query1 = "INSERT INTO LoginTracker" + "(Email, Password, Emp_Name)" + "VALUES (?, ?, ?)";
                        //the line above is keeping track of which employee is currently using the program
                        PreparedStatement statement1 = con.prepareStatement(query1);    
                        statement1.setString(1,email.getText());
                        statement1.setString(2,pass.getText());

                        String query2 = "select name from credentials where email LIKE '%"+email.getText()+"%'";
                        //the line above is getting the name of the employee based on their e-mail
                        PreparedStatement statement2 = con.prepareStatement(query2);
                        ResultSet rs = statement2.executeQuery();
                        if (rs.next()){
                            String name = rs.getString("name");
                            statement1.setString(3,name);
                            //once it has gotten the name, it is then inputted into the database
                            statement1.executeUpdate();
                        }
                    }
                    else if((dbasePassword.equals(enteredPassword)) && (dbaseType.equalsIgnoreCase("employee"))){
                        //Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
                        new employee().setVisible(true);
                        this.setVisible(false);
                        String query1 = "INSERT INTO LoginTracker" + "(Email, Password, Emp_Name)" + "VALUES (?, ?, ?)";
                        PreparedStatement statement1 = con.prepareStatement(query1);
                        statement1.setString(1,email.getText());
                        statement1.setString(2,pass.getText());
                        String query2 = "select name from credentials where email LIKE '%"+email.getText()+"%'";
                        PreparedStatement statement2 = con.prepareStatement(query2);
                        ResultSet rs = statement2.executeQuery();

                        if (rs.next()){
                            String name = rs.getString("name");
                            statement1.setString(3,name);
                            statement1.executeUpdate();
                        }
                        con.close();
                    }
                    
                    else if (!dbasePassword.equals(enteredPassword)){
                    JOptionPane.showMessageDialog(null,"Incorrect password. Please try again."); 
                } 
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Error in entered e-mail. Please re-check.");
                    }
            }
            catch(SQLException se){
                se.printStackTrace();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Exception occurred while searching in the table.");
            }
        }
/*
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         

    }//GEN-LAST:event_LoginActionPerformed
*/
    private void setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupActionPerformed
        // TODO add your handling code here:
        new DBsetup1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_setupActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPageUpdated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPageUpdated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPageUpdated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPageUpdated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageUpdated().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton setup;
    // End of variables declaration//GEN-END:variables

}
