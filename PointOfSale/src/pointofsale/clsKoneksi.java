/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;
import java.sql.*;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author edi
 */
public class clsKoneksi {
    Connection Conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public static Connection Koneksi(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            Connection Conn = null;
            DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Acces Driver(*.mdb)};DBQ=POS.mdb");
            
            return Conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
