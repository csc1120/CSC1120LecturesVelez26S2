/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

import java.util.Date;
import java.util.TreeSet;

public class SetExamples {
    static void main() {
        TreeSet<String> set = new TreeSet<>();

        set.add("foo");
        set.add("bar");
        set.add("taco");
        set.add("cat");
        System.out.println("Set before");
        System.out.println(set);
        set.add("foo");
        System.out.println("Set after trying to add dup");
        System.out.println(set);

        System.out.println("Does the set contain bar "+set.contains("bar"));
        System.out.println("Does the set contain hello "+set.contains("hello"));

        set.remove("cat");
        System.out.println("after removing cat");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for(String s: set){
            System.out.println(s.toUpperCase());
        }
        //use cases
        //Unique words in a document
        TreeSet<String> unique;
        //Dates in planner
        TreeSet<Date> dates;
        //student ids
        TreeSet<Integer> ids;
    }
}
