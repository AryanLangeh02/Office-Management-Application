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
class User2 {
    private String proj_name, status, amount;
    public User2(){}
    public User2(String ProjectName, String Status, String Amount) {
        this.proj_name = ProjectName;
        this.status = Status;
        this.amount = Amount;
    }
    public String getName() {
        return proj_name;
    }
    
    public void setName(String ProjectName){
        this.proj_name = ProjectName;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String Status){
        this.status = Status;
    }
    
    public String getAmount() {
        return amount;
    }
    public void setAmount(String Amount){
        this.amount = Amount;
    }
}
