/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Hashtable;
import java.util.StringTokenizer;

public class CountManage {
    
    
    public static void countWord(String input) {
        if (input.trim().isEmpty()) {
            System.out.println("Input is empty !!!");
            return;
        }
        
        Hashtable<String, Integer> wordHashtable = new Hashtable<>();
        StringTokenizer tokenizer = new StringTokenizer(input);
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (wordHashtable.containsKey(token) == false) {
                wordHashtable.put(token, 1);
            }
            else {
                int newValue = wordHashtable.get(token) + 1;
                wordHashtable.replace(token, newValue);
            }
        }
        System.out.println(wordHashtable);        
    }

    public static void countCharacter(String input) {
        Hashtable<Character, Integer> characterHashtable = new Hashtable<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char charAtIndex = charArray[i];
            if (Character.isWhitespace(charAtIndex)) {
                continue;
            }
            else if(characterHashtable.containsKey(charAtIndex) == false) {
                characterHashtable.put(charAtIndex, 1);
            }
            else {
                int newValue = characterHashtable.get(charAtIndex) + 1;
                characterHashtable.replace(charAtIndex, newValue);
            }
        }
        System.out.println(characterHashtable);        
    }   
}
