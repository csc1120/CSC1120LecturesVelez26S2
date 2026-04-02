/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/30/2026
 */
package week9.lecture;

public class MyBSTDriver {
    static void main() {
        MyBST<Integer> bst = new MyBST<>();

        bst.add(7);
        bst.add(3);
        bst.add(8);
        bst.add(4);
        bst.add(2);
        bst.add(11);
        bst.add(10);

        System.out.println(bst);
    }
}
