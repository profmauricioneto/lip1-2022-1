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
public class Question1 {
    public static void main(String[] args) {
        double currentWeight, height, imc, idealWeight = 0;
        String gender;
        Scanner in = new Scanner(System.in);
        System.out.print("Weight(kg): ");
        currentWeight = in.nextDouble();
        System.out.print("Height(m): ");
        height = in.nextDouble();
        System.out.print("Gender(m/h): ");
        gender = in.next();
        in.close();
        // calculating imc and ideal weight based on the input data
        imc = currentWeight/(height*height);
        switch(gender) {
            case ("h"):
                idealWeight = 72.7*height - 58;
                break;
            case ("m"):
                idealWeight = 62.1*height - 44.7;
                break;
            default:
                System.out.println("Error.");
                break;
        }
        System.out.println("IMC = " + imc);
        System.out.println("Ideal Weight = " + idealWeight);
    }           
}
