package week13;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortAlgorithm {
    public <T extends Comparable<T>> void merge(List<T> table, List<T> left, List<T> right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                table.set(k++, left.get(i++));
            } else {
                table.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            table.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            table.set(k++, right.get(j++));
        }
    }
    public <T extends Comparable<T>> void sort(List<T> table) {
        if (table.size() > 1) {
            int mid = table.size() / 2;
            List<T> leftSubList = new ArrayList<>(table.subList(0, mid));
            List<T> rightSubList = new ArrayList<>(table.subList(mid, table.size()));
            sort(leftSubList);
            sort(rightSubList);
            merge(table, leftSubList, rightSubList);
        }
    }
}