package week14.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAdvancedRotations {
    public static void main(String[] args) {
        BSTWithRotation<Integer> bst1 =
                new BSTWithRotation<>();

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(50,25,60,10,40,35));
        for(Integer i: nums1){
            bst1.add(i);
        }
        System.out.println("left-right tree before rotation");
        System.out.println(bst1);
        //Rotates left around the left child
        bst1.root.left = bst1.rotateLeft(bst1.root.left);
        System.out.println("left-right tree after left child left rotation");
        System.out.println(bst1);
        //Rotates right around the root child
        bst1.root = bst1.rotateRight(bst1.root);
        System.out.println("left-left tree after right rotation");
        System.out.println(bst1);

        bst1.clear();
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(50,25,60,55,70,57));
        for(Integer i:nums2){
            bst1.add(i);
        }
        System.out.println("right-left before rotation");
        System.out.println(bst1);

        bst1.root.right = bst1.rotateRight(bst1.root.right);
        System.out.println("right-left tree after right rotation on right");
        System.out.println(bst1);

        bst1.root = bst1.rotateLeft(bst1.root);
        System.out.println("right-right after left rotation");
        System.out.println(bst1);


    }
}
