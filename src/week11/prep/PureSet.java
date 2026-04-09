/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

public interface PureSet<E> extends Iterable<E> {
    /**
     * Attempts to add the object to the set.
     * Fails to add if the object is already in the set
     * @param object
     * @return False if there was a duplicate
     */
    boolean add(E object);

    /**
     * Checks if the object is in the set
     * @param object
     * @return
     */
    boolean contains(E object);

    /**
     * Removes the object if present
     * @param object
     * @return True if an object was removed
     */
    boolean remove(E object);

    /**
     * Returns the number of elements in the set
     * @return
     */
    int size();

    /**
     * Checks if the set is empty
     * @return
     */
    boolean isEmpty();


}
