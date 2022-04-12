/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.exercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


/**
 *
 * @author maumneto
 */
public class WordCounter extends JFrame {
    JLabel titleProgram;
    JTextArea inputText;
    JLabel output;
    JLabel amountWord;
    JButton count;
    
    
    public WordCounter(String title) {
        super(title);
        Container cont = getContentPane();
        Border borderBlack = BorderFactory.createLineBorder(Color.BLACK);
        // border layout actived
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        
        inputText = new JTextArea();
        output = new JLabel("Result: -");
        amountWord = new JLabel();
        titleProgram = new JLabel("Word Counter!");
        count = new JButton("Counting");

        // add the title and putting in north of border layout
        cont.add(titleProgram, BorderLayout.NORTH);
        // add the dimensions of north container
        titleProgram.setPreferredSize(new Dimension(300, 50));
        // aligning the text in the center
        titleProgram.setHorizontalAlignment(JLabel.CENTER);
        // add the text area in container
        cont.add(inputText, BorderLayout.CENTER);
        // add button in the east area
        cont.add(count, BorderLayout.EAST);
        // add border in the text area
        inputText.setBorder(borderBlack);
        cont.add(output, BorderLayout.SOUTH);
        output.setPreferredSize(new Dimension(100, 50));
        // event
        Counter c = new Counter();
        count.addActionListener(c);
        
        setSize(400, 400);
        setVisible(true);
    }
    
    private class Counter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = inputText.getText();
            int totalChar = text.length();
            output.setText("Result: " + totalChar);            
        }
    }
    
    public static void main(String[] args) {
        WordCounter counter = new WordCounter("My Word Counter");
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
