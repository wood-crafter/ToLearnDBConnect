/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author phanh
 */
public class Department {
    private String DepartID;
    private String DepartName;
    private String DepartInfor;

    public Department(String DepartID, String DepartName, String DepartInfor) {
        this.DepartID = DepartID;
        this.DepartName = DepartName;
        this.DepartInfor = DepartInfor;
    }

    public String getDepartID() {
        return DepartID;
    }

    public void setDepartID(String DepartID) {
        this.DepartID = DepartID;
    }

    public String getDepartName() {
        return DepartName;
    }

    public void setDepartName(String DepartName) {
        this.DepartName = DepartName;
    }

    public String getDepartInfor() {
        return DepartInfor;
    }

    public void setDepartInfor(String DepartInfor) {
        this.DepartInfor = DepartInfor;
    }
    
    
}
