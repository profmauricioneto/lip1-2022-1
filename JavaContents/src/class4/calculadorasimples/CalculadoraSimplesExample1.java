/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.calculadorasimples;

import java.util.Scanner;

/**
 * This code is an example of subroutines with java (Please see the documentation)
 * @author mauricio.moreira
 */
public class CalculadoraSimplesExample1 {
    /**
     * @return the sum of two entries
     * @param a first double number
     * @param b secod double number
     */
    public static double somar(double a, double b) {
        return a + b;
    }
    /**
     * @return the sum of two entries
     * @param a first double number
     * @param b secod double number
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }
    /**
     * @return the sum of two entries
     * @param a first double number
     * @param b secod double number
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    /**
     * @return the sum of two entries
     * @param a first double number
     * @param b secod double number
     */
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Infinity");
            return -1;
        } else {
            return a / b;
        }
    }
    /**
     * This subroutine show the menu option
     * @return void
     */
    public static void menu() {
        System.out.println("Bem vindo a Calculadora Simples");
        System.out.println("1 - Somar");
        System.out.println("2 - Substrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opcao: ");
    }
    
    /**
     * This code prints the result of execution (math operation)
     * @return void
     * @param x number of result operation
     */
    public static void printResult(double x) {
        if (x == -1) {
            System.out.println("Um erro ocorreu!");
        } else {
            System.out.println("Resultado: " + x);
        }
    }
    /**
     * @param args The array of external arguments 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option, fvalue, svalue;
        menu();
        option = input.nextInt();
         System.out.print("Valor 1: ");
         fvalue = input.nextInt();
         System.out.print("Valor 2: ");
         svalue = input.nextInt();
         input.close();

        switch(option) {
            case 1: {
                System.out.println("Resultado: " + somar(fvalue, svalue));
                break;
            }
            case 2: {
                System.out.println("Resultado: " + subtrair(fvalue, svalue));
                break;            
            }
            case 3: {
                System.out.println("Resultado: " + multiplicar(fvalue, svalue));
                break;
            }
            case 4: {
                double result = dividir(fvalue, svalue);
                printResult(result);               
                break;
            }
            default: {
                System.out.println("Nenhum opção válida");
            }
        }
    }        
}
