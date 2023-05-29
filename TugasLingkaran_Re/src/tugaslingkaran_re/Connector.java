/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ASUS ROG
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/pbo";
    String DBusername = "root";
    String DBpassword = "";
    Connection Conn;
    Statement statement;

    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conn = (Connection)DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch (Exception e){
            System.out.println("Koneksi gagal");
        }
    }

}
