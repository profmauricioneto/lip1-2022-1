/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class RadioButtonExample extends JFrame {
    JRadioButton buttonMasc;
    JRadioButton buttonFem;
    JLabel output;
    JLabel label1;
    JLabel label2;
    JTextField input;
    JButton okButton;
    
    public RadioButtonExample() {
        super("Radio Button Example");
        
        Container container = getContentPane();
        ButtonGroup radioGroup = new ButtonGroup();
        
        buttonFem = new JRadioButton("Feminino", true);
        buttonMasc = new JRadioButton("Masculino");
        label1 = new JLabel("Fullname: ");
        label2 = new JLabel("Select your gender: ");
        okButton = new JButton("Ok");
        output = new JLabel("output");
        input = new JTextField();
        
        setLayout(null);
        
        radioGroup.add(buttonFem);
        radioGroup.add(buttonMasc);
        
        container.add(buttonFem);
        container.add(buttonMasc);
        container.add(label1);
        container.add(label2);
        container.add(okButton);
        container.add(output);
        container.add(input);
        
        label1.setBounds(30, 30, 80, 20);
        input.setBounds(120, 30, 150, 20);
        label2.setBounds(30, 60, 130, 20);
        buttonFem.setBounds(160, 60, 100, 20);
        buttonMasc.setBounds(160, 80, 100, 20);
        okButton.setBounds(120, 120, 70, 20);
        output.setBounds(30, 150, 300, 20);
        
        RadioAction action = new RadioAction();
        okButton.addActionListener(action);
        
        setSize(400, 250);
        setVisible(true);
    }
    public class RadioAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String outputMessage;
            if (buttonFem.isSelected() == true) {
                outputMessage = "Hello Ms. " + input.getText();
            output.setText(outputMessage);
            } if (buttonMasc.isSelected() == true) {
                outputMessage = "Hello Mr. " + input.getText();
                output.setText(outputMessage);
            }
            input.setText("");
            input.requestFocus();
        }
        
    }
            
            
    public static void main(String[] args) {
        RadioButtonExample radioExample = new RadioButtonExample();
        radioExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
