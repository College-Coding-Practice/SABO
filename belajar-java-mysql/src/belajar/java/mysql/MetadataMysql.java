/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author hp
 */
public class MetadataMysql extends JFrame{
    
    private JTextField txtURL, txtUser, txtProductName, txtProductVersion,txtDriverName, txtDriverVersion, txtVersionMayor, txtVersionMinor;
    private JPanel panel1, panel2;
    private Connection conn;
    private DatabaseMetaData dbmd;
    
    public MetadataMysql() {
        // Membuat obyek panel dan label
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(8, 1));
        panel1.add(new JLabel("URL basis data"));
        panel1.add(new JLabel("Pengguna basis data"));
        panel1.add(new JLabel("Nama produk basis data"));
        panel1.add(new JLabel("Versi produk basis data"));
        panel1.add(new JLabel("Nama driver JDBC"));
        panel1.add(new JLabel("Versi driver JDBC"));
        panel1.add(new JLabel("Versi mayor driver"));
        panel1.add(new JLabel("Versi minor driver"));
    
        // Membuat obyek text field
        txtURL = new JTextField();
        txtUser = new JTextField();
        txtProductName = new JTextField();
        txtProductVersion = new JTextField();
        txtDriverName = new JTextField();
        txtDriverVersion = new JTextField();
        txtVersionMayor = new JTextField();
        txtVersionMinor = new JTextField();
    
        // Membuat obyek panel dan menempatkan text field
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(8, 1));
        panel2.add(txtURL);
        panel2.add(txtUser);
        panel2.add(txtProductName);
        panel2.add(txtProductVersion);
        panel2.add(txtDriverName);
        panel2.add(txtDriverVersion);
        panel2.add(txtVersionMayor);
        panel2.add(txtVersionMinor);
    
        // Memanggil metoda aksesKeDB
        aksesKeDB();
        getContentPane().setLayout(new BorderLayout(4, 0));
        getContentPane().add(panel1, BorderLayout.LINE_START);
        getContentPane().add(panel2, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent we) {
                try {
                    conn.close();
                }
                catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                }
            }
        });
    }
    private void aksesKeDB() {
        // memuat driver, membuat koneksi dan obyek metadata
        conn = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan", "root", "");
                dbmd = conn.getMetaData();
                
                // Menampilkan hasil di text field
                txtURL.setText("" + dbmd.getURL());
                txtUser.setText("" + dbmd.getUserName());
                txtProductName.setText("" + dbmd.getDatabaseProductName());
                txtProductVersion.setText("" + dbmd.getDatabaseProductVersion());
                txtDriverName.setText("" + dbmd.getDriverName());
                txtDriverVersion.setText("" + dbmd.getDriverVersion());
                txtVersionMayor.setText("" + dbmd.getDriverMajorVersion());
                txtVersionMinor.setText("" + dbmd.getDriverMinorVersion());
            }
            // Memuat driver dapat memicu eksepsi ClassNotFoundException
            catch (ClassNotFoundException anf) {
                JOptionPane.showMessageDialog(null, "Kelas tidak ditemukan");
            }
            // Koneksi ke basis data dapat memicu eksepsi SQLException
            catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }
        // Metoda main
        public static void main(String[] args) {
        MetadataMysql frame = new MetadataMysql();
        frame.setTitle("Metadata MySQL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 230);
        frame.setVisible(true);
    }
}
