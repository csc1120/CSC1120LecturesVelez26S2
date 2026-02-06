/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/6/2026
 */

package week3.prep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MiscFunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        Optional<Integer> ans1 = list1.stream().max(Integer::compare);
        System.out.println(ans1.get());

        List<String> list2 = Arrays.asList("foo", "bar", "taco", "cat");
        Optional<String> ans = list2.stream().max(String::compareTo);


    }
}
