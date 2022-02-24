/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class FirstExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double res = 0;
        System.out.print("A: ");
        a = input.nextInt();
        System.out.print("B: ");
        b = input.nextInt();
        
        try {
            res = (double)a/b;
            System.out.println("result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("A wild error appears");
            System.out.println(e.getMessage());
        } finally {
            input.close();
            System.out.println("Executando no Finally");
        }
        System.out.println("Continuou após exceção!");
    }
}
