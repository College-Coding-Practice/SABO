// Nama file : DemoFocusEvent.<span class="highlight"rel="java">java</span>
// Mendemonstrasikan focus event
package mouse.keylistener;
// Mengimpor kelas
import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
// Deklarasi kelas
public class DemoFocusEvent extends JFrame implements FocusListener{
    
    private JButton button;
    private JTextField textField;
    private JCheckBox checkBox;
    private Font font;
    
    public DemoFocusEvent(){
        
        Container container = getContentPane();   
        container.setLayout(new GridLayout(1, 3));
        
        font = new Font ("Tahoma", Font.BOLD, 14);
        button = new JButton("JButton");
        button.setFont(font);
        container.add(button);
        
        checkBox = new JCheckBox("JCheckBox");
        checkBox.setFont(font);
        container.add(checkBox);
        
        textField = new JTextField("JTextField");
        textField.setFont(font);
        container.add(textField);
        
        button.addFocusListener(this);
        checkBox.addFocusListener(this);
        textField.addFocusListener((FocusListener) this);
    }
    // Mendeklarasikan ulang method focusGained
    public void focusGained(FocusEvent fe){
        tampilkanPesan("FOCUS GAINED :", fe);
    }
    // Mendeklarasikan ulang method focusLost
    public void focusLost(FocusEvent fe){
        tampilkanPesan("FOCUS LOST :", fe);
    }
    // Metoda tampilkanPesan
    public void tampilkanPesan (String fcsEvent, FocusEvent fe){
        System.out.println(fcsEvent + fe.getComponent() .getClass() .getName());
    }
    // Metoda main
    public static void main(String[]args){
        
        DemoFocusEvent frame = new DemoFocusEvent();
        frame.setTitle("Kelas DemoFocusEvent");
        frame.setSize(320, 90);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
