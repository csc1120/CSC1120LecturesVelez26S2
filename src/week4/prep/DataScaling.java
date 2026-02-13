/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week4.prep;

import java.util.ArrayList;
import java.util.List;

public class DataScaling {
    public static boolean method1(List<Integer> list){
        if(list.get(0) == 42){
            return true;
        } else {
            return false;
        }
    }
    public static boolean method2(List<Integer> list){
        boolean found = false;
        for(int i = 0; i<list.size() && !found; i++){
            if(list.get(i) == 42) {
                found = true;
            }
        }
        return found;
    }
    public static boolean method3(List<Integer> list){
        boolean found = false;
        for(int i = 0; i<list.size() && !found; i++){
            for(int j = 0; j<list.size() && !found; j++){
                if((list.get(i) + list.get(j)) == 42) {
                    found = true;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        long start;
        long total;
        for(long i = 10; i < 100_000; i *= 10) {
            List<Integer> nums = new ArrayList<>();
            for(int j = 0; j<i; j++){
                nums.add(0);
            }
            start = System.nanoTime();
            method1(nums);
            total = System.nanoTime() - start;
            System.out.println("Num elements: " + i);
            System.out.printf("Time for method1: %.2e ns\n", (double)total);
        }
        System.out.println();
        for(long i = 10; i < 100_000; i *= 10) {
            List<Integer> nums = new ArrayList<>();
            for(int j = 0; j<i; j++){
                nums.add(0);
            }
            start = System.nanoTime();
            method2(nums);
            total = System.nanoTime() - start;
            System.out.println("Num elements: " + i);
            System.out.printf("Time for method2: %.2e ns\n", (double)total);
        }
        System.out.println();
        for(long i = 10; i < 100_000; i *= 10) {
            List<Integer> nums = new ArrayList<>();
            for(int j = 0; j<i; j++){
                nums.add(0);
            }
            start = System.nanoTime();
            method3(nums);
            total = System.nanoTime() - start;
            System.out.println("Num elements: " + i);
            System.out.printf("Time for method3: %.2e ns\n", (double)total);
        }
    }
}
