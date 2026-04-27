package week14.lecture;

import java.util.function.BiConsumer;

public class MyBinarySearchTree<E extends Comparable<E>>
        extends MyBinaryTree<E> implements SearchTree<E> {

    /**
     * Keeps track of whether something was
     * added during add()
     */
    protected boolean addReturn;
    /**
     * Keeps track of the element that was
     * deleted
     */
    private E deleteReturn;

    public MyBinarySearchTree(E data,
                              MyBinarySearchTree<E> left,
                              MyBinarySearchTree<E> right) {
        super(data, left, right);
    }
    public MyBinarySearchTree() {
        super();
        addReturn = false;
        deleteReturn = null;
    }

    /**
     * Inserts item where it belongs in the tree.
     *
     * @param item to insert
     * @return true if the items is inserted,
     * false if it wasn't (i.e., already in the tree)
     */
    @Override
    public boolean add(E item) {
        root = add(root, item);
        return addReturn;
    }
    private Node<E> add(Node<E> localRoot, E item){
        if(localRoot == null){
            addReturn = true;
            return new Node<>(item);
        } else if(item.compareTo(localRoot.data) == 0) {
            addReturn = false;
            return localRoot;
        } else if(item.compareTo(localRoot.data) < 0){
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }


    /**
     * Returns true if the target is found in the tree
     *
     * @param target element to search for
     * @return true if the target is found in the tree
     */
    @Override
    public boolean contains(E target) {
        return find(target) == null;
    }

    /**
     * Returns a reference to the data in the node that
     * is equal to target. If no such node is found,
     * returns null
     *
     * @param target element to find
     * @return reference to the data in the node or null
     */
    @Override
    public E find(E target) {
        return find(root, target);
    }

    private E find(Node<E> localRoot, E target){
        if(localRoot == null){
            return null;
        } else {
            if(target.compareTo(localRoot.data) == 0){
                return localRoot.data;
            } else if(target.compareTo(localRoot.data) < 0){
                return find(localRoot.left, target);
            } else {
                return find(localRoot.right, target);
            }
        }
    }

    /**
     * Removes target (if found) from tree and
     * returns it; otherwise returns null
     *
     * @param target element to remove
     * @return target if found, else null
     */
    @Override
    public E delete(E target) {
        root = delete(root, target);
        return deleteReturn;
    }
    private Node<E> delete(Node<E> localRoot, E target){
        if(localRoot == null){
            deleteReturn = null;
            return null;
        } else {
            if(target.compareTo(localRoot.data) < 0){
                localRoot.left = delete(localRoot.left, target);
                return localRoot;
            } else if(target.compareTo(localRoot.data) > 0) {
                localRoot.right = delete(localRoot.right, target);
                return localRoot;
            } else {
                deleteReturn = localRoot.data;
                if (localRoot.left == null && localRoot.right == null) {
                    return null;
                } else if(localRoot.left == null){
                    return localRoot.right;
                } else if(localRoot.right == null){
                    return localRoot.left;
                } else {
                    if(localRoot.left.right == null){
                        localRoot.data = localRoot.left.data;
                        localRoot.left = localRoot.left.left;
                    } else {
                        localRoot.data = getLargestChild(localRoot.left);
                    }
                    return localRoot;
                }
            }
        }
    }

    /**
     * Find the node that is the inorder predecessor
     * and replace it with its left child(if any)
     * post: the inorder predecessor is removed from the tree
     * @param parent parent of the possible inorder predecessor (ip)
     * @return data in the ip
     */
    private E getLargestChild(Node<E> parent){
        //If the right child has no right child,
        //it is the inorder predecessor
        if(parent.right.right == null){
            E ret = parent.right.data;
            parent.right = parent.right.left;
            return ret;
        }  else{
            return getLargestChild(parent.right);
        }
    }

    /**
     * Removes target (if found) from tree and
     * returns true, otherwise returns false
     *
     * @param target element to remove
     * @return true if target was found, else
     * false
     */
    @Override
    public boolean remove(E target) {
        return delete(target) != null;
    }

    public void inOrderTraverse(BiConsumer<E, Integer> consumer){
        inOrderTraverse(root, 1, consumer);
    }
    public void inOrderTraverse(Node<E> root, int depth, BiConsumer<E, Integer> consumer){
        if(root == null){
            consumer.accept(null, depth);
        } else {
            //Inorder Traversal
            //traverse T_L
            //evaluate(T_root)
            //traverse T_R
            inOrderTraverse(root.left, depth + 1, consumer);
            consumer.accept(root.data, depth);
            inOrderTraverse(root.right, depth + 1, consumer);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void clear(){
        root = null;
    }
}
