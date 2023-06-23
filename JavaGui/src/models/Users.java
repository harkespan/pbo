/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.*;

/**
 *
 * @author HarryHarkespan
 */
public class Users {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/test?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public int checkUser(String uname, String paswd){
       try{
            Class.forName(JDBC_DRIVER);	   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE username=? AND paswd=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,uname);
            ps.setString(2,paswd);
            ps.execute();
            rs = ps.executeQuery();
            int count = 0;
           while(rs.next()){
               count++;
           }
           return count;
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return 0;
       }
    }
}
