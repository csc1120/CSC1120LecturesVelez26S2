/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/9/2026
 */
package week11.prep;

import java.util.AbstractMap;
import java.util.Map;

public class WordCounter2 {
    public static int myHash1(String s){
        return s.length();
    }
    public static int myHash2(String s){
        return s.charAt(0);
    }

    static void main() {
        String[] words = {"hi", "ok", "are", "you", "hello"};
        Map.Entry<String, Integer>[] table = new Map.Entry[5];

        for(String s: words){
            int index = myHash1(s) % table.length;
            if(table[index] == null){
                table[index] = new AbstractMap.SimpleEntry<>(s, 1);
            } else {
                table[index].setValue(table[index].getValue() + 1);
            }
        }
        for(int i = 0; i<table.length; i++){
            System.out.println(table[i]);
        }
    }
}
