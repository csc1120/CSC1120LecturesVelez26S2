/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

import java.util.ArrayList;
import java.util.List;

public class ListSet<E> implements PureSet<E> {

    private List<E> items;
    public ListSet(){
        items = new ArrayList<>();
    }
    /**
     * Attempts to add the element to the set.
     * If teh set already contains the element
     * it is not added
     *
     * @param element
     * @return True if the element is added, False otherwise
     */
    @Override
    public boolean add(E element) {
        if(items.contains(element)){
            return false;
        } else {
            items.add(element);
            return true;
        }
    }

    /**
     * REturns true is the element is present
     *
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return items.contains(element);
    }

    /**
     * Attempts to remove the element from the
     * set if it is present.
     *
     * @param element
     * @return True if the element was remove, false otherwise
     */
    @Override
    public boolean remove(E element) {
        return items.remove(element);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
