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
public class Invoice {
    private String nameProject;
    private String nameClient;
    private String number;
    private String dateIssue;
    private String datePay;
    private String type;
    
    public Invoice(String Project, String Client, String NUMBER, String Issue, String Pay, String type)
    {
        this.nameProject = Project;
        this.nameClient = Client;
        this.number = NUMBER;
        this.dateIssue = Issue;
        this.datePay = Pay;
        this.type = type;
    }
    
    public String getProject()
    {
        return nameProject;
    }
    
    public String getClient()
    {
        return nameClient;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public String getDatePay()
    {
        return datePay;
    }
    
    public String getDateIssue()
    {
        return dateIssue;
    }
    
    public String getType()
    {
        return type;
    }
    
}
