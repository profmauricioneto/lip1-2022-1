/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.HelloWorldFromGUISwing;

/**
 *
 * @author maumneto
 */
import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // minha instancia de frame
        JFrame FRAME = new JFrame("My First GUI");
        // criando a label do hello world
        JLabel LABEL = new JLabel("Hello World From GUI");
        // retirando a referencia do gerenciador de layout
        FRAME.setLayout(null);
        // adicionar o contentpane e adicionar label
        FRAME.getContentPane().add(LABEL);
        // definir os limites da label
        LABEL.setBounds(30, 30, 150, 20);
        // tornar a tela visivel
        FRAME.setVisible(true);
        // definir tamanho do frame
        FRAME.setSize(300, 200);
        // alterando o design na pagina
        FRAME.setDefaultLookAndFeelDecorated(true);
        // forçando a aplicação a fechar junto com a tela
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
