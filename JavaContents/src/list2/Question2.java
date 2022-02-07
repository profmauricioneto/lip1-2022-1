/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list2;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Question2 {
    public static int recursiveFibonacci(int terms) {
        if (terms < 2) {
            return terms;
        } else {
            return recursiveFibonacci(terms - 1) + recursiveFibonacci(terms - 2);
        }
    }
    public static void fibonacci(int terms) {
        int a = 0, b = 1, aux = 0;
        if (terms <= 0) {
            System.out.println("Invalid input");
            return;
        } else {
            for (int i = 1; i <= terms; i++) {
                System.out.println(aux + " ");
                a = b;
                b = aux;
                aux = a + b;
            }
        }
    }
    
    public static void main(String[] args) {
        int amountTerms;
        Scanner in = new Scanner(System.in);
        System.out.print("Amount of data: ");
        amountTerms = in.nextInt();
        in.close();
        fibonacci(amountTerms);
        System.out.println("Using recursive fibonacci");
        /*Answer using recursiveFibonacci function*/
        for (int i = 0; i < amountTerms; i++) {
            System.out.println(recursiveFibonacci(i));
        }
    }
}
