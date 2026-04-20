/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BenchmarkSort {
    private static Random random = new Random();
    private static List<Integer> makeList(int num, String order){
        System.out.println("List type "+order);
        System.out.println("Num values: "+num);
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i<num; i++){
            if(order.equals("random")) {
                ret.add(random.nextInt(0, num));
            } else if(order.equals("ascending")){
                ret.add(i);
            } else {
                ret.add(num - i);
            }
        }
        return ret;
    }
    public static void timeList(SortAlgorithm sort, List<Integer> list){
        List<Integer> control = new ArrayList<>(list);
        Collections.sort(control);         //sort the control with Java libraries
        long start = System.nanoTime();
        sort.sort(list);
        System.out.println("Is the list sorted: "+list.equals(control));
        long elapsed = System.nanoTime() - start;
        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
        System.out.println();
    }
    static void main() {
        List<Integer> list;
        final int numValues = 25_000;

        System.out.println("Selection sort");
        list = makeList(numValues, "random");
        timeList(new SelectionSortInPlace(), list);


        System.out.println("Insert sort");
        list = makeList(numValues, "random");
        timeList(new InsertionSort(), list);

        System.out.println("Insert sort");
        list = makeList(numValues, "ascending");
        timeList(new InsertionSort(), list);

        System.out.println("Insert sort");
        list = makeList(numValues, "descending");
        timeList(new InsertionSort(), list);


        System.out.println("Shell sort");
        list = makeList(numValues, "random");
        timeList(new ShellSort(), list);

        System.out.println("Shell sort");
        list = makeList(numValues, "ascending");
        timeList(new ShellSort(), list);

        System.out.println("Shell sort");
        list = makeList(numValues, "descending");
        timeList(new ShellSort(), list);

        System.out.println("Merge sort");
        list = makeList(numValues, "random");
        timeList(new MergeSort(), list);



//        //sort the control with Java libraries
//        /*
//        start = System.nanoTime();
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(list);
//        System.out.println("Is the list sorted: "+list.equals(control));
//        elapsed = System.nanoTime() - start;
//        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
//        System.out.println();
//         */
//
//        System.out.println("Selection not sort in place.");
//        list = makeList(0, 1000, 1000);
//        control = new ArrayList<>(list);
//        Collections.sort(control); //sort the control with Java libraries
//
//        start = System.nanoTime();
//        week12.prep.SelectionSortInPlace selectionSortInPlace = new SelectionSortInPlace();
//        selectionSortInPlace.sort(list);
//        System.out.println("Is the list sorted: "+list.equals(control));
//        elapsed = System.nanoTime() - start;
//        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
//        System.out.println();
//
//        /*
//        final int max = 100_000;
//        System.out.println("Insertion sort in order");
//        list.clear();
//        for(int i = 0; i<max; i++){
//            list.add(i);
//        }
//        //list = makeList(0, 1000, 1000);
//        control = new ArrayList<>(list);
//        Collections.sort(control); //sort the control with Java libraries
//
//        start = System.nanoTime();
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(list);
//        System.out.println("Is the list sorted: "+list.equals(control));
//        elapsed = System.nanoTime() - start;
//        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
//        System.out.println();
//
//        System.out.println("Insertion sort not in order");
//        list.clear();
//        for(int i = 0; i<max; i++){
//            list.add(max - i);
//        }
//        //list = makeList(0, 1000, 1000);
//        control = new ArrayList<>(list);
//        Collections.sort(control); //sort the control with Java libraries
//
//        start = System.nanoTime();
//        //InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(list);
//        System.out.println("Is the list sorted: "+list.equals(control));
//        elapsed = System.nanoTime() - start;
//        System.out.printf("Total time: %.3e ns%n", (double) elapsed);
//        System.out.println();
//         */
    }
}
