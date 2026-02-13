/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.lecture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrderExamples {
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "taco", "cat"};

        Consumer<String> consumer1 =
                a -> System.out.println(a.toUpperCase());
        Arrays.stream(words).forEach(consumer1);

        Function<String, Integer> upperFunction
                = a -> a.length();
        Arrays.stream(words).
                map(upperFunction).
                forEach(System.out::println);


        Predicate<String> justO = a -> a.contains("o");
        Arrays.stream(words).filter(justO).forEach(System.out::println);

        Comparator<String> stringCompare = String::compareTo;
        Arrays.stream(words).max(stringCompare);

    }
}
