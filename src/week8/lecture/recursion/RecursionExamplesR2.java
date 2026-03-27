package week8.lecture.recursion;

public class RecursionExamplesR2 {
    /**
     * returns the factorial of n (i.e. n1)
     * @param n value to compute
     * @return factorial of n
     */
    public static int factorial(int n){
        //base case
        if(n == 0){
            return 1;
        } else { //reductive
            return n * factorial(n -1);

        }
    }

    /**
     * Returns true if the characters in the str are
     * in alphabetical order. For example, "ace" would
     * return true and "bar" would return false. A String
     * of length 1 or the empty String would return true
     * @param str String to check
     * @return true if characters in the String are in order or
     * the length of the String is less than 1
     */
    public static boolean inOrder(String str){
        if(str.length() <= 1){ //base
            return true;
        } else { //reductive case
            boolean test = str.charAt(0) < str.charAt(1);
            return test && inOrder(str.substring(1));
        }
    }


    /**
     * counts and returns the number of adjacent 11s
     * that are not overlapping. so {2,11,11,3} should
     * return 1 and {2,3,11,11,11,3,11,11,9} should return
     * 2
     * @param nums array of ints
     * @param index current element to examine
     * @return number of adjacent, non overlapings 11s
     */
    private static int adjacent11(int[] nums, int index){
        if(nums.length <= 1){ // base
             return 0;
        } else if (index >= nums.length){
            return 0;
        } else { // reductive
            if(nums[index] == 11 && nums[index + 1] == 1){
                return 1 + adjacent11(nums, index + 2);
            } else {
                return adjacent11(nums, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("factorial");
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(5));

        System.out.println("inOrder");
        System.out.println(inOrder("ace"));
        System.out.println(inOrder("bar"));
        System.out.println(inOrder(""));

        System.out.println("Adjacent11s");
        System.out.println(adjacent11(
                new int[]{2,3,11,11,11,3,11,11,9}, 0));
        System.out.println(adjacent11(
                new int[]{2,11,11,3}, 0));
        System.out.println(adjacent11(
                new int[]{5,2,11,11},0 ));
        System.out.println(adjacent11(
                new int[]{},0));

    }
}
