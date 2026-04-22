package week13;

import java.util.List;

public class ShellSort implements SortAlgorithm {
    public <T extends Comparable<T>> void sort(List<T> table) {
        int gap = table.size()/2;
        do {
            for (int i = gap; i < table.size(); i++) {
                int nextPos = i;
                T nextValue = table.get(nextPos);
                while(nextPos > gap - 1 &&
                        nextValue.compareTo(table.get(nextPos - gap)) < 0) {
                    table.set(nextPos, table.get(nextPos - gap));
                    nextPos = nextPos - gap;
                }
                table.set(nextPos, nextValue);
            }
            gap = gap / 2;
        } while (gap >= 1);
    }
}





/*
public <T extends Comparable<T>> void insert(T[] table, int insert, int gap){
        T temp = table[insert];
        while(insert > gap - 1 && temp.compareTo(table[insert - gap]) < 0) {
            table[insert] =table[insert - gap];
            insert = insert - gap;
        }
        table[insert] = temp;
    }
 */