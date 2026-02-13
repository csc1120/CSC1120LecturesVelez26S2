/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week4.prep;

import java.util.*;
import java.util.stream.Stream;

public class CollectionExamples {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("foo", "bar", "taco", "cat");
//        Iterator<String> it = words.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next() + " ");
//        }
//
//
        Collection<String> words2 = new HashSet<>();
        words2.add("foo");
        words2.add("bar");
        words2.add("taco");
        words2.add("cat");
        for(String s:words2){
            System.out.print(s + " ");
        }
        System.out.println();

        Collection<Integer> nums = new ArrayDeque<>();
        nums.add(42);
        nums.add(-1);
        nums.contains((Integer)42);

        Collection<Scanner> scanners = new ArrayList<>();
        scanners.add(new Scanner(System.in));






        List<String> words3 = new LinkedList<>(Arrays.asList("foo","bar","taco","cat"));
        words3.set(1, "hello");
        System.out.println(words3.get(1));

        //List<Scanner> scanners = new ArrayList<>();
        //scanners.add(new Scanner(System.in));

        Stream<String> tokens = Arrays.stream("Hello world".split("\\s+"));

        Iterator<Integer> it = Arrays.asList(1,2,3,4,5).iterator();

        List<int[]> arrayList = new ArrayList<>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,0};
        arrayList.add(a1);
        arrayList.add(a2);




    }
}
