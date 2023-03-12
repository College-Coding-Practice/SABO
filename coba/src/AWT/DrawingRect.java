/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class DrawingRect extends JFrame{
    //Konstruktor kelas DrawingRect
    public DrawingRect(){
        super("Kelas DrawingRect");
        setSize(260, 165);
        setVisible(true);
    }
    
    //Metode paint
    public void paint (Graphics g){
        //memanggil metode paint dari superclass
        super.paint(g);
        
        //mengatur warna
        g.setColor(Color.RED);
        g.drawRect(20, 40, 220, 50);
        
        g.setColor(Color.BLUE);
        g.fillRect(20, 100, 220, 50);
    }
    
    //Metode main
    public static void main(String[]args){
        DrawingRect frame = new DrawingRect();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
    
}
