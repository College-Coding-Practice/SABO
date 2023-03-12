/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse.keylistener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author edi
 */
public class EnteredExited extends JFrame{
    private final Font font;
    private final JLabel label;

    public EnteredExited() {
        
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        
        Jendela jendela = new Jendela();
        jendela.setBackground(Color.WHITE);
        container.add(jendela, BorderLayout.CENTER);
        
        font = new Font("Tahoma", Font.BOLD, 14);
        label = new JLabel("Pointer berada di luar area.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(font);
        label.setForeground(Color.BLUE);
        container.add(label, BorderLayout.PAGE_END);
    }
    class Jendela extends JPanel implements MouseListener {
        public Jendela() {
        // Meregistrasi listener
            addMouseListener(this);
        }
        // Deklarasi ulang metoda mousePressed
        public void mousePressed(MouseEvent e) {
        }
        // Deklarasi ulang metoda mouseReleased
        public void mouseReleased(MouseEvent e) {
        }
        // Deklarasi ulang metoda mouseClicked
        public void mouseClicked(MouseEvent e) {
        }
        // Deklarasi ulang metoda mouseEntered
        public void mouseEntered(MouseEvent e) {
            this.setBackground(Color.YELLOW);
            label.setText("Pointer berada di dalam area.");
        }
        // Deklarasi ulang metoda mouseExited
        public void mouseExited(MouseEvent e) {
            this.setBackground(Color.WHITE);
            label.setText("Pointer berada di luar area.");
        }
    }
    public static void main(String[] args) {
        EnteredExited frame = new EnteredExited();

        frame.setTitle("Kelas EnteredExited");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
