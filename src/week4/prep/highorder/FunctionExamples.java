/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.prep.highorder;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "taco", "cat"};

        Arrays.stream(words).
                map(a -> a.toUpperCase()).
                forEach(System.out::println);

        Function<String, String> function1 =
                a -> String.valueOf(a.charAt(0));

        Arrays.stream(words).
                map(function1).
                forEach(System.out::println);

        Function<String, Integer> function2 =
                a -> a.length();

        Arrays.stream(words).
                map(function2).
                forEach(System.out::println);

        Integer[] nums = {1,2,3,4,5};
        Arrays.stream(nums).
                map(FunctionExamples::myFunction).
                forEach(System.out::println);
    }
    public static String myFunction(Integer i){
        return "*" + i + "*";
    }
}
