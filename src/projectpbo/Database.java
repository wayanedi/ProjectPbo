/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import java.sql.Connection;
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
    
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public Database(){
        ConnectionServices db = new ConnectionServices();  //panggil kelas koneksi ke db
        
        db.config(); //panggil methode config di objek db --> coba buat koneksi ke db
        
        // inisialisasi
        con = db.con; 
        stat = db.stm;
    }
    
    public boolean isValidUser(String username, String password)throws SQLException{
        
        Connection cons;
        PreparedStatement ps;
        
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
}
