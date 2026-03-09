/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/6/2026
 */
package week7;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class ListStack<E> implements PureStack<E> {

    private final List<E> data;
    public ListStack(){
        data = new ArrayList<>();
        //data = new LinkedList<>();
    }
    /**
     * Returns true if the stack is empty
     * and false other wiese
     *
     * @return True if the stack is empty, false otherswise
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Returns the object at the top of the stack
     * w/o removing it
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException if stack is empty
     */
    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException("Empty stack");
        }
        //O(1) for an ArrayList
        //??? for a LinkedList
        //LinkedList w/ and w/o a tail
        return data.get(data.size()-1);
    }

    /**
     * Returns the object at the top of the stack
     * and removes it
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException("Empty stack");
        }
        //ArrayList O(1)
        return data.remove(data.size()-1);
    }

    /**
     * Adds an item to the top of the stack
     *
     * @param obj Item to be added to the stack
     * @return The item added to the top of teh stack
     */
    @Override
    public E push(E obj) {
        //O(1) for ARrayList
        data.add(obj);
        return obj;
    }
}
