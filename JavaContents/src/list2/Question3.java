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
public class Question3 {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) throws ArithmeticException {
            return a / b;   
    }
    public static void main(String[] args) {
        int option;
        double firstInput, secondInput, result = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose the Option");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("Option: ");
        option = in.nextInt();
        System.out.print("a: ");
        firstInput = in.nextDouble();
        System.out.print("b: ");
        secondInput = in.nextDouble();
        switch (option) {
            case 1:
                result = sum(firstInput, secondInput);
                break;
            case 2:
                result = subtraction(firstInput, secondInput);
                break;
            case 3:
                result = multiplication(firstInput, secondInput);
                break;
            case 4:
                try {
                    result = division(firstInput, secondInput);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("No one option choose.");
                break;
        }
        System.out.println("Result = " + result);
    }
}
