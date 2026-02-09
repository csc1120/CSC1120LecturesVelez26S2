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

public class MapExamples {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));
        words.stream().map(MapExamples::toLength).forEach(System.out::println);
    }
    public static Integer toLength(String s){
        return s.length();
    }
}
