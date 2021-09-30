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
class User1 {
    private String material, quantity, status;
    public User1(){}
    public User1(String Material, String Quantity, String Status) {
        this.material = Material;
        this.quantity = Quantity;
        this.status = Status;
    }
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String Material){
        this.material = Material;
    }
    
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String Quantity){
        this.quantity = Quantity;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String Status){
        this.status = Status;
    }
}
