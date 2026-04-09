/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/1/2026
 */
package exam2;

public class RecursiveMethods {
    /**
     * Checks if there are any even elements in the passed-in array
     * @param nums Array of ints
     * @return True is any of the ints in the array are even
     */
    public boolean hasEvens(int[] nums){
        return hasEvens(nums, 0);
    }
    private boolean hasEvens(int[] nums, int index){
        if(index >= nums.length){
            return false;
        } else {
            return nums[index] % 2 == 0 || hasEvens(nums, index + 1);
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
        return false;
    }
    /**
     * Checks if the array is a palindrome which means the sequence
     * of number is the same going forward or backward.For example,
     * [3,1,0,1,3] is a palindrome and [1,2,3,4,5] is not.
     * @param nums Array of ints
     * @return True is the array is a palindrome.
     */
    public boolean palindromeArray(int[] nums){
        //return palindromeArray(nums, 0);
        return palindromeArray(nums, 0, nums.length - 1);
    }

    private boolean palindromeArray(int[] nums, int index){
        if(index > nums.length/2){
            return true;
        } else {
            return nums[index] == nums[nums.length - index + 1] &&
                    palindromeArray(nums, index + 1);
        }
    }
    private boolean palindromeArray(int[] nums, int first, int last){
        if(first >= last){
            return true;
        } else {
            return nums[first] == nums[last] && palindromeArray(nums, first + 1, last - 1);
        }
    }

}
