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
public class StudentInfor {
    String name;
    Boolean gender;
        int DepartID;
        Float GPA;
        String Address;
        String ID;
        private boolean update = false;

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }
        

        String[] depart = {"Ki thuat phan mem", "Kinh te", "Marketing", "Do Hoa"};
    public StudentInfor(String name,Boolean gender, int DepartID, Float GPA, String Address, String ID) {
        this.name = name;
        this.gender = gender;
        this.DepartID = DepartID;
        this.GPA = GPA;
        this.Address = Address;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int getDepartID() {
        return DepartID;
    }

    public void setDepartID(int DepartID) {
        this.DepartID = DepartID;
    }

    public Float getGPA() {
        return GPA;
    }

    public void setGPA(Float GPA) {
        this.GPA = GPA;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString(){
        return name + "|" + gender + "|" + depart[DepartID - 1] + "|" + GPA +"|" +Address + "|" + ID;
    }
    
}
