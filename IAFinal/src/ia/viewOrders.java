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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class viewOrders extends javax.swing.JFrame {

    /**
     * Creates new form viewOrders
     */
    public viewOrders() {
        initComponents();
        fillCombo();
    }
    int pos = 0;
    public List<Order> getOrderList()
    {
        try {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            PreparedStatement st = con.prepareStatement("SELECT * FROM orders where order_status = ?");
            st.setString(1, "In-Progress");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
            List<Order> list = new ArrayList<Order>();

            Order order;

            while(rs.next())
            {
               order = new Order(rs.getString("material_name"),rs.getString("heademployee"),rs.getString("quantity"));
               
               list.add(order);
               con.close();
            }
            return list;
            

            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public void showOrder(int index)
    {
        materialName.getModel().setSelectedItem(getOrderList().get(index).getMaterial());
        
        quantity.setText(getOrderList().get(index).getQuantity());

    }
    
    private void fillCombo() {
        try {
            Connection con = null;
                con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);

                String query = "select * from materials";
                PreparedStatement statement = con.prepareStatement(query);
                ResultSet result = statement.executeQuery();

                while (result.next()){
                String name = result.getString("material_name");
                materialName.addItem(name); 
                }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empNames = new javax.swing.JTextField();
        materialName = new javax.swing.JComboBox();
        quantity = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        complete = new javax.swing.JButton();
        first = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        last = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View/ Complete Orders");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Material: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity (kg):");

        empNames.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        empNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNamesActionPerformed(evt);
            }
        });

        materialName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        quantity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        search.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        complete.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        complete.setText("Complete");
        complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeActionPerformed(evt);
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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empNames, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                            .addComponent(materialName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(complete)
                        .addGap(33, 33, 33)
                        .addComponent(first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(last)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 50, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(materialName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(complete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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

    private void completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeActionPerformed
        // TODO add your handling code here:
        if (empNames.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "No employee name entered. Please re-check.");
        }
        else {
        try {
            // TODO add your handling code here:
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String materialname = (String) materialName.getSelectedItem();
            int amtOrdered = Integer.parseInt(quantity.getText());
            String query2 = "Select existing_quantity from materials where material_name = ?" ;
            PreparedStatement statement = con.prepareStatement(query2);
            statement.setString(1, (String)materialName.getSelectedItem());
            ResultSet rs = statement.executeQuery();
            
            int existingAmount = 0;
            if(rs.next()) {
                existingAmount = rs.getInt("existing_quantity");
                Integer newAmount = existingAmount + amtOrdered;
            
            String query = "UPDATE materials SET existing_quantity=? WHERE material_name = ?"; 
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(2, materialname);
            pstmt.setInt(1, newAmount);
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Order Completed Successfully.");
            quantity.setText("");

            String query3 = "UPDATE orders SET order_status = ? WHERE material_name = ? and heademployee = ?"; 
            PreparedStatement pstmt3 = con.prepareStatement(query3);
            pstmt3.setString(1, "Complete");
            pstmt3.setString(2, (String)materialName.getSelectedItem());
            pstmt3.setString(3, empNames.getText());
            pstmt3.executeUpdate();
            
            /*String query4 = "Select order_status from orders WHERE material_name = ? and heademployee = ?";
            PreparedStatement pstmt4 = con.prepareStatement(query4);
            pstmt3.setString(2, empNames.getText());
            pstmt3.setString(1, (String)materialName.getSelectedItem());
            ResultSet rs4 = pstmt4.executeQuery();
                if(rs4.next()){
                String query5 = "delete from orders where order_status = ?";
                PreparedStatement pstmt5 = con.prepareStatement(query5);
                pstmt5.setString(1, "Complete");
                }*/
        }
            else {
                JOptionPane.showMessageDialog(null, "No orders for this material with this employee.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(addProjectRejected.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
    }//GEN-LAST:event_completeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
            String query = "Select * from orders where heademployee = ? and material_name = ? and order_status = ?" ;
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,empNames.getText());
            statement.setObject(2,materialName.getSelectedItem());
            statement.setString(3,"In-Progress");
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String setQuantity = rs.getString("quantity"); //getting the data from the database
                quantity.setText(setQuantity);
    }
            else {
                JOptionPane.showMessageDialog(null, "This employee's orders are complete.");
            }
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void empNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNamesActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
        pos = 0;
        showOrder(pos);
    }//GEN-LAST:event_firstActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        pos--;
        if(pos < 0)
        {
            pos = 0;
        }
        showOrder(pos);
    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        pos++;
        if(pos >= getOrderList().size())
        {
            pos = getOrderList().size()-1;
        }
        showOrder(pos);
    }//GEN-LAST:event_nextActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
        pos = getOrderList().size() - 1;
        showOrder(pos);
    }//GEN-LAST:event_lastActionPerformed

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
            java.util.logging.Logger.getLogger(viewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton complete;
    private javax.swing.JTextField empNames;
    private javax.swing.JButton first;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton last;
    private javax.swing.JComboBox materialName;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
