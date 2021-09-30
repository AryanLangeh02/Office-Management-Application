/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

/**
 *
 * @author aryanlangeh
 */
class User6 {
    private String projectname, totalamount;
    public User6(){}
    public User6(String proj, String amt) {
        this.projectname = proj;
        this.totalamount = amt;
    }

    public String getName() {
        return projectname;
    }
    
    public void setName(String proj){
        this.projectname = proj;
    }
    
    public String getAmount() {
        return totalamount;
    }
    public void setAmount(String amt){
        this.totalamount = amt;
    }
}
