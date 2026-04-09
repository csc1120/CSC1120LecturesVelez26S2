/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.prep;

import java.util.TreeMap;

public class CharacterCounter1 {
    static void main() {
        String msg = "hello world";
        //ListMap<Character, Integer> counts = new ListMap<>();
        TreeMap<Character, Integer> counts = new TreeMap<>();

        for(char c: msg.toCharArray()){
            if(!Character.isSpaceChar(c)) {
                if (counts.get(c) == null) {
                    counts.put(c, 1);
                } else {
                    counts.put(c, counts.get(c) + 1);
                }
            }
        }
        System.out.println(counts);
    }
}
