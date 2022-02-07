/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media;
        // entrada de dados
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        // calculo da média
        media = (nota1 + nota2)/2;
        System.out.println("Sua média foi: " + media);
        // logica da situação
        if (media >= 7.0) {
            System.out.println("Aprovado! Pode ir!!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo!");
            } else {
                System.out.println("Final! Vamos para a prova final!");
                float notaFinal, mediaFinal;
                System.out.print("Digite a nota da final: ");
                notaFinal = scan.nextFloat();
                mediaFinal = (notaFinal + media)/2;
                System.out.println("Sua média final é " + mediaFinal);
                if (mediaFinal >= 5.0) {
                    System.out.println("Aprovado! Passou raspando!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
        scan.close();
    }
}
