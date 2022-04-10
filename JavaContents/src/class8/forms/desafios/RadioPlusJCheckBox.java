/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.forms.desafios;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class RadioPlusJCheckBox extends JFrame {
    
    JLabel version;
    JRadioButton basic;
    JRadioButton middle;
    JRadioButton full;
    
    JLabel question;
    JTextField total;
    JCheckBox arCond;
    JCheckBox dirHid;
    JCheckBox pinMet;
    JCheckBox sisMid;
    JCheckBox camAut;
    JCheckBox camRe;

    long total_value = 0;
    long arCond_value = 1200;
    long dirHid_value = 2000;
    long pinMet_value = 800;
    long sisMid_value = 600;
    long camAut_value = 3000;
    long camRe_value = 500;

    public RadioPlusJCheckBox() {
        Container cont = getContentPane();
        ButtonGroup groupVersion = new ButtonGroup();
        setLayout(null);
        
        version = new JLabel("Escolha sua versão");
        basic = new JRadioButton("Básica", true);
        middle = new JRadioButton("Intermédiaria");
        full = new JRadioButton("Completa");
        question = new JLabel("Escolha as opções");
        total = new JTextField();
        arCond = new JCheckBox("Ar condiocionado");
        dirHid = new JCheckBox("Direção Hidraulica");
        pinMet = new JCheckBox("Pintura Metálica");
        sisMid = new JCheckBox("Sistemas de Mídias");
        camAut = new JCheckBox("Câmbio Automático");
        camRe = new JCheckBox("Camera de Ré");
        
        groupVersion.add(basic);
        groupVersion.add(middle);
        groupVersion.add(full);
        
        cont.add(version);
        cont.add(basic);
        cont.add(middle);
        cont.add(full);
        cont.add(question);
        cont.add(total);
        cont.add(arCond);
        cont.add(dirHid);
        cont.add(pinMet);
        cont.add(sisMid);
        cont.add(camAut);
        cont.add(camRe);

        version.setBounds(20, 20, 180, 30);
        basic.setBounds(20, 60, 150, 30);
        middle.setBounds(20, 90, 150, 30);
        full.setBounds(20, 120, 150, 30);
        
        question.setBounds(20, 180, 180, 30);
        arCond.setBounds(20, 210, 150, 30);
        dirHid.setBounds(20, 240, 150, 30);
        pinMet.setBounds(20, 270, 150, 30);
        sisMid.setBounds(20, 290, 180, 30);
        camAut.setBounds(20, 310, 180, 30);
        camRe.setBounds(20, 340, 180, 30);
        total.setBounds(20, 370, 160, 30);
        
        arCond.setSelected(false);
        dirHid.setSelected(false);
        pinMet.setSelected(false);
        sisMid.setSelected(false);
        camAut.setSelected(false);
        camRe.setSelected(false);

        total.setHorizontalAlignment(JTextField.CENTER);

        arCond.addActionListener(new ArCodicionadoAction());
        dirHid.addActionListener(new DirecaoHidraulicaAction());
        pinMet.addActionListener(new PinturaMetalicaAction());
        sisMid.addActionListener(new SistemaDeMidiaAction());
        camAut.addActionListener(new CambioAutomaticoAction());
        camRe.addActionListener(new CameraDeReAction());
        basic.addActionListener(new BasicButton());

        total.setText(String.valueOf(total_value));

        setSize(250, 450);
        setVisible(true);
    }

    public class BasicButton implements ItemListener, ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            arCond.setSelected(true);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                ArCodicionadoAction arCodicionadoAction = new ArCodicionadoAction();
            }
        }
    }
    
    public class ArCodicionadoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (arCond.isSelected()) {
                total_value += arCond_value;
            } else {
                total_value -= arCond_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public class DirecaoHidraulicaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (dirHid.isSelected()) {
                total_value += dirHid_value;
            } else {
                total_value -= dirHid_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public class PinturaMetalicaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (pinMet.isSelected()) {
                total_value += pinMet_value;
            } else {
                total_value -= pinMet_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public class SistemaDeMidiaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (sisMid.isSelected()) {
                total_value += sisMid_value;
            } else {
                total_value -= sisMid_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public class CambioAutomaticoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (camAut.isSelected()) {
                total_value += camAut_value;
            } else {
                total_value -= camAut_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public class CameraDeReAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            total_value = Long.parseLong(total.getText());
            if (camRe.isSelected()) {
                total_value += camRe_value;
            } else {
                total_value -= camRe_value;
            }
            total.setText(String.valueOf(total_value));
        }
    }

    public static void main(String[] args) {
        RadioPlusJCheckBox radioPlusCheck = new RadioPlusJCheckBox();
        radioPlusCheck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
