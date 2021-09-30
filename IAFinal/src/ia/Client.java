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
public class Client {
    private String name;
    private String number;
    private String email;
    private String date;
    private String numOrders;
    
    public Client(String NAME, String NUMBER, String EMAIL, String DATE, String NUMORDERS)
    {
        this.number = NUMBER;
        this.name = NAME;
        this.email = EMAIL;
        this.date = DATE;
        this.numOrders = NUMORDERS;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getNumOrders()
    {
        return numOrders;
    }
    
}
