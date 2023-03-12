/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author hp
 */
public class GambarPersegiPanjang extends JApplet {

    // Metoda paint
    public void paint(Graphics g) {
    // Memanggil metoda paint <span class="highlight" rel="di">di</span>superclass
    super.paint(g);
    g.setColor(Color.ORANGE);
    g.fillRect(15, 15, 220, 60);
    }

}
