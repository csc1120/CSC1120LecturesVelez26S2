/*
 * Course: CSC-1120
 * Space Complexity Exercise
 */
package week13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1.  Start running this program, but do not press enter
 * 2.  Launch jconsole from the command prompt (not the terminal inside IntelliJ).
 * 3.  In jconsole, select the SpaceComplexityDriver process from the list and  click "connect"
 * 4.  Click "insecure connection"
 * 5.  Once it is running, you will see several windows with measurements
 * 6.  Note the Heap Memory Usage.
 * 7.  Press enter and let each sort algorithm run.
 * 8.  Note the Heap Memory Usage after each algorithm has run
 * 9.  Also note the CPU usage
 * 10. Be aware that the heap usage will rise as the program idles, so wait
 *     for the sort to finish, give the console a moment to catch up, then
 *     run the next sort
 */
public class SpaceComplexityDriver {
    public static void main(String[] args) {
        final int numElements = 10_000; // change this value to increase n
        final List<Integer> source = new ArrayList<>();
        fill(source, numElements);
        final List<Integer> arr = new ArrayList<>(source);

        boolean run = true;
        try(Scanner in = new Scanner(System.in)) {
            while(run) {
                System.out.println("Press enter to begin testing");
                in.nextLine();

                //Start of selection
                System.out.println("Running Selection Sort on n=" + numElements);
                SelectionSort ss = new SelectionSort();
                List<Integer> ssArray = new ArrayList<>(arr);
                ss.sort(ssArray);
                System.out.println("Press enter to continue");
                in.nextLine();

                //Start of insertion
                System.out.println("Running Insertion Sort on n=" + numElements);
                InsertionSort is = new InsertionSort();
                List<Integer> isArray = new ArrayList<>(arr);
                is.sort(isArray);
                System.out.println("Press enter to continue");
                in.nextLine();

                //Start of shell
                System.out.println("Running Shell Sort on n=" + numElements);
                ShellSort shs = new ShellSort();
                List<Integer> shsArray = new ArrayList<>(arr);
                shs.sort(shsArray);
                System.out.println("Press enter to continue");
                in.nextLine();

                //Start of merge
                System.out.println("Running Merge Sort on n=" + numElements);
                MergeSort ms = new MergeSort();
                List<Integer> msArray = new ArrayList<>(arr);
                ms.sort(msArray);
                System.out.println("Press enter to continue");
                in.nextLine();

                System.out.println("All sorts run");
                System.out.println("Run again?(y/n)");
                String again = in.nextLine();
                run = again.equalsIgnoreCase("y");
            }
        }
    }

    private static void fill(List<Integer> arr, int size) {
        final int max = 50_000;
        for(int i = 0; i < size; ++i) {
            arr.add((int) (Math.random() * max) + 1);
        }
    }
}
