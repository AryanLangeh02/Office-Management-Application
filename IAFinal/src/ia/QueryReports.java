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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aryanlangeh
 */
public class QueryReports {
    public Connection getConnection(){
        Connection con = null;
    try { 
            con = DriverManager.getConnection("jdbc:postgresql://localhost/officemanagement1",Utility.dbUser,Utility.dbPass);
}
    catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
    public ArrayList<User2>getData(String empNames){
   ArrayList<User2> list = new ArrayList<User2>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   PreparedStatement pst;
   
   try {
   st = con.createStatement();
   //rs = st.executeQuery("SELECT project_name, client_name, structure_type, delivery_date, location FROM projectdetails WHERE project_status = "+ status);
   String Query = "SELECT  project_name, project_status, total_amount FROM projectDetails WHERE head_employee = ?";
    pst = con.prepareStatement(Query);
    pst.setString(1, empNames);
    rs = pst.executeQuery();
   User2 p;
   while(rs.next()){
   p = new User2(
   rs.getString("project_name"),
   rs.getString("project_status"),
   rs.getString("total_amount")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(myQuery.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
    }
    
}
