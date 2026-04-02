/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week10.lecture;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

        //System.out.println(plus.toString());

        Consumer<String> printer = (a -> System.out.println(a));
        plus.preOrder(printer);

        List<String> elements = new ArrayList<>();
        Consumer<String> listAdd = (a -> {
            if(!a.equals("empty")){
                elements.add(a);
            }
        });
        plus.preOrder(listAdd);
        System.out.println(elements);
    }
}
