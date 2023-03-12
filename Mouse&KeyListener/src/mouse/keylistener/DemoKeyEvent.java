// Nama file : DemoKeyEvent.<span class="highlight" rel="java">java</span>
// Mendemonsatrasikan penekanan tombol <span class="highlight"rel="di">di</span> keyboard
package mouse.keylistener;
// Mengimpor kelas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Deklarasi kelas
public class DemoKeyEvent extends JFrame implements KeyListener{
    
    private String str;
    private final JLabel label;
    private final Font font;
    
    public DemoKeyEvent(){
        font = new Font("Tahoma", Font.BOLD, 30);
        label = new JLabel("", JLabel.CENTER);
        label.setFont(font);
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        Container container = getContentPane();
        container.setBackground(Color.YELLOW);
        container.add(label, BorderLayout.CENTER);
        
        addKeyListener (this);
    }
    // Deklarasi ulang
    public void keyPressed(KeyEvent ke){
        
        str = KeyEvent.getKeyText(ke.getKeyCode());
        label.setText(str);
    }
    //Deklarasi ulang
    public void keyReleased(KeyEvent ke){
        
    }
    //Deklarasi ualng
    public void KeyTeyped (KeyEvent ke){
        
        str = Character.toString(ke.getKeyChar());
        label.setText(str);
    }
    // Metoda main
    public static void main (String[]args){
        
        DemoKeyEvent frame = new DemoKeyEvent();
        frame.setTitle("Kelas DemoKeyEvent");
        frame.setSize(280, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
