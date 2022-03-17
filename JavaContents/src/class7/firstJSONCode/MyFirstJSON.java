/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.firstJSONCode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject; 

/**
 *
 * @author maumneto
 */
public class MyFirstJSON {
    public static void main(String[] args) throws JSONException {
        JSONObject students = new JSONObject();
        try {
            students.put("name", "Maurício Neto");
            students.put("key_number", 123456);
            students.put("course", "Sistemas de Informação");
            students.put("is_active", true);
            // criando o array
            JSONArray disciplines = new JSONArray();
            // armazenando dados no array
            disciplines.put("Linguagens de Programação I");
            disciplines.put("Linguagens de Programação II");
            disciplines.put("Redes de Computadores");
            disciplines.put("Algoritmos II");
            // adicionando o array no JSON
            students.put("disciplines", disciplines);
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        String jsonNoIndent = students.toString();
//        System.out.println(jsonNoIndent);
        String jsonWithIdent = students.toString(4);
        System.out.println(jsonWithIdent);
        
        // recuperando dados do JSON
        String name = students.getString("name");
        long keyNumber = students.getLong("key_number");
        String course = students.getString("course");
        boolean isActive = students.getBoolean("is_active");
        JSONArray myDisciplines = students.getJSONArray("disciplines");
        
        System.out.println(name);
        System.out.println(keyNumber);
        System.out.println(course);
        System.out.println(isActive);
        for (int i = 0; i < myDisciplines.length(); i++) {
            System.out.println(myDisciplines.get(i));
        }
    }
}
