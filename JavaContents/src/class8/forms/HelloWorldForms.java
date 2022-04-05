/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;


/**
 *
 * @author maumneto
 */
public class HelloWorldForms extends JFrame {
    public JLabel output;
    public JButton okButton;
    public JTextField input;
    
    public HelloWorldForms(String title) {
        super(title);
        output = new JLabel("waiting for something...");
        okButton = new JButton("Ok");
        input = new JTextField();
        
        Container container = getContentPane();
        setLayout(null);
        
        container.add(output);
        container.add(okButton);
        container.add(input);
        
        input.setBounds(20, 20, 250, 30);
        okButton.setBounds(20, 50, 50, 30);
        output.setBounds(20, 80, 250, 30);
        
        ButtonEvent event = new ButtonEvent();
        okButton.addActionListener(event);
        
        setSize(300, 300);
        setVisible(true);
    }
    
    public class ButtonEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String data = input.getText();
            output.setText(data);
        }
    }
    
    public static void main(String[] args) {
        HelloWorldForms myForm = new HelloWorldForms("My First Form");
        myForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}












