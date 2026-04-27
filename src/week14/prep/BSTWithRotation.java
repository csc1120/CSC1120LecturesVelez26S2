package week14.prep;

public class BSTWithRotation<E extends Comparable<E>>
        extends MyBinarySearchTree<E> {
    public void rotateRight(){
        root = rotateRight(root);
    }
    protected Node<E> rotateRight(Node<E> root){
        Node<E> leftChild = root.left;
        root.left = leftChild.right;
        leftChild.right = root;
        return leftChild;
    }
    public void rotateLeft(){
        root = rotateLeft(root);
    }
    protected Node<E> rotateLeft(Node<E> root){
        Node<E> rightChild = root.right;
        root.right = rightChild.left;
        rightChild.left = root;
        //return will set root to rightChild
        return rightChild;
    }

}
