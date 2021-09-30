/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import com.mydia.cs.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aryanlangeh
 */
public class manager extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    public manager() {
        initComponents();
          
        try {
            // TODO add your handling code here:
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            /*The code above selects the most recent user logged in
            it does so by ordering the table LoginTracker through descending order, hence 
            the DESC keyword. The account ID increases by 1 so by arranging it in descending order 
            the latest value will be at the top.
            
            Then it will pick atmost 1 value because of the keyword LIMIT 1,
            hence it picks the most recent value.*/
            PreparedStatement statement2 = con.prepareStatement(query2);
            
            ResultSet rs = statement2.executeQuery();
            if (rs.next()){
                String name1 = rs.getString("emp_name");
                jLabel4.setText("Welcome " + name1 + ".");
                //this code displays the employee name on the main interface
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(addProject.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addProject = new javax.swing.JMenuItem();
        viewStatus = new javax.swing.JMenuItem();
        viewProjectName = new javax.swing.JMenuItem();
        viewClient = new javax.swing.JMenuItem();
        viewStructureType = new javax.swing.JMenuItem();
        projectResources = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        placeOrder = new javax.swing.JMenuItem();
        Invoicing = new javax.swing.JMenu();
        viewInvoices = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        addInvoice = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        viewSales = new javax.swing.JMenuItem();
        Payments = new javax.swing.JMenu();
        addPayment = new javax.swing.JMenuItem();
        viewPaymentStatus = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        viewClients = new javax.swing.JMenuItem();
        addClients = new javax.swing.JMenuItem();
        viewAllClients = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        viewEmpReports = new javax.swing.JMenuItem();
        addCredentials = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        viewCredentials = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        addNewMaterial = new javax.swing.JMenuItem();
        editMaterial = new javax.swing.JMenuItem();
        viewMaterials = new javax.swing.JMenuItem();
        viewOrders = new javax.swing.JMenuItem();
        viewCompletedOrders = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("What would you like to do?");

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select from the menu above.");

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome Manager,");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 153, 255));
        jMenu1.setText("Projects");
        jMenu1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        addProject.setText("Add Projects");
        addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectActionPerformed(evt);
            }
        });
        jMenu1.add(addProject);

