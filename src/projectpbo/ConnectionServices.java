/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
 

/**
 *
 * @author handihand53
 */
public class ConnectionServices {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_atm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            stm = con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connection berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Fail"+e.getMessage());
        }
    }
    
}