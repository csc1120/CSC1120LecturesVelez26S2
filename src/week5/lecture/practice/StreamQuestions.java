/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestions {
    private static String largestStringFirstHalf(List<String> list){
        return list.stream().
                limit(list.size()/2).
                max(String::compareTo).get();
    }
    private static List<Double> squareBetweenRegion(List<Double> list, int  min, int max) {
        return list.stream().
                filter(a -> a * a > min && a * a < max).
                map(a -> a * a).
                collect(Collectors.toList());

        //list.stream().map(a -> a*a).filter(a -> a > min && a < max).toList();
    }
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat", "hello"));
        List<Double> nums = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        System.out.println(largestStringFirstHalf(words));

        System.out.println(squareBetweenRegion(nums, 5, 20));
    }
}
