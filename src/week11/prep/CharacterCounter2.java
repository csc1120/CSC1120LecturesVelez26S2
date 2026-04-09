/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.prep;

public class CharacterCounter2 {
    static void main() {
        String msg = "hello world";
        char[] keys = new char[26];
        int[] values = new int[26];

        for(char c: msg.toCharArray()){
            if(!Character.isSpaceChar(c)){
                int index = c - 'a';
                keys[index] = c;
                values[index] += 1;
            }
        }
        for(int i = 0; i<keys.length; i++){
            System.out.println(keys[i] + ":" + values[i]);
        }
    }
}
