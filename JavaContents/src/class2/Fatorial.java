/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value, fat = 1;
        System.out.print("Value: ");
        value = input.nextInt();
        input.close();
        if (value < 0) {
            System.out.println("There´s no fatorial of negative numbers.");
        } else {
            for (int i = 1; i <= value; i++) {
                fat = fat * i;
            }
            System.out.println("Fatorial: " + fat);
        }    
    }
}
