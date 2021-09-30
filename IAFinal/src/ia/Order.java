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
public class Order {
    private String materialName;
    private String employeeName;
    private String quantity;
    
    public Order(String NAME, String EMP, String QUANTITY)
    {
        this.materialName = NAME;
        this.employeeName = EMP;
        this.quantity = QUANTITY;
    }
    
    public String getMaterial()
    {
        return materialName;
    }
    
    public String getEmployee()
    {
        return employeeName;
    }
    
    public String getQuantity()
    {
        return quantity;
    }
    
    
}