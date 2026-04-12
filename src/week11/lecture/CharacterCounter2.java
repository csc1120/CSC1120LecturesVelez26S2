/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/9/2026
 */
package week11.lecture;

import java.util.AbstractMap;
import java.util.Map;

public class CharacterCounter2 {
    static void main() {
        String msg = "hello how are you";

        Map.Entry<Character, Integer>[] table =
                new Map.Entry[26];
        for(Character c: msg.toCharArray()){
            if(!Character.isSpaceChar(c)) {
                int index = c - 'a';
                //Runtime: O(1) b/c once we have
                //an index we just go to that location
                if (table[index] == null) {
                    Map.Entry<Character, Integer> e =
                            new AbstractMap.SimpleEntry<>(c, 1);
                    table[index] = e;
                } else {
                    table[index].setValue(table[index].getValue() + 1);
                }
            }
        }
        for(int i = 0; i < table.length; i++){
            System.out.println(table[i]);
        }

    }
}
