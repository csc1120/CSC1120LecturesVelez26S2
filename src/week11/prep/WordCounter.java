/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.prep;

public class WordCounter {
    public static int hashString(String s){
        return s.charAt(0) - 'a';//s.length();
    }
    static void main() {
        String msg = "how are you doing";
        String[] words = msg.split("\\s+");
        int tableLength = 5;
        String[] keys = new String[tableLength];
        int[] values = new int[tableLength];

        for(String s:words){
            int index = hashString(s) % tableLength;
            System.out.println(index);
            keys[index] = s;
            values[index]++;
        }
        for(int i = 0; i<keys.length; i++){
            System.out.println(keys[i] + ":" + values[i]);
        }
    }
}
