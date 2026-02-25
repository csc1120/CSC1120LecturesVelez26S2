/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/23/2026
 */

package week6.exam1review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    private long numEvens(Integer[] list) {
        return Arrays.stream(list).filter(x -> x%2 == 0).count();
    }

    private List<String> uniqueIgnoreCase(List<String> list) {
        return list.stream().map(s ->s.toUpperCase()).
                distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        List<String> words = new ArrayList<>(Arrays.asList("foo", "bar", "Foo","taco","BAR","tAco","cat", "CAT"));

    }
}