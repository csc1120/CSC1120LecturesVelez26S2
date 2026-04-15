/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week12.prep;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that performs an in place selection sort
 */
public class SelectionSortInPlace {
    /**
     * Sorts the passed in List.
     * @param orig List to sort
     * @param <T> Type of each element
     */
    public <T extends Comparable<T>> void sort(List<T> orig){
        for(int i = 0; i < orig.size(); i++){
            int fill = i;
            int minIndex = fill;
            T min = orig.get(fill);
            for(int j = fill; j < orig.size(); j++){
                if(orig.get(j).compareTo(min) < 0){
                    min = orig.get(j);
                    minIndex = j;
                }
            }
            T a = orig.get(fill);
            T b = orig.get(minIndex);
            orig.set(fill, b);
            orig.set(minIndex, a);
        }
    }
}
