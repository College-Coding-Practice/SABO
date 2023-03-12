package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mas 'Edi
 */
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException {
        try {
//            url database
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
//            user database
            String user = "root";
//            password database
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
//            perintah menampilkan error pada koneksi
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return mysqlconfig;
        
    }
    
}


