/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class EstruturaDinamica {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int qtdAlunos;
        String nome;
        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = scan.nextInt();
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome: ");
            nome = scan.next();
            nomes.add(nome);
            System.out.println(nomes.size());
        }
        for (String n: nomes) {
            System.out.println(n);
        }
    }
}
