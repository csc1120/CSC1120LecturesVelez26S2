/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/26/2026
 */
package week9.lecture;

public interface SearchTree<E> {

    /**
     * Attempts to find target within the tree. If
     * it finds the target, returns a reference to
     * that object. If target is not in the tree,
     * returns null.
     * @param target Target we are looking for
     * @return Reference to the target or null
     */
    E find(E target);

    /**
     * Attempst to add the item to the tree. If the item
     * is already in the tree, the add fails land returns false.
     * If the items is not in the tree, it is added and this
     * method returns true.
     * @param item Element to add
     * @return true or false if the element was added
     */
    boolean add(E item);


}
