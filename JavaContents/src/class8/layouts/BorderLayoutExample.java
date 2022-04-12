/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class BorderLayoutExample extends JFrame {
    JButton bNorth, bSouth, bEast, bWest, bCenter;
    
    public BorderLayoutExample() {
        super("border layout");

        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        bCenter = new JButton("Button Center");
        
        Container cont = getContentPane();
        setLayout(new BorderLayout());
        
        cont.add(bNorth, BorderLayout.NORTH);
        cont.add(bSouth, BorderLayout.SOUTH);
        cont.add(bEast, BorderLayout.EAST);
        cont.add(bWest, BorderLayout.WEST);
        cont.add(bCenter, BorderLayout.CENTER);
        
        ClosePane close = new ClosePane();
        
        setSize(400, 400);
        setVisible(true);
    }
    
    public class ClosePane implements EventListener {

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

    }
    
    public static void main(String[] args) {
        BorderLayoutExample borderExample = new BorderLayoutExample();
        borderExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
