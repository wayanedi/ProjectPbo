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
    private DatabaseNasabah databaseNasabah[];
    private DatabaseNasabah ds[];
    
    public Database(){
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
                    ds = new DatabaseNasabah[2];
                    ds = getData();
                   return true;
                }
            }else{
                return false;
            }
        return false;
    }
    
    public DatabaseNasabah[] getData()throws SQLException{
        databaseNasabah = new DatabaseNasabah[2];
        sql = "SELECT data_pekerja.jenis_pekerjaan, data_pekerja.nama_kantor, data_pekerja.jabatan, data_pekerja.alamat_kantor, data_pekerja.pendapatan, rekening.no_rekening, rekening.id_nasabah, rekening.id_pekerjaan, rekening.jenis_rekening, rekening.saldo FROM `rekening` INNER JOIN `data_pekerja` on data_pekerja.id_pekerja = rekening.id_pekerjaan";
            rs = stat.executeQuery(sql);
            if(rs.next()){
               int i=0;
               databaseNasabah[i] = new DatabaseNasabah(rs.getString("no_rekening"), rs.getString("jenis_rekening"), rs.getDouble("saldo"));
               i++;
            }
        return databaseNasabah;
    }
    
    public DatabaseNasabah[] getDs()throws SQLException{
        return ds;
    }
}
