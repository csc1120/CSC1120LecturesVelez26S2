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

public class ComparatorExample {
    public static void main(String[] args) {
        String[] words =
                {"foo", "a", "hello", "cat", "world", "the", "house"};

        Optional<String> longest = Arrays.stream(words).
                min(String::compareTo);
        if (longest.isPresent()){
            System.out.println(longest.get());
        }
        Arrays.stream(words).
                sorted(String::compareTo).
                forEach(System.out::println);

        Integer[] nums = {3,5,3,4,6,2,5,4,5,3};
        Optional<Integer> m1 = Arrays.stream(nums).min((x,y) ->{
            if(x > y){
                return 1;
            } else if(y > x){
                return -1;
            } else {
                return 0;
            }
        });
        Optional<Integer> m2 = Arrays.stream(nums).min(Integer::compareTo);
        System.out.println(m2.get());
        Arrays.stream(nums).
                sorted(Integer::compareTo).
                forEach(System.out::println);
    }
    public static int orderCompare(String a, String b){
        if(a.charAt(0) < b.charAt(0)){
            return 1;
        } else if(a.charAt(0) > b.charAt(0)){
            return -1;
        } else {
            return 0;
        }
    }
    public static int lengthCompare(String a, String b){
        if(a.length() > b.length()){
            return 1;
        } else if(a.length() < b.length()){
            return -1;
        } else {
            return 0;
        }
    }
}
