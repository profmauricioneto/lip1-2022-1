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
public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, aux, nota50, nota10, nota5, nota1;
        System.out.print("Digite com o valor da quantia: ");
        valor = scan.nextInt();
        scan.close();
        aux = valor;
        nota50 = aux / 50;
        aux = aux % 50;
        nota10 = aux / 10;
        aux = aux % 10 ;
        nota5 = aux / 5;
        aux = aux % 5;
        nota1 = aux / 1;
        System.out.println("Valor da quantia solicitada: " + valor);
        System.out.println("Nota de 50: " + nota50);
        System.out.println("Nota de 10: " + nota10);
        System.out.println("Nota de 5: " + nota5);
        System.out.println("Nota de 1: " + nota1);
    }
}
