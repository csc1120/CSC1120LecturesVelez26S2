package week14.prep;

import java.util.function.BiConsumer;

public class MyBinaryTree<E> {
    protected static class Node<E>{
        protected Node<E> left;
        protected Node<E> right;
        protected E data;
        public Node(E data){
            this.data = data;
            left = null;
            right = null;
        }
        public String toString(){
            return data.toString();
        }
    }
    protected Node<E> root;
    public MyBinaryTree(E data, MyBinaryTree<E> left, MyBinaryTree<E> right){
        this.root = new Node<>(data);
        if(left != null) {
            root.left = left.root;
        }
        if(right != null){
            root.right = right.root;
        }
    }
    public MyBinaryTree(){
        root = null;
    }
    protected MyBinaryTree(Node<E> root){
        this.root = root;
    }

    public MyBinaryTree<E> getLeftSubtree(){
        if(root != null && root.left != null){
            return new MyBinaryTree<>(root.left);
        } else {
            return null;
        }
    }
    public MyBinaryTree<E> getRightSubtree(){
        if(root != null && root.right != null){
            return new MyBinaryTree<>(root.right);
        } else {
            return null;
        }
    }
    public String toString(){
        return toString(root, 1);
    }

    private String toString(Node<E> root, int depth){
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append("-".repeat(depth)+"null"+"\n");
        } else {
            //Inorder Traversal
            //traverse T_L
            //evaluate(T_root)
            //traverse T_R
            sb.append(toString(root.left, depth + 1));
            sb.append("-".repeat(depth) + root + "\n");
            sb.append(toString(root.right, depth + 1));
        }
        return sb.toString();
    }
    private E getData(){
        if(root != null){
            return root.data;
        }else {
            return null;
        }
    }
    public boolean isLeaf(){
        return root.left == null && root.right == null;
    }
    public void preOrderTraverse(BiConsumer<E, Integer> consumer){
        preOrderTraverse(root, 1, consumer);
    }
    public void preOrderTraverse(Node<E> root, int depth, BiConsumer<E, Integer> consumer){
        if(root == null){
            consumer.accept(null, depth);
        } else {
            //Preorder Traversal
            //evaluate(T_root)
            //traverse T_L
            //traverse T_R
            consumer.accept(root.data, depth);
            preOrderTraverse(root.left, depth + 1, consumer);
            preOrderTraverse(root.right, depth + 1, consumer);
        }
    }
    public int size(){
        return size(root);
    }
    private int size(Node<E> localRoot){
        if(localRoot == null){
            return 0;
        }else {
            return 1 + size(localRoot.left) + size(localRoot.right);
        }
    }
}
