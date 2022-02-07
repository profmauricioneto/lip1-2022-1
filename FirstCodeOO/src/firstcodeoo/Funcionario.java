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
public class Funcionario {
    public String nome;
    public String nascimento;
    private double salario;
    
    Funcionario(double salario) {
        this.salario = salario;
    } 
    
    public void informarSalario() {
        System.out.println(salario);
    }
}
