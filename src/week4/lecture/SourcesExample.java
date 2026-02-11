/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week4.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SourcesExample {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));

        words.stream().forEach( a ->System.out.println(a));
        words.stream().
                map(a -> a.toUpperCase()).
                forEach(System.out::println);

        double[] nums = {3,6,2,8,5,4};

        Arrays.stream(nums).
                map(a -> Math.pow(a,2)).
                forEach(System.out::println);

        String msg = "Hello how are you?";
        String[] elements = msg.split("\\s+");
        Arrays.stream(elements).
                map(a -> a.charAt(0)).
                forEach(System.out::println);

        String filename = "data/week1/example1.txt";
        Path filePath = Paths.get(filename);
        try(InputStream in = Files.newInputStream(filePath);
        InputStreamReader ir = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(ir);){
            br.lines().
                    map(a -> "*"+a+"*").
                    forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Eror reading file");
        }
        List<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        long c = num2.stream().count();
        System.out.println(c);
        int sum = num2.stream().collect(Collectors.summingInt(a -> a));
        System.out.println(sum);

        List<Integer> list2 =
                num2.stream().
                        map(a -> a + 1).
                        collect(Collectors.toList());
        list2.add(42);
        System.out.println(list2);

        List<Integer> list3 = num2.
                stream().
                map(a -> a/2).toList();
        //list3.add(42);
        System.out.println(list3);

        List<String> words2 =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));

        String m = words2.stream().collect(Collectors.joining("|"));
        System.out.println(m);

        int len = words2.stream().
                collect(Collectors.summingInt(a -> a.length()));
        System.out.println(len);





    }
}
