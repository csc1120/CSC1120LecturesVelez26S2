/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/1/2026
 */
package week10.review;

public class TestMyBST {
    static void main() {
        MyBST<Integer> bst1 = new MyBST<>();
        bst1.add(7);
        bst1.add(3);
        bst1.add(11);
        bst1.add(1);
        bst1.add(5);
        bst1.add(9);
        System.out.println(bst1);

        MyBST<Integer> bst2 = new MyBST<>();
        bst2.add(11);
        bst2.add(9);
        bst2.add(7);
        bst2.add(5);
        bst2.add(3);
        bst2.add(1);
        System.out.println(bst2);

    }
}
