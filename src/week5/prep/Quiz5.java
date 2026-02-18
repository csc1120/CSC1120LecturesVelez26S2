/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week5.prep;

import java.util.List;
import java.util.function.Consumer;

public class Quiz5 {
    /**
     * Makes the unique Strings in the list uppercase.
     * You can use .toUpperCase() or a String to make it
     * uppercase.
     * @param list List of Strings that is not null or empty
     * @return Unique Strings in all uppercase.
     */
    private List<String> uniqueWordsMadeUpperCase(List<String> list){
        return  list.stream().
                distinct().
                map(a->a.toUpperCase()).toList();
    }

    /**
     * Sums the evens numbers in the list
     * @param list List of Integers that is not null or empty
     * @return Sum of the even Integers.
     */
    private Integer sumEvenValues(List<Integer> list){
        return  list.stream().
                filter(x -> x % 2 == 0).
                reduce(0, (x,y) -> x + y);
    }
    private void printMsg(String msg, Consumer<String> rule){
        rule.accept(msg);
    }

    public static void main(String[] args) {
        String msg = "Hello World";




    }
}
