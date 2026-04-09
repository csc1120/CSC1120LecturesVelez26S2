/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSet<E> implements PureSet<E>{
    private List<E> data;

    public ListSet() {
        this.data = new ArrayList<>();
    }

    /**
     * Attempts to add the object to the set.
     * Fails to add if the object is already in the set
     *
     * @param object
     * @return False if there was a duplicate
     */
    @Override
    public boolean add(E object) {
        if(data.contains(object)){
            data.add(object);
            return true;
        }
        return false;
    }

    /**
     * Checks if the object is in the set
     *
     * @param object
     * @return
     */
    @Override
    public boolean contains(E object) {
        return data.contains(object);
    }

    /**
     * Removes the object if present
     *
     * @param object
     * @return True if an object was removed
     */
    @Override
    public boolean remove(E object) {
        return data.remove(object);
    }

    /**
     * Returns the number of elements in the set
     *
     * @return
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Checks if the set is empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}
