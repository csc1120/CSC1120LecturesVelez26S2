/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.prep.highorder;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        Integer[] nums = {3,6,2,3,4,1,7,6,4,3,1,2,2};

        Arrays.stream(nums).
                filter(a -> a <=3 ).
                forEach(System.out::println);

        Predicate<Integer> predicate1 = a -> a > 4;
        Arrays.stream(nums).
                filter(predicate1).
                forEach(System.out::println);

        System.out.println();
        Arrays.stream(nums).
                filter(PredicateExamples::myPredicate).
                forEach(System.out::println);

        String[] words = {"foo", "bar", "taco", "cat"};
        Arrays.stream(words).
                filter(i -> i.contains("o")).
                forEach(System.out::println);

    }
    public static boolean myPredicate(Integer i){
        return i % 2 == 0;
    }
}
