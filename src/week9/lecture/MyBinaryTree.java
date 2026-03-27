/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week9.lecture;

public class MyBinaryTree<E> {
    protected class Node<E> {
        protected E data;
        protected Node<E> left;
        protected Node<E> right;
        public Node(E data){
            this.data = data;
        }
        public String toString(){
            return data.toString();
        }
    }
    protected Node<E> root;

    public MyBinaryTree(){
        root = null;
    }

    public MyBinaryTree(E data, MyBinaryTree<E> left,
                        MyBinaryTree<E> right){
        root = new Node<>(data);
        if(left.root != null) {
            root.left = left.root;
        }
        if(right.root != null){
            root.right = right.root;
        }
    }

    @Override
    public String toString(){
        return toString(root, 1);
    }
    private String toString(Node<E> localRoot, int depth){
        StringBuilder sb = new StringBuilder();
        if(localRoot == null){ //base case
            sb.append("-".repeat(depth)).append("empty").append("\n");
        } else { //recursive
            //preorder
            //evaluate root
            sb.append("-".repeat(depth)).append(localRoot.toString()).append("\n");
            //traverse left
            sb.append(toString(localRoot.left, depth + 1));
            //traverse right
            sb.append(toString(localRoot.right, depth + 1));
        }
        return sb.toString();
    }

}
