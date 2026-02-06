/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/4/2026
 */

package week3.lecture;

import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("taco");
        list.add("cat");

        Stream<String> stringStream = list.stream();
        stringStream.forEach(ForEachExample::printEach);

    }
    public static void printEach(String s){
        System.out.println(s.toUpperCase());
    }
}
