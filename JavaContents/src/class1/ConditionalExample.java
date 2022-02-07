/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class ConditionalExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pNota, sNota, fNota, media, fmedia;
        boolean res;
        System.out.print("Primeira Nota: ");
        pNota = input.nextDouble();
        System.out.print("Segunda Nota: ");
        sNota = input.nextDouble();
        media = (pNota + sNota)/2;
        System.out.println("Media = " + media);
        if (media >= 7.0) {
            System.out.println("Passou na Disciplina! Vaza!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo!");
            } else {
                System.out.print("Nota da Final: ");
                fNota = input.nextDouble();
                fmedia = (media + fNota)/2;
                input.close();
                System.out.println("Media Final = " + fmedia);
                res = (fmedia >= 5.0) ? true: false;
                if (res) {
                    System.out.println("Passou raspando hein!");
                } else {
                    System.out.println("É, não deu!");
                }
            }
        }
    }
}
