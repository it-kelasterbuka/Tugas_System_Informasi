/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import com.mysql.jdbc.Driver;
import java.sql.*;
/**
 *
 * @author Randi
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if (koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                
                url = "jdbc:mysql://localhost/demo";
                user = "root";
                password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
            }catch(SQLException t){
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    
}
