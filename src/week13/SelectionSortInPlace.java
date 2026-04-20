/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week13;

import java.util.List;

/**
 * Class that performs an in place selection sort
 */
public class SelectionSortInPlace implements SortAlgorithm {
    /**
     * Sorts the passed in List.
     * @param orig List to sort
     * @param <T> Type of each element
     */
    public <T extends Comparable<T>> void sort(List<T> orig){
        for(int fill = 0; fill < orig.size() - 1; fill++){
            int minIndex = fill;
            T min = orig.get(minIndex);
            for(int i = minIndex + 1; i<orig.size(); i++){
                if(orig.get(i).compareTo(min) < 0){
                    min = orig.get(i);
                    minIndex = i;
                }
            }
            T a = orig.get(minIndex);
            T b = orig.get(fill);
            orig.set(fill, a);
            orig.set(minIndex, b);
        }



    }
}
