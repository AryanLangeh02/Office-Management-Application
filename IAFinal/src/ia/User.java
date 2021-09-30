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
class User {
    private String projectname, clientname, structuretype, deliverydate, Location, status;
    public User(){}
    public User(String ProjectName, String clientName, String structureType, String deliveryDate, String location, String Status) {
        this.projectname = ProjectName;
        this.clientname = clientName;
        this.deliverydate = deliveryDate;
        this.structuretype = structureType;
        this.Location = location;
        this.status = Status;
    }
    public String getProjectName() {
        return projectname;
    }
    public void setProjectName(String ProjectName){
        this.projectname = ProjectName;
    }
    public String getclientName() {
        return clientname;
    }
    public void setclientName(String clientName){
        this.clientname = clientName;
    }
    public String getdeliveryDate() {
        return deliverydate;
    }
    public void setdeliveryDate(String deliveryDate){
        this.deliverydate = deliveryDate;
    }
    public String getstructureType() {
        return structuretype;
    }
    public void setstructureType(String structureType){
        this.structuretype = structureType;
    }
    public String getlocation() {
        return Location;
    }
    public void setlocation(String location){
        this.Location = location;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String Status){
        this.status = Status;
    } 
}
