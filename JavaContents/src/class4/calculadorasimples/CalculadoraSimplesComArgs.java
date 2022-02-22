/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.calculadorasimples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class CalculadoraSimplesComArgs {
    /**
     * @return the sum of entries
     * @param parameters List of parameters (entries)
     */
    public static double sum(List<Double> parameters) {
        double result = 0;
        for (Double arg: parameters) {
            result += arg;
        }
        return result;
    }
    /**
     * @return the subtraction of entries
     * @param parameters List of parameters (entries)
     */
    public static double subtraction(List<Double> parameters) {
        double result = 0;
        for (Double arg: parameters) {
            result -= arg;
        }
        return result;
    }
    /**
     * @return the multiplication of entries
     * @param parameters List of parameters (entries)
     */
    public static double multiplication(List<Double> parameters) {
        double result = 1;
        for (Double arg: parameters) {
            result *= arg;
        }
        return result;
    }
    /**
     * @return the division of entries
     * @param parameters List of parameters (entries)
     */
    public static double division(List<Double> parameters) {
        double result = 1;
        for (Double arg: parameters) {
            if(arg == 0) {
                System.err.println("Infinity");
                result = -1;
            } else {
                result = result/arg;
            }
        }
        return result;
    }
    /**
     * This subroutine show the menu option
     * @return void
     */
    public static void help() {
        System.out.println("Welcome to Simple Calculator");
        System.out.println("Please, see the options");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
    }
    
    public static void menu() {
        System.out.println("Welcome to Simple Calculator");
        System.out.print("Choose the option: ");
    }
    
    /**
     * This code prints the result of execution (math operation)
     * @return void
     * @param x number of result operation
     */
    public static void printResult(double x) {
        if (x == -1) {
            System.err.println("A wild error appears");
        } else {
            System.out.println("Result: " + x);
        }
    }
    /**
     * @param args The array of external arguments 
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int option;
        if (args[0].equals("-h") || args[0].equals("help")) {
            help();
            System.exit(0);
        }
        
        List<Double> arguments = new ArrayList<>();
        for (String arg: args) {
            arguments.add(Double.parseDouble(arg));
        }
        
        menu();
        option = input.nextInt();

        switch(option) {
            case 1: {
                printResult(sum(arguments));
                break;
            }
            case 2: {
                printResult(subtraction(arguments));
                break;            
            }
            case 3: {
                printResult(multiplication(arguments));
                break;
            }
            case 4: {
                printResult(division(arguments));
                break;
            }
            default: {
                System.out.println("Invalid option.");
            }
        }
    }      
}
