/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class JComboBoxExample extends JFrame {
    JLabel lName, lAge, lCountry;
    JTextField tName, tAge;
    JButton okButton;
    JComboBox bCountries;
    String countries[] = {"Brazil", "Mexico", "Chile", "Portugal"};
    public JComboBoxExample() {
        super("ComboBox Example");
        Container cont = getContentPane();
        
        lName = new JLabel("Name");
        lAge = new JLabel("Age");
        lCountry = new JLabel("Country");
        tName = new JTextField();
        tAge = new JTextField();
        bCountries = new JComboBox(countries);
        okButton = new JButton("ok");
        
        setLayout(null);
        
        cont.add(bCountries);
        cont.add(lName);
        cont.add(lAge);
        cont.add(lCountry);
        cont.add(tName);
        cont.add(tAge);
        cont.add(okButton);
                
        lName.setBounds(20, 20, 50, 30);
        tName.setBounds(80, 20, 200, 30);
        lAge.setBounds(20, 50, 50, 30);
        tAge.setBounds(80, 50, 200, 30);
        lCountry.setBounds(20, 80, 50, 30);
        bCountries.setBounds(80, 80, 200, 30);
        okButton.setBounds(100, 120, 50, 30);
        
        OkEvent event = new OkEvent();
        okButton.addActionListener(event);
        
        setSize(300, 300);
        setVisible(true);
        
    }
    
    public class OkEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Result");
            JLabel lNameResult = new JLabel();
            JLabel lAgeResult = new JLabel();
            JLabel lCountryResult = new JLabel();
            
            frame.add(lNameResult);
            frame.add(lAgeResult);
            frame.add(lCountryResult);
            frame.setLayout(null);
            
            lNameResult.setBounds(20, 20, 200, 30);
            lAgeResult.setBounds(20, 50, 200, 30);
            lCountryResult.setBounds(20, 80, 200, 30);
            
            String name = tName.getText();
            String age = tAge.getText();
            String country = bCountries.getSelectedItem().toString();
            
           lNameResult.setText(name);
           lAgeResult.setText(age);
           lCountryResult.setText(country);
            
            frame.setSize(200,300);
            frame.setVisible(true);
        }
        
    }
            
            
    public static void main(String[] args) {
        JComboBoxExample combobox = new JComboBoxExample();
        combobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
