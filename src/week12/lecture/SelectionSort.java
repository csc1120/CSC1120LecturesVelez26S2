/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week12.lecture;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public <T extends Comparable<T>> void sort(List<T> list){
        List<T> sorted = new ArrayList<>();
        while(!list.isEmpty()) {
            int minIndex = 0;
            T min = list.get(minIndex);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).compareTo(min) < 0) {
                    min = list.get(i);
                    minIndex = i;
                }
            }
            sorted.add(list.remove(minIndex));
        }
        list.addAll(sorted);
    }
}
