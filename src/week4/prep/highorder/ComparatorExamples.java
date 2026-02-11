/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.prep.highorder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class ComparatorExamples {
    public static void main(String[] args) {
        Integer[] nums = {3,5,2,3,7,5,4,8,6,5};

        Optional<Integer> m =
                Arrays.stream(nums).min((x, y) -> x - y);
        if(m.isPresent()){
            System.out.println(m.get());
        }
        Comparator<String> comparator1 = (x,y) -> {
            if(x.contains("o") && !y.contains("o")){
                return 1;
            } else if(y.contains("o") && !x.contains("o")){
                return -1;
            } else {
                return 0;
            }
        };

        String[] words = {"hi", "now", "a", "hello", "cool"};
        Arrays.stream(words).
                sorted(comparator1).
                forEach(System.out::println);

    }
}
