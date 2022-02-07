/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcodeoo;

/**
 *
 * @author mauricio.moreira
 */
public class FirstCodeOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario helena = new Funcionario(4000);
        Funcionario joao = new Funcionario(2000);
        helena.informarSalario();
        joao.informarSalario();
    }
    
}
