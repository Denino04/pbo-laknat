/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

public class Database {
    Connector Conn = new Connector();
        
        public void InsertKerucut(double LuasKerucut, double VolumeKerucut){
            try {
                String query = "INSERT INTO hasil(Luas, Volume) VALUES ('"+LuasKerucut+"', '"+VolumeKerucut+"')";
                Conn.statement = Conn.Conn.createStatement();
                Conn.statement.executeUpdate(query);
                Conn.statement.close();
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }   
        }
        
        public void InsertTerpancung(double VolumeTerpancung){
            try {
                String query = "INSERT INTO hasil2(VolumeTerpancung) VALUES ('"+VolumeTerpancung+"')";
                Conn.statement = Conn.Conn.createStatement();
                Conn.statement.executeUpdate(query);
                Conn.statement.close();
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
}
