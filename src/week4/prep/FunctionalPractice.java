/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week4.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        nums.stream().forEach(a -> {
            System.out.println(a);
        });
        nums.stream().forEach(a -> System.out.println(a));

        nums.stream().map(a -> a * 2).forEach(System.out::println);

        String[] words = {"foo", "bar", "taco", "cat"};

        Stream<String> arrayStream = Arrays.stream(words);

        String msg = "The red fox jumped over the lazy dog.";
        String[] elements = msg.split("\\s+");

        Arrays.stream(msg.split(" ")).map(a -> a.toUpperCase()).forEach(System.out::println);

        String filename = "data/week1/example1.txt";
        Path filePath = Paths.get(filename);
        try(InputStream in = Files.newInputStream(filePath);
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader b = new BufferedReader(ir)){

            Stream<String> fileStream = b.lines();
            fileStream.forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Error reading file");
            System.out.println(e.getMessage());
        }
        long numValues = nums.stream().count();

        Object[] list2 = nums.stream().toArray();
        for(Object o: list2){
            System.out.println((int)o);
        }

        System.out.println(nums.stream().collect(Collectors.toList()));

        String concat = Arrays.stream(words).collect(Collectors.joining(""));
        System.out.println(concat);

        int c1 = nums.stream().collect(Collectors.summingInt(a -> a));
        int c2 = Arrays.stream(words).collect(Collectors.summingInt(a -> a.length()));



        OptionalInt m = nums.stream().mapToInt(a -> a).max();
        if(m.isPresent()){
            System.out.println(m.getAsInt());
        }

        //List<Integer> sorted = nums.stream().mapToInt(a -> a).sorted().collect(Collectors.toList());
        nums.stream().filter(a -> a%2 == 0).forEach(System.out::println);

        Comparator<Integer> c;
        Optional<Integer> m2 = nums.stream().max(FunctionalPractice::compareInts);
        if(m2.isPresent()){
            System.out.println(m2.get());
        }
        List<Integer> sorted = nums.stream().mapToInt(a -> a).sorted().boxed().collect(Collectors.toList());
        System.out.println(sorted);

        Integer sum = nums.stream().reduce(0, (a,b) -> a<b?a:b);
        Integer sum2 = nums.stream().reduce(0, (a,b) -> a + b);
        System.out.println(sum2);

        System.out.println(Arrays.stream(words).sorted().collect(Collectors.toList()));

        Arrays.asList(words).stream().mapToInt(a -> a.length()).sum();
    }
    public static int compareInts(int x, int y){
        if(x > y){
            return 1;
        } else if (y > x){
            return -1;
        } else {
            return 0;
        }
    }

}
