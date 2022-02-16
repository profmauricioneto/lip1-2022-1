/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int somaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();
                if (i == j) {
                    somaDiagonal = somaDiagonal + matrix[i][j];
                }
            }
        }
        System.out.println("Somatório da Diagonal Principal: " + somaDiagonal
        );
    }
}
