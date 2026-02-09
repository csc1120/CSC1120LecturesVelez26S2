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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list1 =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        list1.set(0,1);

        list1.stream().mapToInt(a -> 2 * a).max();

        Stream<Double> powResult =
                list1.stream().map((Integer i) ->{
            return Math.pow(2,i);
        });
        powResult.forEach((Double s) ->{
            System.out.println(s);
        });

        Stream<Integer> additionResult =
                list1.stream().map(MapExample::addOne);
        additionResult.forEach(System.out::println);
    }
    public static Integer addOne(Integer i){
        return i + 1;
    }
//
//    public static Object toLength(String s) {
//    }
}
