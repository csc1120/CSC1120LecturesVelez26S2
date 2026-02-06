/*
 * Course: CS 1021
 * Winter 2021
 * Demo
 * Name: Roby Velez
 * Created: 2/4/2022
 */
package week3.prep.activityAnswers;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        String msg = "The red FOX jumped over the lazy DOG.";
        //split the preceding String on whitespace and put it in words
        String[] words = msg.split("\\s+");

        //turn words into a stream and
        Stream<String> wordsStream = Arrays.stream(words);
        System.out.println("Message is ");
        wordsStream.forEach(a-> System.out.print(a +" "));
        System.out.println();
        System.out.println();

        //count the number of total words
        //count the total number of unique words
        //make all the words lowercase and count the number of unique words
        System.out.println("Num of words "+Arrays.stream(words).count());
        System.out.println("Num of unique words "+Arrays.stream(words).distinct().count());
        System.out.println("Num of unique lowercase words "+Arrays.stream(words).map(a -> a.toLowerCase()).distinct().count());
        System.out.println();

        //filter out all the words with 'o'
        System.out.println("Message with no 'o' words ");
        Arrays.stream(words).map(a->a.toLowerCase()).
                filter(a -> !a.contains("o")).
                forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println();

        //sort all the words that do not have 'o'
        System.out.println("No 'o' words sorted ");
        Arrays.stream(words).map(a->a.toLowerCase()).
                filter(a -> !a.contains("o")).
                sorted((a,b) -> a.compareTo(b)).
                forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println();

        //replace any occurence of 'the', regardless of case, with 'foo'
        System.out.println("Replacing 'the' with 'foo'");
        Arrays.stream(words).
                map(a->a.toLowerCase()).
                map(a -> a.equals("the")?"foo":a).
                forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println();

        //create a method that takes in a string and returns that string minus punctuation
        //use this method with a lambda expression to remove any punctuation
        System.out.println("No punctuation ");
        Arrays.stream(words).map(a -> removePeriod(a)).forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println();

        //sort the words and join them back into a sentence
        String msg2 = Arrays.stream(words).
                sorted((a,b) -> a.compareTo(b)).
                collect(Collectors.joining(" "));
        System.out.println("Sorted and joined words");
        System.out.println(msg2);
        System.out.println();
    }
    private static String removePeriod(String input){
        String output = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!='.'){
                output+=input.charAt(i);
            }
        }
        return output;
    }
}

/*
System.out.println("Message with no 'o' words1 ");
        //anonymous method lambda
        Arrays.stream(words).map(a -> a.toLowerCase()).map(a -> {
            if(a.equals("the")){
                return "foo";
            } else{
                return a;
            }
        }).forEach(a -> System.out.print(a + " "));
        System.out.println();
 */