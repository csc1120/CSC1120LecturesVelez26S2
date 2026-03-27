package week9.lecture;

public class BenchmarkingSearch {

    public static Integer[] generateSortedList(int num) {
        Integer[] ret = new Integer[num];
        for (int i = 0; i < num; i++) {
            ret[i] = i;
        }
        return ret;
    }

    public static String formatNanos(long nanos) {
        return String.format("%,d ns (%.3f µs)", nanos, nanos / 1_000.0);
    }

    public static void main(String[] args) {
        final int s1 = 10_000;
        Integer[] list = generateSortedList(s1);
        long start;
        long elapse;

        // worst case linear
        start = System.nanoTime();
        LinearSearch.linearSearchR(list, -1);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for linear worst case: " + formatNanos(elapse));

        // worst case binary
        start = System.nanoTime();
        BinarySearch.binarySearch(list, -1);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for binary worst case: " + formatNanos(elapse));

        // average case linear
        start = System.nanoTime();
        LinearSearch.linearSearchR(list, s1 / 2);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for linear average case: " + formatNanos(elapse));

        // average case binary
        start = System.nanoTime();
        BinarySearch.binarySearch(list, s1 / 2);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for binary average case: " + formatNanos(elapse));

        // best case linear
        start = System.nanoTime();
        LinearSearch.linearSearchR(list, 0);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for linear best case: " + formatNanos(elapse));

        // best case binary
        start = System.nanoTime();
        BinarySearch.binarySearch(list, 0);
        elapse = System.nanoTime() - start;
        System.out.println("Elapsed time for binary best case: " + formatNanos(elapse));
    }
}
