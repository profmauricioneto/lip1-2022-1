/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Fibonacci {
    public static void fibonacci(int amount) {
        if (amount < 0) {
            System.out.println("Its not possible");
            System.exit(0);
        } else {
            int a = 0, b = 1, aux;
            for (int i = 0; i < amount; i++) {
                aux = a + b;
                System.out.println(a);
                a = b;
                b = aux;
            }
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int amount;
        System.out.print("Number: ");
        amount = input.nextInt();
        input.close();
        fibonacci(amount);
    }
}
