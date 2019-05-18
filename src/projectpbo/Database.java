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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */ 
public class Database {
    
    private int id_user;
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private String sql;
    private DatabaseNasabah databaseNasabah;
    private Rekening rekening;
    private DataPekerja dataPekerja;
    private ArrayList<DatabaseLog> data = new ArrayList<DatabaseLog>();
    
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
        
        sql = "SELECT `username`, `password`, `id_user` FROM `usr` WHERE `username` = '" + username +"' and `password` = '"+password+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                String pw= rs.getString("password");     
                if(password.equals(pw) && username.equals(rs.getString("username"))){
                    this.id_user = rs.getInt("id_user");
                   return true;
                }
            }else{
                return false;
            }
        return false;
    }
    
    public Rekening getData()throws SQLException{
        sql = "SELECT * FROM rekening INNER JOIN nasabah on rekening.id_user = nasabah.id_user INNER JOIN data_pekerja on nasabah.id_user = data_pekerja.id_pekerja INNER JOIN log on log.id_user = nasabah.id_user where rekening.id_user='"+this.id_user+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
               databaseNasabah = new DatabaseNasabah(rs.getString("nasabah.nama_lengkap"), rs.getString("nasabah.email"), rs.getString("nasabah.no_tlp"), rs.getString("nasabah.ibu_kandung"), this.id_user, rs.getString("log.keterangan"), rs.getDouble("log.debit"), rs.getDouble("log.kredit")); 
               dataPekerja = new DataPekerja(rs.getString("data_pekerja.jenis_pekerjaan"), rs.getString("data_pekerja.nama_kantor"), rs.getString("data_pekerja.jabatan"), rs.getString("data_pekerja.alamat_kantor"), rs.getString("data_pekerja.pendapatan"));
            
               if(rs.getString("rekening.jenis_rekening").equals("biasa")){
                   rekening = new RekeningBiasa(databaseNasabah, dataPekerja, rs.getDouble("rekening.saldo"), rs.getString("no_rekening"));
               }
               else if(rs.getString("rekening.jenis_rekening").equals("bisnis")){
                   rekening = new RekeningBisnis(databaseNasabah, dataPekerja, rs.getDouble("rekening.saldo"), rs.getString("no_rekening"));
               }
            }
        return rekening;
    }
    
     public ArrayList<DatabaseLog> getLog(){
            try{
                sql = "SELECT * FROM log where id_user='"+this.id_user+"'";
                rs = stat.executeQuery(sql);
                while(rs.next()){
                        
                    DatabaseLog log = new DatabaseLog(rs.getString("tanggal"), rs.getString("keterangan"), rs.getString("kredit"), rs.getString("debit"));
                    data.add(log);
                    }
       
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
             return data;
    }
}
