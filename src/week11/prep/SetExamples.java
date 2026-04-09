/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

import java.util.Date;
import java.util.TreeSet;

public class SetExamples {
    static void main() {
        //TreeSet<String> set = new TreeSet<>();
        PureSet<String> set = new ListSet<>();
        set.add("foo");
        set.add("bar");
        set.add("taco");
        set.add("cat");
        System.out.println("Set before");
        System.out.println(set);

        set.add("bar");
        System.out.println("Set after adding duplicate");
        System.out.println(set);

        System.out.println("Does set contain 'foo' "+set.contains("foo"));
        System.out.println("Does set contain 'hello' "+set.contains("hello"));

        set.remove("cat");
        System.out.println("Set after removing cat");
        System.out.println(set);

        System.out.println("Size of set "+set.size());
        //print each element in upper case
        for(String s: set){
            System.out.println(s.toUpperCase());
        }

        //Set usages
        //Unique words in a text document
        TreeSet<String> unique;
        //List of files to include
        TreeSet<String> filenames;
        //List of dates
        TreeSet<Date> dates;
    }
}
