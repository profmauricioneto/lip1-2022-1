/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class JPasswordExample extends JFrame {
    JLabel lLogin, lPass;
    JButton enter;
    JTextField tLogin;
    JPasswordField tPass;
    
    public JPasswordExample() {
        super("My Login Example");
        
        Container cont = getContentPane();
        setLayout(null);
        
        lLogin = new JLabel("Login");
        lPass = new JLabel("Password");
        enter = new JButton("enter");
        tLogin = new JTextField();
        tPass = new JPasswordField();
        
        cont.add(lLogin);
        cont.add(lPass);
        cont.add(enter);
        cont.add(tLogin);
        cont.add(tPass);
        
        lLogin.setBounds(20, 20, 50, 30);
        tLogin.setBounds(70, 20, 150, 30);
        lPass.setBounds(20, 60, 100, 30);
        tPass.setBounds(110, 60, 150, 30);
        enter.setBounds(140, 100, 60, 30);
        
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        JPasswordExample jpassword = new JPasswordExample();
        jpassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
