/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/25/2026
 */
package week9.prep;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyBinaryTree<E> {
    protected class Node<E> {
        protected E data;
        protected Node<E> left;
        protected Node<E> right;
        public Node(E data){
            this.data = data;
        }
        public Node(E data, Node<E> left, Node<E> right){
            this.left = left;
            this.right = right;
            this.data = data;
        }
        public String toString(){
            return data.toString();
        }
    }
    protected Node<E> root;

    /**
     * Creates an empty BinaryTree that can
     * be the child of a leaf node.
     */
    public MyBinaryTree(){
        root = null;
    }

    public MyBinaryTree(E data, MyBinaryTree<E> left, MyBinaryTree<E> right){
        root = new Node<>(data);
        if(left != null){
            root.left = left.root;
        }
        if(right != null){
            root.right = right.root;
        }
    }

    public void preOrderTraversal(Consumer<String> consumer){
        preOrderTraversal(root, consumer);
    }
    public void preOrderTraversal(Node<E> localRoot, Consumer<String> consumer){
        if(localRoot == null){
            consumer.accept("null");
        } else {
            consumer.accept(localRoot.data.toString());
            preOrderTraversal(localRoot.left, consumer);
            preOrderTraversal(localRoot.right, consumer);
        }
    }

    public String toString(){
        return toString(root, 1);
    }
    public String toString(Node<E> localRoot, int depth){
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(depth));
        if(localRoot == null){
            sb.append("empty").append("\n");
            return sb.toString();
        } else {
            sb.append(localRoot.data + "\n");
            sb.append(toString(localRoot.left, depth + 1));
            sb.append(toString(localRoot.right, depth + 1));
            return sb.toString();
        }
    }

}
