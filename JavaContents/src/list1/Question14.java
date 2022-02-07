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
public class Question14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fat = 1, val;
        System.out.print("Digite um valor: ");
        val = scan.nextInt();
        scan.close();
        if (val < 0){
            System.out.println("Não existe fatorial de negativos");
        } else if (val == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= val; i++){
                fat = fat*i;
            }
            System.out.println("Valor do fatorial: " + fat);
        }
    }
}
