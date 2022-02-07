/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Question12 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = 1;
       float diff, somaQuad = 0, quadSoma = 0;
       while (n <= 10) {
           quadSoma = quadSoma + n*n;
           somaQuad = somaQuad + n;
           n++;
       }
       somaQuad = somaQuad * somaQuad;
       System.out.println("Valor do Quadrado da Soma: " + somaQuad);
       System.out.println("Valor do Soma dos Quadrados: " + quadSoma);
       diff = somaQuad - quadSoma;
       System.out.println("Diferente: " + diff);
       scan.close(); 

    }
}
