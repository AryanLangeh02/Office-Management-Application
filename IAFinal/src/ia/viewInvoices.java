/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import com.mydia.cs.Utility;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Properties;   
import javax.mail.*;   
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class viewInvoices extends javax.swing.JFrame {

    /**
     * Creates new form Invoicing
     */
    public viewInvoices() {
        initComponents();
        fillCombo();
        //showInvoice(pos);
    }
    int pos = 0;
    public void printComponent() {

  PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum) {
      if (pageNum > 0) return Printable.NO_SUCH_PAGE;

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      payableDate.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });

  if (pj.printDialog() == false) return;

  try {
    pj.print();
  } catch (PrinterException ex) {
    // handle exception
  }
}
    public static void send(final String from,final String password,String to,String sub,String msg){
          //Get properties object   
          Properties props = new Properties();   
          props.put("mail.smtp.host", "smtp.gmail.com");   
          props.put("mail.smtp.socketFactory.port", "465");   
          props.put("mail.smtp.socketFactory.class",   
                    "javax.net.ssl.SSLSocketFactory");   
          props.put("mail.smtp.auth", "true");   
          props.put("mail.smtp.port", "465");   
          //get Session  
          Session session = Session.getDefaultInstance(props,   
           new javax.mail.Authenticator() {   
           protected PasswordAuthentication getPasswordAuthentication() {   
           return new PasswordAuthentication(from,password);
           }   
          });   
          //compose message   
          try {   
           MimeMessage message = new MimeMessage(session);   
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));   
           message.setSubject(sub);   
           message.setText(msg);   
           //send message
           Transport.send(message);   
          } catch (MessagingException e) {throw new RuntimeException(e);}   
            
    }
    
    public List<Invoice> getInvoiceList()
    {
        try {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            PreparedStatement st = con.prepareStatement("SELECT * FROM invoices");
            ResultSet rs = st.executeQuery();

            List<Invoice> list = new ArrayList<Invoice>();

            Invoice invoice;

            while(rs.next())
            {
               invoice = new Invoice(rs.getString("project_name"),rs.getString("client_name"),rs.getString("amount"),
                      rs.getString("date_issued"),rs.getString("payable_date"), rs.getString("type"));
               
               list.add(invoice);
               con.close();
            }
            return list;
            

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void showInvoice(int index)
    {
        projectNames.getModel().setSelectedItem(getInvoiceList().get(index).getProject());
                //setObject(getClientList().get(index).getName());
        type.getModel().setSelectedItem(getInvoiceList().get(index).getType());
        
        Name.setText(getInvoiceList().get(index).getClient());

        dateIssued.setText(getInvoiceList().get(index).getDateIssue());
        
        amount.setText(getInvoiceList().get(index).getNumber());
        
        payableDate.setText(getInvoiceList().get(index).getDatePay());

    }
    
    private void fillCombo() {
    try {
        Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            ResultSet rs1 = statement2.executeQuery(); 
                if (rs1.next()){
                    String name1 = rs1.getString("emp_name");
                    
                    String query = "select project_name from projectdetails where head_employee = ? and project_status = ?";
                    PreparedStatement statement = con.prepareStatement(query);
                    statement.setString(1, name1);
                    statement.setString(2, "In-Progress");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        projectNames = new javax.swing.JComboBox();
        Name = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        dateIssued = new javax.swing.JTextField();
        payableDate = new javax.swing.JTextField();
        type = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        first = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        last = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Invoice");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Project Name: ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client Name: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount: ");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Issued:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payable Date:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type:");

        projectNames.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        projectNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNamesActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        dateIssued.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        payableDate.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        type.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gate", "Staircase", "Railing" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Send Reminder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        first.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        first.setText("First");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        previous.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        last.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        last.setText("Last");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(last)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payableDate)
                            .addComponent(amount)
                            .addComponent(projectNames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateIssued, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(74, 74, 74))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projectNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateIssued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addComponent(payableDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNamesActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String query = "Select * from Invoices where project_name = ?" ;
            PreparedStatement statement = con.prepareStatement(query);
            statement.setObject(1,projectNames.getSelectedItem());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                
                String setName = rs.getString("client_name"); //getting the data from the database
                Name.setText(setName);
                
                String setAmount = rs.getString("amount"); //getting the data from the database
                amount.setText(setAmount);
                
                String setType = rs.getString("type"); //getting the data from the database
                type.setSelectedItem(setType);
                
                String issueDate = rs.getString("date_issued"); //getting the data from the database
                dateIssued.setText(issueDate);
                
                String payDate = rs.getString("payable_date"); //getting the data from the database
                payableDate.setText(payDate);
                
            }
            
            else {
            JOptionPane.showMessageDialog(null, "Invoice does not exitst. Please create one.");
                Name.setText("");

                amount.setText("");

                type.setSelectedItem(0);

                dateIssued.setText("");

                payableDate.setText("");
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_projectNamesActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

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

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (amount.getText().trim().isEmpty() || payableDate.getText().trim().isEmpty() || Name.getText().trim().isEmpty() || dateIssued.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "One of the fields is missing data. Please re-check.");
        }
        else {
        try {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String query = "Select * from invoices where project_name = ?" ;
            PreparedStatement statement = con.prepareStatement(query);
            statement.setObject(1,projectNames.getSelectedItem());
            ResultSet result = statement.executeQuery();               
            if (result.next())
            {   
                String clientName = result.getString("client_name");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date todayDate = new Date();
                Date payableDate = result.getDate("payable_date");
                sdf.format(todayDate);
                long differenceMilliseconds = payableDate.getTime() - todayDate.getTime();
                float differenceDays = (differenceMilliseconds / (1000 * 60 * 60 * 24));
                
            String query1 = "Select * from clients where client_name = ?" ;
            PreparedStatement statement1 = con.prepareStatement(query1);
            statement1.setObject(1,clientName);
            ResultSet result1 = statement1.executeQuery();               
            if (result1.next()){
            String clientEmail = result1.getString("email");
            if (differenceDays<2){
                send("solidaluminumcompany@gmail.com","SolidPassword123",clientEmail,
                        "Payment Date Approaching.","Dear Client," + "\n" + "\n"
                                + "Please be informed that the payment date is approaching. "
                                + "Kindly transfer the outstanding amount." + "\n" +
                                "\nRegards, \nSolid Aluminum");
                JOptionPane.showMessageDialog(null, "The payment is due in " + differenceDays + " days. Email reminder has been sent.");
                }
            else {
                JOptionPane.showMessageDialog(null, "The payment is due in " + differenceDays + " days. A reminder will be sent in " + (differenceDays - 2) + " days.");
            }
            }        
        }
        } catch (Exception e) {
            e.printStackTrace();  
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
        pos = 0;
        showInvoice(pos);
    }//GEN-LAST:event_firstActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        pos--;
        if(pos < 0)
        {
            pos = 0;
        }
        showInvoice(pos);
    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        pos++;
        if(pos >= getInvoiceList().size())
        {
            pos = getInvoiceList().size()-1;
        }
        showInvoice(pos);
    }//GEN-LAST:event_nextActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
        pos = getInvoiceList().size() - 1;
        showInvoice(pos);
    }//GEN-LAST:event_lastActionPerformed

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
            java.util.logging.Logger.getLogger(viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewInvoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField dateIssued;
    private javax.swing.JButton first;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JTextField payableDate;
    private javax.swing.JButton previous;
    private javax.swing.JComboBox projectNames;
    private javax.swing.JComboBox type;
    // End of variables declaration//GEN-END:variables
}
