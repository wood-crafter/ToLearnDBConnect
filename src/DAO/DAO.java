/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.StudentInfor;
import java.awt.List;
import java.sql.*;
import java.util.HashSet;
import java.util.Vector;

/**
 *
 * @author phanh
 */
public class DAO {
    Connection con;
    private List<StudentInfor> student = new List<>();
    
    public DAO(){
        initConnection();
    }
    private void initConnection(){
        try{
            con = new DBContext().getConnection();
        } catch(Exception e){  
        }
        
        HashSet <String> hs;
        void getListStudent(String sql){
        student = new Vector<StudentInfor>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                hs.add(rs.getString(6));
                student.add(new StudentInfor(
                rs.getString(1),
                rs.getBoolean(2),
                rs.getInt(3),
                rs.getFloat(4),
                rs.getString(5),
                rs.getString(6)
                ));
            }
        } catch(Exception e){   
        }
        
        }
    }
    
    void putListToDB(){
        Vector<Student> myStu = new Vector<>();
        for(int i = 0; i < student.size(); i++){
            myStu.add(student.get(i));
        }
        for(int i = 0; i < myStu.size(); i++){
            StudentInfor st = myStu.get(i);
            if(hs.contains(st.getID())){
                if(st.isUpdate()){
                    // update
                }
                hs.remove(st.getID());
                student.remove(i);
                i--;
            }
        }
        
        for(int i = 0; i < hs.size(); i++){
            //Delete record that having hs.get(i)
        }
        
        for(int i = 0; i < hs.size(); i++){
            //insert record that having hs.get(i)
            StudentInfor st = student.get(i);
//            String sql = "INSERT INTO studeninfor value (" +
//                    st.getID() + ", " + st.getName() + ", " + st.getAddress()+ ", " + st.() 
            myQueue(sql);
        }
    }
    hs = new HashSet<String>();
    void myQueue(String sql){
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
        }
    }
}
