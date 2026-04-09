/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/1/2026
 */
package week11.exam2review;

public class RecursiveMethods {
    /**
     * Checks if the array is a palindrome which means the sequence
     * of number is the same going forward or backward.For example,
     * [3,1,0,1,3] is a palindrome and [1,2,3,4,5] is not.
     * @param nums Array of ints
     * @return True is the array is a palindrome.
     */
    public boolean palindromeArray(int[] nums){
        return false;
    }

    private boolean palindromeArray(int[] nums, int s, int e){
        if(s > e){
            return true;
        } else {
            if(nums[s] == nums[e]){
                return palindromeArray(nums, s + 1, e - 1 );
            } else {
                return false;
            }
        }
    }
}
