/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    static void main() {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Monday");
        map.put(3, "Wednesday");
        map.put(7, "Sunday");

        System.out.println("All entries");
        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e);
        }

        System.out.println("Map before");
        System.out.println(map);

        map.put(1, "Sunday");
        System.out.println("Map before");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(2));

        map.remove(7);

        System.out.println("Map after removal");
        System.out.println(map);

        //Map usages

        //Phonebook -> Map names to numbers
        TreeMap<String, Integer> phonebook;

        //Dictioary -> words to meanings
        TreeMap<String, String> dictionary;

        //Grade calculator -> grade to letter
        TreeMap<Integer, String> gradeValues;







    }
}
