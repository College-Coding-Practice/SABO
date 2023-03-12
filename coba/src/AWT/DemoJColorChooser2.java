/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.colorchooser.ColorSelectionModel;

/**
 *
 * @author hp
 */
public class DemoJColorChooser2 extends JFrame{
    
    private JLabel label;
    private Font font;
    private JColorChooser colorChooser;
    private TitledBorder border;
    private Color cForeground, newCForeground;
    private ColorSelectionModel model;
    private Container container;
    
    //konstruktor kelas DemoJColorChooser2
    public DemoJColorChooser2(){
        
        font = new Font ("Tahoma", Font.BOLD + Font.ITALIC, 22);
        label = new JLabel ("Java Mudah Dipelajari", JLabel.CENTER);
        label.setFont(font);
        cForeground = label.getForeground();
        
        border = new TitledBorder("Pilihan Warna Teks");
        colorChooser = new JColorChooser(cForeground);
        colorChooser.setBorder(border);
        model = colorChooser.getSelectionModel();
        
        container = getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(new BorderLayout());
        container.add(label, BorderLayout.PAGE_START);
        container.add(colorChooser, BorderLayout.CENTER);
        
        model.addChangeListener(
                new ChangeListener(){
                    public void stateChanged(ChangeEvent ce){
                        newCForeground = colorChooser.getColor();
                        label.setForeground(newCForeground);
                    }
                }
        );
    }
    //metode main
    public static void main(String[]args){
        DemoJColorChooser2 frame = new DemoJColorChooser2();
        frame.setTitle("Kelas DemoJColorChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370, 350);
        frame.setVisible(true);
                    
                
    }
    
}
