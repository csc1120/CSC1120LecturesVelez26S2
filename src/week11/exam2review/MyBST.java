/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week11.exam2review;

public class MyBST<E extends Comparable<E>>
        extends MyBinaryTree<E> implements SearchTree<E> {

    private boolean addReturn;

    public MyBST(E data, MyBST<E> left, MyBST<E> right){
        super(data, left, right);
    }
    public MyBST(){
        super();
    }
    /**
     * Attempts to find target within the tree. If
     * it finds the target, returns a reference to
     * that object. If target is not in the tree,
     * returns null.
     *
     * @param target Target we are looking for
     * @return Reference to the target or null
     */
    @Override
    public E find(E target) {
        return find(root, target);
    }
    private E find(Node<E> localRoot, E target){
        if(localRoot == null){//base case
            return null;
        } else { //recursive case
            if(target.compareTo(localRoot.data) == 0){
                return localRoot.data;
            } else if (target.compareTo(localRoot.data) < 0) {
                return find(localRoot.left, target);
            } else {
                return find(localRoot.right, target);
            }
        }
    }


    /**
     * Attempst to add the item to the tree. If the item
     * is already in the tree, the add fails land returns false.
     * If the items is not in the tree, it is added and this
     * method returns true.
     *
     * @param item Element to add
     * @return true or false if the element was added
     */
    @Override
    public boolean add(E item) {
        root = add(root, item);
        return addReturn;
    }
    private Node<E> add(Node<E> localRoot, E item){
        if(localRoot == null){
            addReturn = true;
            return new Node<E>(item);
        } else if(item.compareTo(localRoot.data) == 0){
            addReturn = false;
            return localRoot;
        } else if(item.compareTo(localRoot.data) < 0){
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {// if(item.compareTo(localRoot.data) > 0){
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

    public int depthOf(E item) {
        return depthOf(item, root, 1);
    }
    private int depthOf(E item, Node<E> localRoot, int depth){
        if(localRoot == null){
            return -1;
        } else {
            if(item.compareTo(localRoot.data) == 0){
                return depth;
            } else if(item.compareTo(localRoot.data) < 0){
                return depthOf(item, localRoot.left, depth + 1);
            } else {
                return depthOf(item, localRoot.right, depth + 1);
            }
        }
    }






    //real
    /**
     * Returns the height of the item in the tree or -1 if the
     * item is not in the tree.
     * @param item Item whose height is being queried.
     * @return Height of the item or -1 if the item is not in the tree.
     */
    public int heightOf(E item){
        return heightOf(root, item, 1);
    }
    private int heightOf(Node<E> localRoot, E item, int height){
        if(localRoot == null){
            return  -1;
        } else if(item.compareTo(localRoot.data) == 0){
            return height;
        } else if(item.compareTo(localRoot.data) < 0){
            return heightOf(localRoot.left, item, height + 1);
        } else {
            return heightOf(localRoot.right, item, height + 1);
        }
    }

    /**
     * Returns the number of elements in the tree that are bigger
     * than the passed in item.
     * @param item Item to compare to.
     * @return Number of elements bigger than the passed-in item
     */
    public int numBigger(E item){
        return numBigger(root, item);
    }

    private int numBigger(Node<E> localRoot, E item){
        if(localRoot == null){
            return 0;
        }
        if (item.compareTo(localRoot.data) < 0){
            return 1 + numBigger(localRoot.left, item) + numBigger(localRoot.right, item);
        } else {
            return numBigger(localRoot.right, item);
        }
    }

    public boolean contains(E item){
        return contains(root, item);
    }
    private boolean contains(Node<E> localRoot, E item){
        if(localRoot == null){
            return false;
        } else if(item.compareTo(localRoot.data) == 0){
            return true;
        } else if(item.compareTo(localRoot.data) < 0){
            return contains(localRoot.left, item);
        } else {
            return contains(localRoot.right, item);
        }
    }
}
