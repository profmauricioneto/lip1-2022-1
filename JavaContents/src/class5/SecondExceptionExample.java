/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class SecondExceptionExample {
    public static String toUpper(String word) throws NullPointerException {
        String wordNew = null;
        int tam = 0;
        try {
            wordNew = word.toUpperCase();
            tam = wordNew.length();
        } catch (NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
        return wordNew;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, wordNew;
        System.out.println("Digite uma palavra: ");
        word = input.next();
        
        try {
            wordNew = toUpper(word);
            System.out.println(wordNew);
        } catch (NullPointerException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        } finally {
            input.close();
            System.out.println("Executou no finnaly");
        }
    }
}
