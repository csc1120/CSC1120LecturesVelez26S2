/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

public interface PureSet<E> {

    /**
     * Attempts to add the element to the set.
     * If teh set already contains the element
     * it is not added
     * @param element
     * @return True if the element is added, False otherwise
     */
    boolean add(E element);

    /**
     * REturns true is the element is present
     * @param element
     * @return
     */
    boolean contains(E element);

    /**
     * Attempts to remove the element from the
     * set if it is present.
     * @param element
     * @return True if the element was remove, false otherwise
     */
    boolean remove(E element);
    int size();
    boolean isEmpty();
}
