/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/1/2026
 */
package week10.review;

public class RecursiveMethods {
    /**
     * Checks if there are any even elements in the passed-in array
     * @param nums Array of ints
     * @return True is any of the ints in the array are even
     */
    public boolean hasEvens(int[] nums) {

        return false;
    }
    private boolean hasEvens(int[] nums, int index){
        if(index > nums.length - 1){
            return false;
        } else {
            if (nums[index] % 2 == 0) {
                return true;
            } else {
                return hasEvens(nums, index + 1);
            }
        }
    }
    /**
     * Checks if the passed-in String is a palindrome. A palindrome is
     * a word that reads the same forwards and backwards. For example,
     * tacocat backwards is tacocat.
     * @param str String to check
     * @return True if the String is a palindrome.
     */
    private boolean palindrome(String str){
        int len = str.length();
        if(len <= 1){
            return true;
        } else if(str.charAt(0) == str.charAt(len-1)){
            return palindrome(str.substring(1, len - 1));
        } else {
            return false;
        }

    }
}
