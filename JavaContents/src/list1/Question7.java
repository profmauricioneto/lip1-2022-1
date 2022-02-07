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
public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salarioBruto, salarioLiquido, valorHora, ir, inss, sind;
        int horas;
        // input data (hour and value per hour)
        System.out.print("Digite as horas trabalhadas no mês: ");
        horas = scan.nextInt();
        System.out.print("Digite o valor da hora: ");
        valorHora = scan.nextFloat();
        scan.close();
        // calculo dos valores e deduções
        salarioBruto = horas * valorHora;
        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        ir = salarioBruto*0.11f;
        System.out.println("- IR (11%): R$ " + ir);
        inss = salarioBruto*0.08f;
        System.out.println("- INSS (8%): R$ " + inss);
        sind = salarioBruto*0.05f;
        System.out.println("- Sindicato (5%): R$ " + sind);
        salarioLiquido = salarioBruto - ir - inss - sind;
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);
    }
}