        viewStatus.setText("View by Status");
        viewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatusActionPerformed(evt);
            }
        });
        jMenu1.add(viewStatus);

        viewProjectName.setText("View by Project Name");
        viewProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProjectNameActionPerformed(evt);
            }
        });
        jMenu1.add(viewProjectName);

        viewClient.setText("View by Client ");
        viewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClientActionPerformed(evt);
            }
        });
        jMenu1.add(viewClient);

        viewStructureType.setText("View by Structure Type");
        viewStructureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStructureTypeActionPerformed(evt);
            }
        });
        jMenu1.add(viewStructureType);

        projectResources.setText("Project Resources");
        projectResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectResourcesActionPerformed(evt);
            }
        });
        jMenu1.add(projectResources);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materials");
        jMenu2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        placeOrder.setText("Place Order");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });
        jMenu2.add(placeOrder);

        jMenuBar1.add(jMenu2);

        Invoicing.setText("Invoicing");
        Invoicing.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        viewInvoices.setText("View Invoices");
        viewInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoicesActionPerformed(evt);
            }
        });
        Invoicing.add(viewInvoices);

        jMenuItem1.setText("View All Invoices");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Invoicing.add(jMenuItem1);

        addInvoice.setText("Add Invoices");
        addInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvoiceActionPerformed(evt);
            }
        });
        Invoicing.add(addInvoice);

        jMenuItem2.setText("Edit Invoices");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Invoicing.add(jMenuItem2);

        jMenuBar1.add(Invoicing);

        jMenu4.setText("Sales");
        jMenu4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        viewSales.setText("View Sales");
        viewSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSalesActionPerformed(evt);
            }
        });
        jMenu4.add(viewSales);

        jMenuBar1.add(jMenu4);

        Payments.setText("Payment");
        Payments.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        addPayment.setText("Add Payment");
        addPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPaymentActionPerformed(evt);
            }
        });
        Payments.add(addPayment);

        viewPaymentStatus.setText("View Payment Status");
        viewPaymentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPaymentStatusActionPerformed(evt);
            }
        });
        Payments.add(viewPaymentStatus);

        jMenuBar1.add(Payments);

        jMenu6.setText("Clients");
        jMenu6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        viewClients.setText("View Clients");
        viewClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClientsActionPerformed(evt);
            }
        });
        jMenu6.add(viewClients);

        addClients.setText("Add Clients");
        addClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientsActionPerformed(evt);
            }
        });
        jMenu6.add(addClients);

        viewAllClients.setText("View All Clients");
        viewAllClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllClientsActionPerformed(evt);
            }
        });
        jMenu6.add(viewAllClients);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Employees");
        jMenu7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        viewEmpReports.setText("View Employee Reports");
        viewEmpReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmpReportsActionPerformed(evt);
            }
        });
        jMenu7.add(viewEmpReports);

        addCredentials.setText("Add Employee");
        addCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCredentialsActionPerformed(evt);
            }
        });
        jMenu7.add(addCredentials);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Credentials");
        jMenu8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        viewCredentials.setText("View Credentials");
        viewCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCredentialsActionPerformed(evt);
            }
        });
        jMenu8.add(viewCredentials);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Resources");
        jMenu9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        addNewMaterial.setText("Add New Materials");
        addNewMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMaterialActionPerformed(evt);
            }
        });
        jMenu9.add(addNewMaterial);

        editMaterial.setText("Edit Materials");
        editMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMaterialActionPerformed(evt);
            }
        });
        jMenu9.add(editMaterial);

        viewMaterials.setText("View Existing Materials");
        viewMaterials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMaterialsActionPerformed(evt);
            }
        });
        jMenu9.add(viewMaterials);

        viewOrders.setText("View Orders");
        viewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersActionPerformed(evt);
            }
        });
        jMenu9.add(viewOrders);

        viewCompletedOrders.setText("View Completed Orders");
        viewCompletedOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCompletedOrdersActionPerformed(evt);
            }
        });
        jMenu9.add(viewCompletedOrders);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

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

    private void viewCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCredentialsActionPerformed
        // TODO add your handling code here:
        new viewCredentials().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewCredentialsActionPerformed

    private void addCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCredentialsActionPerformed
        // TODO add your handling code here:
        new addCredentials().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addCredentialsActionPerformed

    private void addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectActionPerformed
        // TODO add your handling code here:
        new addProject().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addProjectActionPerformed

    private void viewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatusActionPerformed
        // TODO add your handling code here:
        new viewProjectStatusNew().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewStatusActionPerformed

    private void viewProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProjectNameActionPerformed
        // TODO add your handling code here:
        new viewByProjectName().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewProjectNameActionPerformed

    private void viewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClientActionPerformed
        // TODO add your handling code here:
        new viewByClient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewClientActionPerformed

    private void viewStructureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStructureTypeActionPerformed
        // TODO add your handling code here:
        new viewStructureType().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewStructureTypeActionPerformed

    private void viewClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClientsActionPerformed
        // TODO add your handling code here:
        new viewClients().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewClientsActionPerformed

    private void addClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientsActionPerformed
        // TODO add your handling code here:
        new addClients().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addClientsActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        // TODO add your handling code here:
        new materialOrders().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_placeOrderActionPerformed

    private void addNewMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMaterialActionPerformed
        // TODO add your handling code here:
        new addNewMaterials().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewMaterialActionPerformed

    private void viewCompletedOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCompletedOrdersActionPerformed
        // TODO add your handling code here:
        new viewCompletedOrders().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewCompletedOrdersActionPerformed

    private void viewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersActionPerformed
        // TODO add your handling code here:
        new viewOrders().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewOrdersActionPerformed

    private void editMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMaterialActionPerformed
        // TODO add your handling code here:
        new EditMaterials().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editMaterialActionPerformed

    private void viewAllClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllClientsActionPerformed
        // TODO add your handling code here:
        new viewAllClients().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewAllClientsActionPerformed

    private void viewInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoicesActionPerformed
        // TODO add your handling code here:
        new viewInvoices().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewInvoicesActionPerformed

    private void addInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvoiceActionPerformed
        // TODO add your handling code here:
        new addInvoices().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addInvoiceActionPerformed

    private void viewEmpReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmpReportsActionPerformed
        // TODO add your handling code here:
        new employeeReports().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewEmpReportsActionPerformed

    private void addPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPaymentActionPerformed
        // TODO add your handling code here:
        new addPayment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addPaymentActionPerformed

    private void viewSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSalesActionPerformed
        // TODO add your handling code here:
        new sales().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewSalesActionPerformed

    private void projectResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectResourcesActionPerformed
        // TODO add your handling code here:
        new projectResources().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_projectResourcesActionPerformed

    private void viewMaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMaterialsActionPerformed
        // TODO add your handling code here:
        new viewMaterials().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewMaterialsActionPerformed

    private void viewPaymentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPaymentStatusActionPerformed
        // TODO add your handling code here:
        new viewPaymentStatus().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewPaymentStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginPageUpdated().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new viewAllInvoices().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Invoicing;
    private javax.swing.JMenu Payments;
    private javax.swing.JMenuItem addClients;
    private javax.swing.JMenuItem addCredentials;
    private javax.swing.JMenuItem addInvoice;
    private javax.swing.JMenuItem addNewMaterial;
    private javax.swing.JMenuItem addPayment;
    private javax.swing.JMenuItem addProject;
    private javax.swing.JMenuItem editMaterial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem placeOrder;
    private javax.swing.JMenuItem projectResources;
    private javax.swing.JMenuItem viewAllClients;
    private javax.swing.JMenuItem viewClient;
    private javax.swing.JMenuItem viewClients;
    private javax.swing.JMenuItem viewCompletedOrders;
    private javax.swing.JMenuItem viewCredentials;
    private javax.swing.JMenuItem viewEmpReports;
    private javax.swing.JMenuItem viewInvoices;
    private javax.swing.JMenuItem viewMaterials;
    private javax.swing.JMenuItem viewOrders;
    private javax.swing.JMenuItem viewPaymentStatus;
    private javax.swing.JMenuItem viewProjectName;
    private javax.swing.JMenuItem viewSales;
    private javax.swing.JMenuItem viewStatus;
    private javax.swing.JMenuItem viewStructureType;
    // End of variables declaration//GEN-END:variables
}
