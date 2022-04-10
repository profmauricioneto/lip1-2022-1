/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 *
 * @author maumneto
 */
public class JTextAreaExample extends JFrame {
    JTextArea tInput, tOutput;
    JButton okButton;
    public JTextAreaExample() {
        super("JTextArea");
        tInput = new JTextArea("write something...");
        tOutput = new JTextArea();
        okButton = new JButton("Ok");
        
        Border borderBlack = BorderFactory.createLineBorder(Color.BLACK);
        Border borderRed = BorderFactory.createLineBorder(Color.RED);
        Container cont = getContentPane();
        setLayout(null);
        
        cont.add(tInput);
        cont.add(tOutput);
        cont.add(okButton);
        
        tInput.setBounds(20, 20, 350, 100);
        okButton.setBounds(175, 120, 50, 30);
        tOutput.setBounds(20, 150, 350, 100);
        tInput.setBorder(borderBlack);
        tOutput.setBorder(borderRed);
        
        RepeatText repeat = new RepeatText();
        okButton.addActionListener(repeat);
        
        setSize(400,400);
        setVisible(true);   
    }
    
    public class RepeatText implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String textInput = tInput.getText();
            tOutput.setText(textInput);
            tInput.setText("");
        }
        
    }
    
    public static void main(String[] args) {
        JTextAreaExample jtextarea = new JTextAreaExample();
        jtextarea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
