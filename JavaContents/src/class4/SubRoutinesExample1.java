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

public class SubRoutinesExample1 {
    
    public static void Message(String message, double param) {
        System.out.println(message + param);
    }
    
    public static double IMC(double weight, double height) {
        double imc;
        imc = weight/Math.pow(height, 2);
        return imc;
    }
    
    public static double IdealWeight(double height, String gender) {
        double idealWeight = 0;
        gender = gender.toLowerCase();
        switch(gender) {
            case "h":
                idealWeight = 72.7*height - 58;
                break;
            case "m":
                idealWeight = 62.1*height - 44.7;
                break;
            default:
                System.out.println("Error");
                idealWeight = -1;
        }
        return idealWeight;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height;
        String gender;
        System.out.println("Digite sua altura: ");
        height = input.nextDouble();
        System.out.println("Digite seu peso: ");
        weight = input.nextDouble();
        System.out.println("Digite seu genero: ");
        gender = input.next();
        Message("O seu IMC é: ", IMC(weight, height));
        Message("O peso ideal é: ", IdealWeight(height, gender));
    }
}
