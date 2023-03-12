/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletKedua;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author hp
 */
public class AppletKedua extends JApplet {

    // Mendefinisikan ulang metoda paint
    public void paint(Graphics g) {
    // Memanggil ulang metoda paint superclass
    super.paint(g);
    // Mendapatkan nilai parameter <span class="highlight"rel="di">di</span> dokumen HTML
    String jenisHuruf = getParameter("JENISHURUF");
    String string = getParameter("STRING");
    int ukuranHuruf = Integer.parseInt(getParameter("UKURANHURUF"));
    int posisiX = Integer.parseInt(getParameter("POSISIX"));
    int posisiY = Integer.parseInt(getParameter("POSISIY"));
    // Mengatur tampilan string
    Font font = new Font(jenisHuruf, Font.BOLD, ukuranHuruf);
    g.setFont(font);
    g.setColor(Color.BLUE);
    // Menggambar literal string
    g.drawString(string, posisiX, posisiY);
    }

}
