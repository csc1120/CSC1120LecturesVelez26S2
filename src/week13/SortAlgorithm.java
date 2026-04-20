package week13;

import java.util.List;

public interface SortAlgorithm {
    public <T extends Comparable<T>> void sort(List<T> list);
}
