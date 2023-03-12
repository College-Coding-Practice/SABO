/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JApplet;

/**
 *
 * @author edi
 */
public class AppletPertama extends JApplet {

    
    // Mendefinisikan ulang metoda paint
    public void paint(Graphics g) {
    // Memanggil ulang metoda paint superclass
    super.paint(g);
    // Mengatur tampilan string
    Font font = new Font("Tahoma", Font.BOLD, 16);
    g.setFont(font);
    g.setColor(Color.RED);
    // Menggambar literal string
    g.drawString("Mari belajar Bahasa Java", 25, 30);
    }
}
