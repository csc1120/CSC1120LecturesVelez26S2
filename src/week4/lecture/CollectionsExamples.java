/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.lecture;
import java.util.*;
import java.util.Collection.*;

public class CollectionsExamples {
    public static void main(String[] args) {

        Iterable<String> iterable =
                new ArrayList<>(Arrays.asList("foo","bar","taco","cat"));

        Iterator<String> it = iterable.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }

        Collection<String> collection =
                new ArrayList<>(Arrays.asList("foo","bar","taco","cat"));
        collection.add("hello");
        collection.contains("bar");

        Collection<Integer> c2 = new HashSet<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(1);
        System.out.println();
        for(Integer i: c2){
            System.out.print(i + " ");
        }

        List<String> words =
                new ArrayList<>(Arrays.asList("foo","bar","taco","cat"));
        List<String> words2 =
                new LinkedList<>(Arrays.asList("foo","bar","taco","cat"));


    }
}
