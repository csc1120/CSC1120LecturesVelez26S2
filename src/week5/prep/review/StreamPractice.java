/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.prep.review;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
//    Create a method that takes in a List of Integers and returns a List of all the Integers
//    the square value of all the Integers that are even
    private static List<Integer> squareEvents(List<Integer> list){
        return list.stream().filter(a -> a % 2 == 0).map(a -> a * a).toList();
    }

//    Create a method that takes in an array of Strings and returns the concatenations of all the Strings
    private static String sumStringArray(String[] words){
        return Arrays.stream(words).collect(Collectors.joining());
    }
//    Create a method that takes in a List of Integers and returns the number of unique elements
    private static long numUnique(List<Integer> list){
        return list.stream().distinct().count();
    }

//    Create a method that takes in a List of Strings and prints out all Strings in uppercase, in alphabetic order
//    You can use String::compareTo as the comparator
    private static void printSortedUpper(List<String> words){
        words.stream().map(a -> a.toUpperCase()).sorted(String::compareTo).forEach(a -> System.out.println(a));
    }

//    Create a method that takes in an array of Strings and returns the sum of characters in the
//    Strings in the first half of the array
    private long sumFirstHalf(String[] words){
        return Arrays.stream(words).limit(words.length/2).collect(Collectors.summingInt(a -> a.length()));
    }

//    Create a method that takes in a List of Strings and returns a String with last three Strings that contain the letter “o”
    private Stream<String> lastThreeO(List<String> words){
        return words.stream().filter(a -> a.contains("o")).skip(words.size() - 3);
    }

//    Create a method that takes in a array of Integers and prints the square root of the
//    largest odd number. Note, that the max operation returns an Optional<Type> object. If
//    there is not a max, throw an IllegalArgumentException
//You can use Integer::compareTo as the comparator
    private void largestOdd(Integer[] nums){
        Optional<Double> ans = Arrays.stream(nums).filter(a -> a % 2 == 1).max(Integer::compareTo).map(a -> Math.sqrt(a));
        if(ans.isPresent()){
            System.out.println(ans.get());
        } else {
            throw new IllegalArgumentException("Error there is not max in passed in array");
        }
    }
}
