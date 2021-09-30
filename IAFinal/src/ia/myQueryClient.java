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
public class myQueryClient {
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
    public ArrayList<User>getData(String client){
   ArrayList<User> list = new ArrayList<User>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   PreparedStatement pst;
   
   try {
       String query2 = "select emp_name from LoginTracker order by id DESC LIMIT 1";
            PreparedStatement statement2 = con.prepareStatement(query2);
            ResultSet rs1 = statement2.executeQuery(); 
                if (rs1.next()){
                    String name1 = rs1.getString("emp_name");
                    
                    
   st = con.createStatement();
   //rs = st.executeQuery("SELECT project_name, client_name, structure_type, delivery_date, location FROM projectdetails WHERE project_status = "+ status);
   String Query = "SELECT  project_name, client_name, structure_type, delivery_date, location, project_status FROM projectdetails WHERE client_name = ? and head_employee = ?";
    pst = con.prepareStatement(Query); 
    pst.setString(1, client);
    pst.setString(2, name1);
    rs = pst.executeQuery();
   User p;
   while(rs.next()){
   p = new User(
   rs.getString("project_name"),
   rs.getString("client_name"),
   rs.getString("structure_type"),
   rs.getString("delivery_date"),
   rs.getString("location"),
   rs.getString("project_status")
           
   
   );
   list.add(p);
   }
}
   
   } catch (SQLException ex) {
   Logger.getLogger(myQuery.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
}
