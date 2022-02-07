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
public class Question6 {
    public static void main(String[] args) {
        float valor;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor qualquer: ");
        valor = scan.nextFloat();
        scan.close();
        if (valor > 0) {
            System.out.println("O quadrado do número é: " + Math.pow(valor, 2));
            System.out.println("A raiz quadrada é: " + Math.sqrt(valor));
        } else {
            System.out.println("Entrada de dados inválida.");
        }
    }
}
