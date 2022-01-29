/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0;

// import Scanner Java class
import java.util.Scanner;
/**
 *
 * @author mauricio.moreira
 */
public class FirstCodeJava {
    public static void main(String[] args) {
        float np1, np2, media; // creating our variables
        Scanner in = new Scanner(System.in); // creating the instance of Scanner class
        /* Inputting Data in our code */
        System.out.print("Nota 1: ");
        np1 = in.nextFloat();
        System.out.print("Nota 2: ");
        np2 = in.nextFloat();
        in.close(); // closing the connection os Scanner
        media = (np1 + np2)/2;
        System.out.print("Media = " + media + "\n");
        /* Conditional Structure */
        if (media >= 5.0) {
          System.out.println("Passou!");
        } else {
          System.out.println("Nao Passou!");
        }
    }
}
