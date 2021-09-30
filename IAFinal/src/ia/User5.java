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
class User5 {
    private String projectname, totalamount, outstandingamount, amountpaid, payabledate;
    public User5(){}
    public User5(String proj, String amt, String out, String paid, String date) {
        this.projectname = proj;
        this.totalamount = amt;
        this.outstandingamount = out;
        this.amountpaid = paid;
        this.payabledate = date;
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
    public String getOutstanding() {
        return outstandingamount;
    }
    public void setOutstanding(String out){
        this.outstandingamount = out;
    }
    public String getPaid() {
        return amountpaid;
    }
    public void setPaid(String paid){
        this.amountpaid = paid;
    }
    public String getDate() {
        return payabledate;
    }
    public void setDate(String date){
        this.payabledate = date;
    }
}
