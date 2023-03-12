/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudbuku;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class BukuCRUD {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/buku";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader (inputStreamReader);
    
    public static void main (String[]args){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            while(!conn.isClosed()){
                showMenu();
            }
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void showMenu(){
        System.out.println("\n=======MENU UTAMA=======");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.println("PILIHAN>");
        
        try{
            int pilihan = Integer.parseInt(input.readLine());
            switch(pilihan){
                case 0:
                System.exit(0);
                break;
                
                case 1:
                insertBook();
                break;
                
                case 2:
                showData();
                break;
                
                case 3:
                updateBook();
                break;
                
                case 4:
                deleteBook();
                break;
                default:
                    System.out.println("Pilihan salah!");
                    
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void showData(){
        String sql = "SELECT * FROM book";
        
        try{
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------");
            System.out.println("|   BEBAGAI JENIS BUKU   |");
            System.out.println("+--------------------");
            
            while (rs.next()){
                int idBuku = rs.getInt("id_buku");
                String nama = rs.getString("nama");
                String jenis = rs.getString("jenis");
                
                System.out.println(String.format("%d. %s--(%s)", idBuku, nama, jenis));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void insertBook(){
        try{
            System.out.println("Nama:");
            String nama = input.readLine().trim();
            System.out.println("Jenis:");
            String jenis = input.readLine().trim();
            
            String sql = "INSERT INTO book (nama, jenis) VALUE('%s', '%s')";
            sql = String.format(sql, nama, jenis);
            
            stmt.execute(sql); 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void updateBook(){
        try{
            System.out.println("ID yang mau diedit:");
            int idBook = Integer.parseInt(input.readLine());
            String nama = input.readLine().trim();
            System.out.println("Jenis:");
            String jenis = input.readLine().trim();
            System.out.println("Jenis:");
            
            String sql = "UPDATE bokk SET nama='%s', jenis='%s' WHERE id_book='%d'";
            sql = String.format(sql, nama, jenis, idBook);
            
            stmt.execute(sql); 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void deleteBook(){
        try{
            System.out.println("ID yang mau dihapus:");
            int idBook = Integer.parseInt(input.readLine());
            
            String sql = String.format("DELETE FROM bokk WHERE id_book='%d'", idBook);
            
            stmt.execute(sql); 
            System.out.println("Data telah dihapus...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
