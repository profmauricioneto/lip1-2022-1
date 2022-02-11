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
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota, media = 0; 
        int cont=0;
        while(cont < 10) {
            System.out.printf("Nota %d: ", cont);
            nota = input.nextDouble();
            media = media + nota;
            cont++;
        }
        input.close();
        media = media/(cont);
        System.out.println(cont);
        System.out.println("Media = " + media);        
    }
}
