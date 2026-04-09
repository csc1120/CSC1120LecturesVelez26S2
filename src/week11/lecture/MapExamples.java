/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    static void main() {
        //key is an Integer
        //value is a String
        TreeMap<Integer, String> days = new TreeMap<>();
        days.put(1, "Monday");
        days.put(3, "Wednesday");
        days.put(7, "Sunday");

        for(Map.Entry<Integer, String> e: days.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        System.out.println(days.get(3));
        days.put(1, "Sunday");
        System.out.println(days);

        days.remove(7);
        System.out.println("Days after removing value at 7");
        System.out.println(days);
        //Map use cases
        TreeMap<String, String> dictionary;
        TreeMap<String, Integer> phonebook;
        TreeMap<Date, String> calendar;

    }
}
