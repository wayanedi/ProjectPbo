/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */ 
public class Database {
    
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private String sql;
    private DatabaseNasabah databaseNasabah;
    
    public Database(){
        databaseNasabah = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_atm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            stat = con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connection berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Fail"+e.getMessage());
        }
    }
    
    public boolean isValidUser(String username, String password)throws SQLException{
        
        sql = "SELECT `username`, `password` FROM `usr` WHERE `username` = '" + username +"' and `password` = '"+password+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                String pw= rs.getString("password");     
                if(password.equals(pw) && username.equals(rs.getString("username"))){
                   return true;
                }
            }else{
                return false;
            }
        return false;
    }
    
    public DatabaseNasabah getData()throws SQLException{
        sql = "SELECT * FROM usr INNER JOIN nasabah on usr.id_user = nasabah.id_user where usr.id_user=1";
            rs = stat.executeQuery(sql);
            if(rs.next()){
               databaseNasabah = new DatabaseNasabah(rs.getString("nasabah.nama_lengkap"), rs.getString("nasabah.email"), rs.getString("nasabah.no_tlp"), rs.getString("nasabah.ibu_kandung"));
               
            }
        return databaseNasabah;
    }
    
//    public DatabaseNasabah[] getDs()throws SQLException{
//        return ds;
//    }
}
