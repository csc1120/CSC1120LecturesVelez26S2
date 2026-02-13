/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.lecture;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceIndexExample {
    private static void replaceValue(Integer[] nums, String rule){
        if(rule.equalsIgnoreCase("even")){
            for(int i = 0; i<nums.length; i++){
                if(i % 2 == 0){
                    nums[i] = -1;
                }
            }
        } else if (rule.equalsIgnoreCase("odd")) {
            for(int i = 0; i<nums.length; i++){
                if(i % 3 == 0){
                    nums[i] = -1;
                }
            }
        }
    }
    private static Integer replaceIndex(Integer value, int index, String rule){
        if(rule.equalsIgnoreCase("even")){
            return index % 2 ==0 ? -1 : value;
        } else if(rule.equalsIgnoreCase("odd")){
            return index % 2 == 1 ? -1 : value;
        } else {
            throw new IllegalArgumentException();
        }
    }
    private static void replaceValue2(Integer[] nums, String rule) {
        for(int i = 0; i<nums.length; i++){
            nums[i] = replaceIndex(nums[i], i, rule);
        }
    }

    @FunctionalInterface
    private interface ModifyIndex {
        Integer apply(Integer value, int index);
    }
    private static void replaceValue3(Integer[] nums, ModifyIndex operation){
        for(int i = 0; i<nums.length; i++){
            nums[i] = operation.apply(nums[i], i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] nums = {2, 5, 3, 6, 5, 3, 5, 4, 2, 3, 4, 7, 6};
        System.out.println(Arrays.stream(nums).toList());
        System.out.println("Which values do you want to replace with -1?");
        System.out.println("1.even\n2.odd");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("1")){
            replaceValue3(nums, (value, index) -> index % 2 == 0? value: -1);
            //replaceValue2(nums, "even");
        } else if (choice.equalsIgnoreCase("2")) {
            replaceValue3(nums, (value, index) -> index % 2 == 1? value: -1);
            //replaceValue2(nums, "odd");
        } else if(choice.equalsIgnoreCase("3")){
            replaceValue3(nums, (value, index) -> index > 4 ? value: -1);
        }
        System.out.println(Arrays.stream(nums).toList());
    }
}
