/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week4.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bear", "dog", "lion", "tiger");
        words.stream().
                map(a -> a.toUpperCase()).
                forEach(a -> System.out.print(a + ":"));
    }
}
