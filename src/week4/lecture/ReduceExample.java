/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.lecture;

import java.util.Arrays;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        String[] words = {"foo", "bar", "taco", "cat"};
        Optional<String> result = Arrays.stream(words).
                reduce((a, b) -> a + "|" + b);
        if(result.isPresent()){
            System.out.println(result.get());
        }

    }
}
