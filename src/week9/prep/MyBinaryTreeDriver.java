/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/25/2026
 */
package week9.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyBinaryTreeDriver {
    static void main() {
        MyBinaryTree<String> e1 = new MyBinaryTree<>();
        MyBinaryTree<String> e2 = new MyBinaryTree<>();

        MyBinaryTree<String> x = new MyBinaryTree<>("x", e1, e2);
        MyBinaryTree<String> y = new MyBinaryTree<>("y",
                new MyBinaryTree<>(), new MyBinaryTree<>());

        MyBinaryTree<String> plus = new MyBinaryTree<>("+", x, y);

        System.out.println(plus.toString());

        Consumer<String> printer = (a) -> System.out.println(a);

        plus.preOrderTraversal(printer);

        List<String> values = new ArrayList<>();
        Consumer<String> adder = (a) -> {
            if(!a.contains("null")){
                values.add(a);
            }
        };
        plus.preOrderTraversal(adder);

        System.out.println(values);




    }
}
