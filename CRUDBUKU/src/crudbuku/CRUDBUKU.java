/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudbuku;
import java.sql.*;
/**
 *
 * @author hp
 */
public class CRUDBUKU {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/buku";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stm;
    static ResultSet rs;

    public static void main(String[] args) {
    
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM book";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("ID BUKU:" + rs.getInt("id_buku"));
                System.out.println("Nama:" + rs.getString("nama"));
                System.out.println("Jenis:" + rs.getString("jenis"));
            }
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
    }   
    }
}
