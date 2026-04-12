/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/9/2026
 */
package week11.lecture;

import java.util.TreeMap;

public class CharacterCounter1 {
    static void main() {
        //Count up the number of characters in a String
        String msg = "hello world how are you";

        //Runtime: O(1)

        //Runtime: O(logn) b/c BST operations are O(logn)
        TreeMap<Character, Integer> counts = new TreeMap<>();

        //Runtime: O(n) for the ListMap b/c using operation of a List
        //ListMap<Character, Integer> counts = new ListMap<>();

        for(Character c: msg.toCharArray()){
            if(counts.get(c) == null){
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }
        System.out.println(counts);
    }
}
