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
public class SwitchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, pesoIdeal = 0;
        String sexo;
        // entrada de dados
        System.out.print("Altura: ");
        altura = input.nextDouble();
        System.out.print("Sexo: ");
        sexo = input.next();
        input.close();
        //verificacao
        // switch (sexo) {
        //     case "h":
        //         pesoIdeal = 72.7*altura - 58;
        //         break;
        //     case "m":
        //         pesoIdeal = 62.1*altura - 44.7;
        //         break;
        //     default:
        //         System.out.println("Nenhum sexo válido foi digitado!");
        //         break;
        // }
        if (sexo.equals("h") || sexo.equals("homem")) {
            pesoIdeal = 72.7*altura - 58;
        } else if (sexo.equals("m") || sexo.equals("mulher")) {
            pesoIdeal = 62.1*altura - 44.7;
        } else {
            System.out.println("Nenhum sexo válido foi digitado!");
        }
        System.out.println("Peso Ideal: " + pesoIdeal);        
    }
}
