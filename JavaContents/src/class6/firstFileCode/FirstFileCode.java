/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class6.firstFileCode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author maumneto
 */
public class FirstFileCode {
    public static void readDataWithBF(File file) throws IOException {
        String lines = null;
        try {
            FileReader fr = new FileReader(file.getName());
            BufferedReader br = new BufferedReader(fr);
            while((lines = br.readLine()) != null) {
                System.out.println(lines);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static void readData(File file) {
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void writeDataWithBufferedWriter(File file, String message) {
        try {
            //BufferedWriter bf = new BufferedWriter(new FileWriter(file.getName(), true));
            FileWriter writerObj = new FileWriter(file.getName(), true);
            bf.write(message.concat("\n"));
            bf.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void writeData(File file, String message) {
        try {
            FileWriter writerObj = new FileWriter(file.getName(), true);
            writerObj.write(message.concat("\n"));
            writerObj.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String filename;
        String message;
//        System.out.println("Filename: ");
//        filename = input.next();
       
        try {
            File myFirstFile = new File("log.txt");
            if (myFirstFile.createNewFile()) {
                System.out.println("File create with success");
            } else {
                System.out.println("The file is already created.");
            }
            System.out.println("Write a message: ");
            message = input.nextLine();
            writeData(myFirstFile, message);
            System.out.println("------");
            readData(myFirstFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        

    }
}
