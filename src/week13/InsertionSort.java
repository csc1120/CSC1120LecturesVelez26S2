/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/15/2026
 */
package week13;

import java.util.List;

public class InsertionSort implements SortAlgorithm {
    public <T extends Comparable<T>> void sort(List<T> list){
        for(int i = 1; i<list.size(); i++){
            int nextPos = i;
            T nextVal = list.get(nextPos);

            while(nextPos > 0 &&
                    nextVal.compareTo(list.get(nextPos - 1)) < 0) {
                list.set(nextPos, list.get(nextPos - 1));
                nextPos--;
            }
            list.set(nextPos, nextVal);
        }





    }
}
