/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class BoxLayoutExample extends JFrame {
    
    JButton bNorth, bSouth, bEast, bWest, bCenter;
    
    public BoxLayoutExample() {
        super("Box Example");
        Container cont = getContentPane();
        Box horizon = Box.createVerticalBox();
        
        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        bCenter = new JButton("Button Center");
        
        horizon.add(bCenter);
        horizon.add(bEast);
        horizon.add(bNorth);
        horizon.add(bSouth);
        horizon.add(bWest);
        
        cont.add(horizon, BorderLayout.CENTER);
        setLayout(new BoxLayout(cont, BoxLayout.PAGE_AXIS));
        
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        BoxLayoutExample boxExample = new BoxLayoutExample();
        boxExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
