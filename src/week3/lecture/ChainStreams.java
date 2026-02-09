/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/6/2026
 */

package week3.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChainStreams {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<>(Arrays.asList("foo", "bar", "bar", "taco"));

        words.stream().map((String s) -> {
            return s.toUpperCase();
        }).map((String s) -> {
            return s.charAt(0);
        }).forEach(System.out::println);
    }
}
