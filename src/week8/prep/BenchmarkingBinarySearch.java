package week8.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class BenchmarkingBinarySearch {
    static void main() {
        Random random = new Random();
        final int numElements = 1000;
        final int minValue = 0;
        final int maxValue = 10;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numElements; i++){
            list.add(random.nextInt(minValue, maxValue));
        }

        //benchmarking
        //Query that is not in the list
        final int query = -1;
        long start;
        long total;
        boolean found = false;
        start = System.nanoTime();
        list.contains(query);
        total = System.nanoTime() - start;

        for(int i = 0; i<list.size() && !found;i++){
            if(list.get(i) == query){

            }
        }


    }
}
