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
public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("Digite o valor de A: ");
        a = scan.nextFloat();
        if (a == 0) {
            System.out.println("Não é equação do segundo grau!");
            return;
        } else {
            System.out.println("Digite o valor de B: ");
            b = scan.nextFloat();
            System.out.println("Digite o valor de C: ");
            c = scan.nextFloat();
            delta = Math.pow(b,2) - (4*a*c);
            System.out.println(" ");
            scan.close();
            if (delta < 0) {
                System.out.println("Não há raizes na equação.");
            } else if (delta == 0) {
                x1 = (-b + Math.sqrt(delta)/(2*a));
                System.out.println("Somente uma raiz, x1 = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)/(2*a));
                x2 = (-b - Math.sqrt(delta)/(2*a));
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
