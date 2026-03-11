package week8.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {
    static void main() {
        List<String> list;
        list = new ArrayList<>();
        //list = new MyArrayList<>();
        System.out.println(list.getClass().getName());

        list.add("foo");
        list.add("bar");
        list.add("taco");
        list.add("cat");

        for(String s: list){
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        System.out.println();
        System.out.println(it.next());
        while(it.hasNext()){ //O(n)
            System.out.println(it.next());
        }
        System.out.println();
        it = list.iterator();
        System.out.println(it.next()); //->foo
        System.out.println(it.next()); //->bar
        it.remove();
        System.out.println(list);
        System.out.println(it.next()); //->taco?
        it.remove();


    }
}
