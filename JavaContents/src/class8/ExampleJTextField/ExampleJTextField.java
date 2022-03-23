/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.ExampleJTextField;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class ExampleJTextField {
    public static void main(String[] args) {
        JFrame SCREEN = new JFrame("Example JTextField");
        
        JLabel LABELNAME = new JLabel("Name");
        JLabel LABELLASTNAME = new JLabel("Last Name");
        JTextField TEXTFIELDNAME = new JTextField();
        JTextField TEXTFIELDLASTNAME = new JTextField();
        JButton BUTTONSHOWNAME = new JButton("Show");
        
        Container CONT = SCREEN.getContentPane();
        
        CONT.add(LABELNAME);
        CONT.add(LABELLASTNAME);
        CONT.add(TEXTFIELDNAME);
        CONT.add(TEXTFIELDLASTNAME);
        CONT.add(BUTTONSHOWNAME);
        
        SCREEN.setLayout(null);
        
        LABELNAME.setBounds(20, 20, 300, 30);
        TEXTFIELDNAME.setBounds(20, 50, 300, 30);
        LABELLASTNAME.setBounds(20, 80, 300, 30);
        TEXTFIELDLASTNAME.setBounds(20, 110, 300, 30);
        BUTTONSHOWNAME.setBounds(20, 140, 100, 30);
        
        SCREEN.setVisible(true);
        SCREEN.setSize(400, 400);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
