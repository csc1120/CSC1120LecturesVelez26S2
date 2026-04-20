/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week12.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BenchmarkSort {
    private static Random random = new Random();
    private static List<Integer> makeList(int min, int max, int num){
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i<num; i++){
            ret.add(random.nextInt(min, max));
        }
        return ret;
    }
    static void main() {
        List<Integer> list;
        List<Integer> control;
        long start;
        long elapsed;
        System.out.println("Selection sort");
        list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control);
        System.out.println("Before "+control.equals(list));
        SelectionSort selectionSort = new SelectionSort();
        start = System.nanoTime();
        selectionSort.sort(list);
        elapsed = System.nanoTime() - start;
        System.out.println("After " + control.equals(list));
        System.out.printf("Time is %.3e ns ", (double) elapsed);
        System.out.println();

        System.out.println("Insertion sort random");
        list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control);
        System.out.println("Before "+control.equals(list));
        InsertionSort insertionSort = new InsertionSort();
        start = System.nanoTime();
        insertionSort.sort(list);
        elapsed = System.nanoTime() - start;
        System.out.println("After " + control.equals(list));
        System.out.printf("Time is %.3e ns ", (double) elapsed);
        System.out.println();

        System.out.println("Insertion sort ascending");
        int max = 100_000;
        ///list = makeList(0, 1000, 1000);
        list.clear();
        for(int i = 0; i<max; i++){
            list.add(i);
        }
        control = new ArrayList<>(list);
        Collections.sort(control);
        System.out.println("Before "+control.equals(list));
        start = System.nanoTime();
        insertionSort.sort(list);
        elapsed = System.nanoTime() - start;
        System.out.println("After " + control.equals(list));
        System.out.printf("Time is %.3e ns ", (double) elapsed);
        System.out.println();

        System.out.println("Insertion sort descending");
        ///list = makeList(0, 1000, 1000);
        list.clear();
        for(int i = 0; i<max; i++){
            list.add(max - i);
        }
        control = new ArrayList<>(list);
        Collections.sort(control);
        System.out.println("Before "+control.equals(list));
        start = System.nanoTime();
        insertionSort.sort(list);
        elapsed = System.nanoTime() - start;
        System.out.println("After " + control.equals(list));
        System.out.printf("Time is %.3e ns ", (double) elapsed);


    }
}
