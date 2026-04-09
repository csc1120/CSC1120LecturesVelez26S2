/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.prep;

import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Map;

public class CharacterCounter3 {
    static void main() {
        String msg = "hello world";
        Map.Entry<Character, Integer>[] counts = new Map.Entry[26];
        for(char c: msg.toCharArray()){
            if(!Character.isSpaceChar(c)){
                int index = c - 'a';
                if(counts[index] == null){
                    counts[index] = new AbstractMap.SimpleEntry<>(c, 1);
                } else {
                    counts[index].setValue(counts[index].getValue() + 1);
                }
            }
        }
        for(int i = 0; i<counts.length; i++){
            System.out.println(counts[i]);
        }
    }
}
