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
public class Question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int termos, aux;
        int a = 0, b = 1;
        System.out.print("Digite o número de termos para a sequencia de fibonacci: ");
        termos = scan.nextInt();
        scan.close();
        if (termos <= 0) {
            System.out.println("Não é possível apresentar os termos de fibonacci com a entrada fornecida.");
        } else if (termos == 1) {
            System.out.println(a);
        } else if (termos == 2) {
            System.out.println(a);
            System.out.println(b);
        } else{
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i < termos; i++) {
                aux = a + b;
                System.out.println(aux);
                a = b;
                b = aux;
            }
        }
    }
}
