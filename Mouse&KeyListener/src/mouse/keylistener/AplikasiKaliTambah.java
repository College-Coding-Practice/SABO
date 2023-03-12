/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Nama file : AplikasiKaliTambah.java
// Mendemonstrasikan penanganan aksi di Java
package mouse.keylistener;
// mengimpor kelas
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.text.DecimalFormat;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author edi
 */
public class AplikasiKaliTambah extends JFrame implements ActionListener{

    private final JTextField textNilai1;
    private final JTextField textNilai2;
    private final JTextField textHasil;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JButton buttonKali;
    private final JButton buttonTambah;
    private final JPanel panel1;
    private final JPanel panel2;
    private final JPanel panel3;
    private final Font font1;
    private final Font font2;
    private final DecimalFormat duaAngka;
    
    public AplikasiKaliTambah() {
        
        label1 = new JLabel("Nilai Pertama");
        label2 = new JLabel("Nilai Kedua");
        label3 = new JLabel("Hasil kalkulasi");
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        
        textNilai1 = new JTextField(11);
        textNilai2 = new JTextField(11);
        textHasil = new JTextField(11);
        
        // Mengatur properti dari text field
        font1 = new Font("Tahoma", Font.BOLD, 15);
        textNilai1.setHorizontalAlignment(JTextField.RIGHT);
        textNilai1.setFont(font1);
        textNilai2.setHorizontalAlignment(JTextField.RIGHT);
        textNilai2.setFont(font1);
        
        font2 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 17);
        textHasil.setHorizontalAlignment(JTextField.RIGHT);
        textHasil.setFont(font2);
        textHasil.setForeground(Color.RED);
        textHasil.setEditable(false);
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));
        panel2.add(textNilai1);
        panel2.add(textNilai2);
        panel2.add(textHasil);
        
        buttonKali = new JButton("Kali (x)");
        buttonTambah = new JButton("Tambah (+)");
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel3.add(buttonKali);
        panel3.add(buttonTambah);
        
        duaAngka = new DecimalFormat("0.00");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panel1, BorderLayout.LINE_START);
        container.add(panel2, BorderLayout.LINE_END);
        container.add(panel3, BorderLayout.PAGE_END);
        
        // Mendaftarkan listenerPage

        buttonKali.addActionListener(this);
        buttonTambah.addActionListener(this);
    }
    // Mendeklarasikan ulang metoda actionPerformed (overriding)
    public void actionPerformed(ActionEvent e) {
        
        double nilai1 = Double.parseDouble(textNilai1.getText());
        double nilai2 = Double.parseDouble(textNilai2.getText());
        
        if (e.getSource() == buttonKali) {
            textHasil.setText("" + duaAngka.format(nilai1 * nilai2));
        }
        
        else if (e.getSource() == buttonTambah) {
            textHasil.setText("" + duaAngka.format(nilai1 + nilai2));
        }
    }
    
    // Metoda main
    public static void main(String[] args) {
        AplikasiKaliTambah frame = new AplikasiKaliTambah();
        frame.setTitle("Kelas AplikasiKaliTambah");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 150);
        frame.setVisible(true);
    }
}
