/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class FlowLayoutExample extends JFrame {
    
        JButton bNorth, bSouth, bEast, bWest, bCenter;
        JLabel label1;
        JTextField text1;
    
    public FlowLayoutExample() {
        super("flow layout");
        
        text1 = new JTextField("            ");
        label1 = new JLabel("Nome");
        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        bCenter = new JButton("Button Center");
        
        Container cont = getContentPane();
        setLayout(new FlowLayout());
        
        cont.add(label1);
        cont.add(text1);
        cont.add(bNorth);
        cont.add(bSouth);
        cont.add(bEast);
        cont.add(bWest);
        cont.add(bCenter);
        
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        FlowLayoutExample flowExample = new FlowLayoutExample();
        flowExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
