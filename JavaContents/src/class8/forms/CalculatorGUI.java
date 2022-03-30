/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

/**
 *
 * @author maumneto
 */
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JDialog;

/**
 *
 * @author maumneto
 */
public class CalculatorGUI extends JFrame{
    // user's input
    JTextField ENTER1;
    JTextField ENTER2;
    // calc buttons
    JButton SUMBUTTON;
    JButton MINUSBUTTON;
    JButton MULTBUTTON;
    JButton DIVBUTTON;
    // labels
    JLabel ROTULO1;
    JLabel ROTULO2;
    JLabel RESULT;
    
    public CalculatorGUI(String title) {
        super(title);
        Container container = getContentPane();
        // instances
        SUMBUTTON = new JButton("+");
        MINUSBUTTON = new JButton("-");
        MULTBUTTON = new JButton("*");
        DIVBUTTON = new JButton("/");
        ENTER1 = new JTextField();
        ENTER2 = new JTextField();
        ROTULO1 = new JLabel("Valor 1: ");
        ROTULO2 = new JLabel("Valor 2: ");       
        RESULT = new JLabel("O resultado é: ");
        // setting layout manager as null
        setLayout(null);
        // add elements in the frame
        container.add(ROTULO1);
        container.add(ENTER1);
        container.add(ROTULO2);
        container.add(ENTER2);
        container.add(SUMBUTTON);
        container.add(MINUSBUTTON);
        container.add(MULTBUTTON);
        container.add(DIVBUTTON);
        container.add(RESULT);
        
        // adjusting the location of the elements in frame
        ROTULO1.setBounds(30, 30, 110, 20);
        ENTER1.setBounds(80, 30, 110, 20);
        ROTULO2.setBounds(30, 60, 110, 20);
        ENTER2.setBounds(80, 60, 110, 20);
        SUMBUTTON.setBounds(30, 90, 50, 30);
        MINUSBUTTON.setBounds(80, 90, 50, 30);
        MULTBUTTON.setBounds(130, 90, 50, 30);
        DIVBUTTON.setBounds(180, 90, 50, 30);
        RESULT.setBounds(30, 130, 150, 30);
        
        // instances of inner classes (actions)
        SumOption sum = new SumOption();
        MinusOption minus = new MinusOption();
        MultOption multi = new MultOption();
        DivOption div = new DivOption();
        // add a action for each button
        SUMBUTTON.addActionListener(sum);
        MINUSBUTTON.addActionListener(minus);
        MULTBUTTON.addActionListener(multi);
        DIVBUTTON.addActionListener(div);
        // setting the frame
        setSize(300, 250);
        setVisible(true);
    }
    // class with the action of sum button
    private class SumOption implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 + value2;
            RESULT.setText("Resultado: " + res);
        }
    }
    // class with the action of minus button
    private class MinusOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)  {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 - value2;
            RESULT.setText("Resultado: " + res);       
        }
    }
    // class with the action of multiply button  
    private class MultOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 * value2;
            RESULT.setText("Resultado: " + res);       
        }
    }
    // class with the action of divide button
    private class DivOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            if (value2 == 0) {
                RESULT.setText("Resultado: -inf"); 
            } else {
                double res = value1 / value2;
                RESULT.setText("Resultado: " + res);
            }
        }
    }
    /**
     * main class
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        CalculatorGUI calculadora = new CalculatorGUI("Simple Calculator");
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
