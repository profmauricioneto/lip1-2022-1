/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author mauricio.moreira
 */
public class Differential {
    public static void main(String[] args) {
        int somaQuad = 0, quadSoma = 0, cont = 0, diff;

        while(cont <= 10) {
            somaQuad = somaQuad + cont*cont;
            quadSoma += cont;
            System.out.println(cont);
            ++cont;
        }
        quadSoma = quadSoma*quadSoma;
        System.out.println("Quadrado da Soma: " + quadSoma);
        System.out.println("Soma dos Quadrados: " + somaQuad);
        diff = quadSoma - somaQuad;
        System.out.println("Diferença: " + diff);
    }
}
