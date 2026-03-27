package week9.lecture;

public class BinarySearch {

    private static int binarySearch(Integer[] nums, Integer target,
                                    int top, int bot){
        if (top > bot){  //base case not found it :-(
            return  -1;
        } else {//recursive case
            int mid = (bot + top) / 2;
            if(target.compareTo(nums[mid])== 0){
                return mid;
            } else if(target.compareTo(nums[mid]) < 0){
                return binarySearch(nums, target, top, mid - 1);
            } else {
                return binarySearch(nums, target, mid + 1, bot);
            }
        }
    }
    public static int binarySearch(Integer[] nums, Integer target){
        return binarySearch(nums, target, 0, nums.length - 1);
    }


    static void main() {
        Integer[] nums = {2,3,5,7,8,10};

        System.out.println(binarySearch(nums, 6));
        System.out.println(binarySearch(nums, 5));
    }
}
