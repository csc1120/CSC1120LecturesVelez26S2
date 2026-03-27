/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package quizzes;

public class Quiz9 {


    /**
     * Returns the index of the first occurrence of the
     * target in the passed-in array or -1 if the target
     * is not in the array.
     * @param nums Array to search.
     * @param target Target number to look for
     * @param index Index to keep track of where you have searched.
     * @return Location of the target or -1 if the target does not exist.
     */
    public int indexOf(int[] nums, int target, int index){
        if(index >= nums.length){
            return -1;
        } else {
            if(nums[index] == target) {
                return index;
            } else {
                return indexOf(nums, target, nums[index + 1]);
            }
        }
    }

    /**
     * Returns the numbers of blocks in a pyramid with
     * n rows. For example, if the numbers of rows 0, 1, 2, or 3
     * this method would return 0, 1, 3, and 6. Below shows a pyramid
     * with four rows
     * *
     * **
     * ***
     * ****
     * @param rows Number of rows of the pyramid
     * @return Number of blocks in the pyramid
     */
    public int triangle(int rows){
        if(rows == 0){
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }




    public String reverse(String word, String ans){
        if(word.isEmpty()){
            return ans;
        } else {
            ans += word.charAt(word.length() - 1);
            return reverse(word.substring(word.length()-1), ans);
        }
    }

}
