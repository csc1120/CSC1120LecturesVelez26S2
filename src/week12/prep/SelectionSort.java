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
 * Class that implements a Selection Sort
 * with two List
 */
public class SelectionSort {
    /**
     * Sorts the passed-in List
     * @param orig List to store
     * @param <T> Type of each element
     */
    public <T extends Comparable<T>> void sort(List<T> orig){
        List<T> sorted = new ArrayList<>();
        while(!orig.isEmpty()){
            int minIndex = 0;
            T min = orig.get(minIndex);
            for(int i = 0; i<orig.size(); i++){
                if(orig.get(i).compareTo(min) < 0){
                    min = orig.get(i);
                    minIndex = i;
                }
            }
            sorted.add(orig.remove(minIndex));
        }
        orig.addAll(sorted);
    }
}
