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
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Set;
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
        JLabel RESULTLABEL = new JLabel("");

        Container CONT = SCREEN.getContentPane();

        CONT.add(LABELNAME);
        CONT.add(LABELLASTNAME);
        CONT.add(TEXTFIELDNAME);
        CONT.add(TEXTFIELDLASTNAME);
        CONT.add(BUTTONSHOWNAME);
        CONT.add(RESULTLABEL);

        SCREEN.setLayout(null);

        LABELNAME.setBounds(20, 20, 300, 30);
        TEXTFIELDNAME.setBounds(20, 50, 300, 30);
        LABELLASTNAME.setBounds(20, 80, 300, 30);
        TEXTFIELDLASTNAME.setBounds(20, 110, 300, 30);
        BUTTONSHOWNAME.setBounds(20, 140, 100, 30);
        RESULTLABEL.setBounds(20, 170, 300, 30);

        BUTTONSHOWNAME.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = TEXTFIELDNAME.getText();
                String lastName = TEXTFIELDLASTNAME.getText();
                if (name.equals("")) {
                    String nameResult = JOptionPane.showInputDialog(null, "Enter with your first name: ", "Error First Name", 1);
                    TEXTFIELDNAME.setText(nameResult);
                } else if (lastName.equals("")) {
                    String lastNameResult = JOptionPane.showInputDialog(null, "Enter with your last name: ", "Error Last Name", 1);
                    TEXTFIELDLASTNAME.setText(lastNameResult);
                } else {
                    String hello = "Hello Mr(s) " + name + " " + lastName;
                    RESULTLABEL.setText(hello);
                    TEXTFIELDNAME.setText("");
                    TEXTFIELDLASTNAME.setText("");
                }

            }
        });

        SCREEN.setVisible(true);
        SCREEN.setSize(400, 400);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
