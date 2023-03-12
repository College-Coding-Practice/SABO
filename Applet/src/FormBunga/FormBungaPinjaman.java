/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormBunga;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author hp
 */
public class FormBungaPinjaman extends JApplet {

    // Deklarasi variabel acuan
    private JLabel label1, label2, label3, label4;
    private JTextField field1, field2, field3, field4;
    private JButton button;
    private JPanel panel1, panel2, panel3, panel4;
    public void init() {
    // Membuat obyek label dan panel1
    label1 = new JLabel("Pinjaman Bank");
    label2 = new JLabel("Bunga Pinjaman");
    label3 = new JLabel("Jangka Waktu Pinjaman");
    label4 = new JLabel("Total Uang Dibayar");
    panel1 = new JPanel();
    panel1.setLayout(new GridLayout(4, 1));
    panel1.add(label1);
    panel2.add(label2);
    panel3.add(label3);
    panel4.add(label4);
    // Membuat obyek field dan panel2
    field1 = new JTextField(18);
    field2 = new JTextField(18);
    field3 = new JTextField(18);
    field4 = new JTextField(18);
    panel2 = new JPanel();
    panel2.setLayout(new GridLayout(4, 1));
    panel2.add(field1);
    panel2.add(field2);
    panel2.add(field3);
    panel2.add(field4);
    // Membuat obyek button dan panel3
    button = new JButton("Hitung");
    panel3 = new JPanel();
    panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
    panel3.add(button);
    // Meletakkan panel1 dan panel2 <span class="highlight"rel="di">di</span> panel4
    panel4 = new JPanel();
    panel4.setBorder(new TitledBorder("Form Bunga Pinjaman"));
    panel4.setLayout(new BorderLayout());
    panel4.add(panel1, BorderLayout.LINE_START);
    panel4.add(panel2, BorderLayout.LINE_END);
    // Meletakkan panel3 dan panel4 <span class="highlight"rel="di">di</span> <span class="highlight" rel="applet">applet</span>
    getContentPane().add(panel4, BorderLayout.PAGE_START);
    getContentPane().add(panel3, BorderLayout.PAGE_END);
    }
}

