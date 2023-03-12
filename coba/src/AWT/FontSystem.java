/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;
import java.awt.GraphicsEnvironment;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author hp
 */
public class FontSystem extends JFrame{
    public FontSystem(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        
        GraphicsEnvironment graphic;
        graphic = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] namaFont = graphic.getAvailableFontFamilyNames();
        
        String string = "";
        for (int x= 0; x < namaFont.length; x++){
            string += namaFont[x];
            string += (x < namaFont.length - 1) ? "\n" : "";
        }
        
        Font font = new Font ("Tahoma", Font.BOLD + Font.ITALIC, 11);
        JTextArea area = new JTextArea();
        area.append(string);
        area.setFont(font);
        
        JScrollPane pane = new JScrollPane(area);
        container.add(pane, BorderLayout.CENTER);
    }
    //metode main
    public static void main(String[]args){
        FontSystem frame = new FontSystem();
        frame.setTitle("Nama Font Tersedia di Sistem");
        frame.setSize(270, 170);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
    
}
