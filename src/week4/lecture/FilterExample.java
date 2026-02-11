/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week4.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> nums =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        nums.stream().
                limit(4).
                skip(2).
                forEach(System.out::println);

        System.out.println(nums.stream().filter(a -> a % 2 == 1).toList());

        List<String> words =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));

        String result = words.stream().
                filter(a -> a.contains("o")).
                map(a -> a.toUpperCase()).
                collect(Collectors.joining(":"));
        System.out.println(result);



    }
}
