/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
/**
 *
 * @author HarryHarkespan
 */
public class Connection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/test?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "";
    
    public static java.sql.Connection conn;
    public static Statement stmt;
    public static ResultSet rs;
 
    public static void koneksi()
    {
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
