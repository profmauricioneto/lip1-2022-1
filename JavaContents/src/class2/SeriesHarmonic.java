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
public class SeriesHarmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double serieHarm = 0;
        System.out.print("Quantidade de termos: ");
        n = input.nextInt();
        input.close();
        if (n < 0) {
            System.out.println("Entrada Inválida!");
        } else {
            for (int i = 1; i <= n; i++) {
                serieHarm = serieHarm + (1.0/i);
                System.out.println(serieHarm);
            }
            System.out.println("Valor da serie harmônica: " + serieHarm);
        }
    }
}
