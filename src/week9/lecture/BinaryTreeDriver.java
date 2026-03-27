/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week9.lecture;

public class BinaryTreeDriver {
    static void main() {
        MyBinaryTree<String> e1 = new MyBinaryTree<>();
        MyBinaryTree<String> e2 = new MyBinaryTree<>();

        MyBinaryTree<String> x =
                new MyBinaryTree<>("x", e1, e2);

        MyBinaryTree<String > y =
                new MyBinaryTree<>("y",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());

        MyBinaryTree<String> plus =
                new MyBinaryTree<>("+", x, y);

        System.out.println(plus.toString());



    }
}
