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
public class Question5 {
    public static void main(String[] args) {
        final double PI = 3.1415f;
        double area, raio;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho do raio do círculo: ");
        raio = scan.nextFloat();
        scan.close();
        area = PI * Math.pow(raio, 2);
        System.out.println("O valor da área do círculo é: " + area);
    }
}
