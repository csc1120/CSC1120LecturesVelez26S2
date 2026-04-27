package week14.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBasicRotations {
    public static void main(String[] args) {
        BSTWithRotation<Integer> bst1 =
                new BSTWithRotation<>();

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(50,25,60,10,40,5));
        for(Integer i: nums1){
            bst1.add(i);
        }
        System.out.println("left-left tree before rotation");
        System.out.println(bst1);
        //Note we can directly access
        // the root b/c we are in the same
        // package as these classes
        bst1.root = bst1.rotateRight(bst1.root);

        System.out.println("left-left tree after rotation");
        System.out.println(bst1);

        bst1.clear();
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(50,25,60,55,70,80));
        for(Integer i:nums2){
            bst1.add(i);
        }
        System.out.println("right-right before rotation");
        System.out.println(bst1);

        bst1.root = bst1.rotateLeft(bst1.root);
        System.out.println("right-right tree rotation");
        System.out.println(bst1);


    }
}
