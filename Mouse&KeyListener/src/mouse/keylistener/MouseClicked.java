/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse.keylistener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
/**
 *
 * @author edi
 */
public class MouseClicked extends JFrame{
    
    private int koX, koY;
    private Font font;
    
    // Konstruktor kelas MouseClicked
    public MouseClicked() {
    
        setTitle("Kelas MouseClicked");
        addMouseListener((MouseListener) new PenanganMouse());
        setSize(280, 130);
        setVisible(true);
    }
    
    // Deklarasi inner class PenanganMousePage
    class PenanganMouse extends MouseAdapter {
        
        public void mouseClicked(MouseEvent e){
            koX = e.getX();
            koY = e.getY();
            repaint();
        }
    }
    
    // Metoda paint untuk menggambar string
    public void paint(Graphics g) {
    
        super.paint(g);
    
        font = new Font("Tahoma", Font.BOLD, 14);
        g.setFont(font);
        g.setColor(Color.RED);
        g.drawString("[" + koX + ", " + koY + "]", koX, koY);
    }
    
    // Metoda main
    public static void main(String[] args) {
        MouseClicked frame = new MouseClicked();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
