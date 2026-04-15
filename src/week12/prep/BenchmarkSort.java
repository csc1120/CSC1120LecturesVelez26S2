/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week12.prep;

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
    private static boolean isSorted(List<Integer> list, int index){
        if(index >= list.size() - 1){
            return true;
        } else {
            return list.get(index) <= list.get(index + 1) && isSorted(list, index + 1);
        }
    }
    static void main() {
        long start;
        long elapsed;
        List<Integer> list;
        List<Integer> control;

        System.out.println("Selection not sort in place.");
        list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control);         //sort the control with Java libraries

        start = System.nanoTime();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(list);
        System.out.println("Is the list sorted: "+list.equals(control));
        elapsed = System.nanoTime() - start;
        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
        System.out.println();

        System.out.println("Selection not sort in place.");
        list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control); //sort the control with Java libraries

        start = System.nanoTime();
        SelectionSortInPlace selectionSortInPlace = new SelectionSortInPlace();
        selectionSortInPlace.sort(list);
        System.out.println("Is the list sorted: "+list.equals(control));
        elapsed = System.nanoTime() - start;
        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
        System.out.println();

        final int max = 100_000;
        System.out.println("Insertion sort in order");
        list.clear();
        for(int i = 0; i<max; i++){
            list.add(i);
        }
        //list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control); //sort the control with Java libraries

        start = System.nanoTime();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(list);
        System.out.println("Is the list sorted: "+list.equals(control));
        elapsed = System.nanoTime() - start;
        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
        System.out.println();

        System.out.println("Insertion sort not in order");
        list.clear();
        for(int i = 0; i<max; i++){
            list.add(max - i);
        }
        //list = makeList(0, 1000, 1000);
        control = new ArrayList<>(list);
        Collections.sort(control); //sort the control with Java libraries

        start = System.nanoTime();
        //InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(list);
        System.out.println("Is the list sorted: "+list.equals(control));
        elapsed = System.nanoTime() - start;
        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
        System.out.println();

    }
}
