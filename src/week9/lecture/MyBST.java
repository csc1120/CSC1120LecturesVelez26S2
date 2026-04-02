/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week9.lecture;

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


}
