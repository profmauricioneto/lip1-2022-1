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
public class Question15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option, a , b;
        // input data
        System.out.println("Digite o valor 1:");
        a = scan.nextInt();
        System.out.println("Digite o valor 2:");
        b = scan.nextInt();
        // show menu
        System.out.println("Escolha as seguintes opções:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Saída");
        option = scan.nextInt();
        // switching by option choose
        switch(option) {
            case 1:
                System.out.println("Resultado: " + (a+b));
                break;
            case 2:
                System.out.println("Resultado: " + (a-b));
                break;
            case 3:
                System.out.println("Resultado: " + (a*b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Não é possível divisão com zero!");
                } else {
                    System.out.println("Resultado: " + (a/b));
                }
                break;
            case 5:
                System.out.println("Saída realizada com sucesso!");
                break;
            default:
                System.out.println("Nenhuma opção válida foi digitada!");
        }
        scan.close();
    }
}
