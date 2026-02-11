/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.prep.highorder;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExamples {
    public static void main(String[] args) {

        String[] words = {"foo", "bar", "taco", "cat"};
        Integer[] nums = {1,2,3,4,5};

        Arrays.stream(words).forEach(a -> System.out.println(a));

        Consumer<String> consumer1 = a -> System.out.println(a.charAt(0));
        Consumer<String> consumer2 = ConsumerExamples::consumerMethod;

        Arrays.stream(words).forEach(consumer1);
        Arrays.stream(words).forEach(consumer2);

        Stream<Integer> integerStream = Arrays.stream(nums);
        Consumer<Integer> consumer3 = a -> System.out.println(2 * a);
        Arrays.stream(nums).forEach(consumer3);
    }

    public static void consumerMethod(String a){
        System.out.println(a.toUpperCase());
    }

}
