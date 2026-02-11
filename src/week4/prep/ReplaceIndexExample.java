/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.prep;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceIndexExample {
    /**
     * Replaces elements in the passed-in array based on the rule.
     * Does not scale well since each rule requires its own set of for loops
     * @param nums array to modify
     * @param rule String that specifies when elements to turn into -1
     */
    public static void replaceValue(Integer[] nums, String rule){
        if(rule.equals("even")){
            for(int i = 0; i<nums.length; i++){
                if(i % 2 == 0){
                    nums[i] = -1;
                }
            }
        } else if(rule.equals("odd")){
            for(int i = 0; i<nums.length; i++){
                if(i % 3 == 0){
                    nums[i] = -1;
                }
            }
        }
    }
    /**
     * Helper method to replace elements int an array
     * @param value Value that may be replace
     * @param index Index of the value
     * @param rule Rule to determine if the value should be replace
     * @return Value that was passed-in or -1 if the rule was met
     * @throws IllegalArgumentException If the passed-in rule is not valid
     */
    private static Integer replaceIndex(Integer value, int index, String rule)
            throws IllegalArgumentException{
        if(rule.equals("even")){
            return index % 2 == 0 ? -1: value;
        } else if(rule.equals("odd")){
            return index % 3 == 0 ? -1: value;
        } else {
            throw new IllegalArgumentException("Invalid rule" + rule);
        }
    }
    /**
     * Version of replace value that uses a helper method to reduce the
     * number of for loops
     * @param nums Array to modify.
     * @param rule Rule for how the array is modified.
     */
    private static void replaceValue2(Integer[] nums, String rule){
        for(int i = 0; i<nums.length; i++){
            nums[i] = replaceIndex(nums[i], i, rule);
        }
    }
    @FunctionalInterface
    private interface ModifyIndex {
        Integer apply(Integer value, int index);
    }
    private static void replaceValue3(Integer[] nums, ModifyIndex rule){
        for(int i = 0; i<nums.length; i++){
            nums[i] = rule.apply(nums[i], i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] nums = {2, 5, 3, 6, 5, 3, 5, 4, 2, 3, 4, 7, 6};
        System.out.println(Arrays.stream(nums).toList());
        System.out.println("Which values do you want to replace with -1?");
        System.out.println("1.even\n2.odd\n3.Less than 5");
        String choice = scanner.nextLine();
        if(choice.equals("1")){
            //replaceValue2(nums, "even");
            replaceValue3(nums, (value, index) -> index % 2 == 0 ? -1: value);
        } else if(choice.equals("2")){
            replaceValue3(nums, (value, index) -> index % 3 == 0 ? -1: value);
            //replaceValue2(nums, "odd");
        } else if(choice.equals("3")){
            replaceValue3(nums, (value, index) -> index < 5 ? -1: value);
        }
        System.out.println(Arrays.stream(nums).toList());
    }
}
