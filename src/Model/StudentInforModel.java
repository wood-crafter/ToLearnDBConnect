/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.StudentInfor;
import dbConnect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author phanh
 */
public class StudentInforModel {
    public ArrayList<StudentInfor> readAll() throws SQLException, Exception {
        StudentInfor studentInfor = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<StudentInfor> students = new ArrayList<StudentInfor>();

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement("SELECT * FROM [StudenInfor]");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                boolean isMale = rs.getBoolean("IsMale");
                int departID = rs.getInt("DepartID");
                float GPA = rs.getFloat("GPA");
                String address = rs.getString("Address");
                String ID = rs.getString("ID");
                
                studentInfor = new StudentInfor(name, isMale, departID, GPA, address, ID);
                students.add(studentInfor);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }

        return students;
    }
    public StudentInfor read(String studenttId) throws SQLException, Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        StudentInfor studentInfor = null;

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement("SELECT * FROM [StudenInfor] WHERE ID = ?");
            ps.setString(1, studenttId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                boolean isMale = rs.getBoolean("IsMale");
                int departID = rs.getInt("DepartID");
                float GPA = rs.getFloat("GPA");
                String address = rs.getString("Address");
                String ID = rs.getString("ID");
                
                studentInfor = new StudentInfor(name, isMale, departID, GPA, address, ID);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }

        return studentInfor;
    }
    
    public void insert(StudentInfor studentInfor) throws SQLException, Exception {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement("INSERT INTO StudenInfor (Name, isMale, DepartID, GPA, Address, ID) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setString(1, studentInfor.getName());
            ps.setBoolean(2, studentInfor.getGender());
            ps.setInt(3, studentInfor.getDepartID());
            ps.setFloat(4, studentInfor.getGPA());
            ps.setString(5, studentInfor.getAddress());
            ps.setString(6, studentInfor.getID().trim());
            
            ps.execute();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
    
    public void delete(String ID) throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement("DELETE FROM [StudenInfor] WHERE ID = ?;");        
            ps.setString(1, ID);
            
            ps.execute();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
    
    public void update(StudentInfor studentInfor) throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement("UPDATE [StudenInfor] SET Name = ?, IsMale = ?, DepartID = ?, GPA = ?, Address = ? WHERE ID = ?;");
            ps.setString(1, studentInfor.getName());
            ps.setBoolean(2, studentInfor.getGender());
            ps.setInt(3, studentInfor.getDepartID());
            ps.setFloat(4, studentInfor.getGPA());
            ps.setString(5, studentInfor.getAddress());
            ps.setString(6, studentInfor.getID());
            
            ps.execute();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
}
