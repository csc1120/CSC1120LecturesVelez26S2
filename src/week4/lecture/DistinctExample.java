/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> words2 =
                new ArrayList<>(Arrays.asList("the", "how", "the",
                        "car","fast", "car", "the"));

        words2.stream().distinct().forEach(System.out::println);
        words2.stream().distinct().count();
    }
}
