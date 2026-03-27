package week9.prep;

public class LinearSearch {
    private static int linearSearchI(Integer[] nums, Integer target){
        int index = -1;
        for(int i = 0; i<nums.length && index == -1; i++){
            if(nums[i].compareTo(target) == 0){
                index = i;
            }
        }
        return index;
    }
    private static int linearSearchR(Integer[] nums, Integer target, int index){
        if(index >= nums.length){ //base case
            return -1;
        } else { //reductive case
            if(nums[index].compareTo(target) == 0){
                return index;
            } else {
                return linearSearchR(nums, target, index + 1);
            }
        }
    }
    public static int linearSearchR(Integer[] nums, Integer target){
        return linearSearchR(nums, target, 0);
    }

    static void main() {
        Integer[] nums = {3,5,4,2,4,5,2,7,3,6};
        System.out.println("Linear search with iteration");
        System.out.println(linearSearchI(nums, 7));
        System.out.println(linearSearchI(nums, 7));

        System.out.println("Linear search with recursion");
        System.out.println(linearSearchR(nums, 7));
        System.out.println(linearSearchR(nums, 8));
    }
}
