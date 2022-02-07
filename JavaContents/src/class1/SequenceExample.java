/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class SequenceExample {
    public static void main(String[] args) {
        /**Classe Scanner para entrada de dados*/
        Scanner input = new Scanner(System.in);
        /**Variaveis Locais*/
        final double PI = 3.1415;
        double rad, graus;
        /**Entrada de dados*/
        System.out.print("Entre com o valor em Graus: ");
        graus = input.nextDouble();
        /**Processamento*/
        rad = (graus*PI)/180;
        /**Saida*/
        System.out.printf("\nRadianos: %.2f \n", rad);
    }
}
