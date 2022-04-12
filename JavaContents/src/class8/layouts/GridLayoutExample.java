/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class GridLayoutExample extends JFrame {
    
    JButton bNorth, bSouth, bEast, bWest;
    
    public GridLayoutExample() {
        super("grid layout");

        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        
        Container cont = getContentPane();
        setLayout(new GridLayout(2,2));
        
        cont.add(bNorth);
        cont.add(bSouth);
        cont.add(bEast);
        cont.add(bWest);
        
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        GridLayoutExample gridExample = new GridLayoutExample();
        gridExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
