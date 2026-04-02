/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/30/2026
 */
package week10.review;

public class MyBST<E extends Comparable<E>>
        extends MyBinaryTree<E> {
    private boolean hasAdded;
    public MyBST(){
        super();
    }

    /**
     * Returns a reference to the target if it
     * exists with the BST else returns null if it
     * does not exit.
     * @param target Element to look for
     * @return Element if found else null
     */
    public E find(E target){
        return find(root, target);
    }
    private E find(Node<E> localRoot, E target) {
        if (localRoot == null) {
            return null;
        } else if (target.compareTo(localRoot.data) == 0) {
            return localRoot.data;
        } else if (target.compareTo(localRoot.data) < 0) {
            return find(localRoot.left, target);
        } else {//(target.compareTo(localRoot.data) > 0){
            return find(localRoot.right, target);
        }
    }

    /**
     * Attempts to a
     * @param item
     * @return
     */
    public boolean add(E item){
        hasAdded = true;
        root = add(root, item);
        return hasAdded;
    }
    private Node<E> add(Node<E> localRoot, E item){
        if(localRoot == null){
            return new Node<E>(item);
        } else if(item.compareTo(localRoot.data) == 0){
            hasAdded = false;
            return localRoot;
        }  else if(item.compareTo(localRoot.data) < 0){
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
    public E delete(E item){
        root = delete(root, item);
        return null;
    }
    private Node<E> delete(Node<E> localRoot, E item){
        if(localRoot == null){ //base case???
            return localRoot;
        } else if(item.compareTo(localRoot.data) == 0) {
            //found it!!!
            //case 1: remove a leaf node
            if(localRoot.left == null && localRoot.right == null){
                return null;
            } else if(localRoot.left != null){//case 2: remove node with only 1 child
                return localRoot.left;
            } else if(localRoot.right != null){ //case 2: remove node with only 1 child
                return localRoot.right;
            } else { //case 3: remove node with two children
                return null;
            }
        } else if(item.compareTo(localRoot.data) < 0){
            localRoot.left = delete(localRoot.left, item);
            return localRoot;
        } else {
            localRoot.right = delete(localRoot.right, item);
            return localRoot;
        }
    }
    public int numbiggerThan(E item){
        return numbiggerThan(root, item, 0);
    }
    private int numbiggerThan(Node<E> localRoot, E item, int count){
        if(item.compareTo(localRoot.data) < 0){
            return numbiggerThan(localRoot.left, item, count + 1) +
                    numbiggerThan(localRoot.right, item, count + 1);
        } else if (item.compareTo(localRoot.data) > 0){
            return numbiggerThan(localRoot.right, item, count);
        } else {
            return count;
        }
    }



}

