package week6.lecture;

import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> implements PureQueue<E> {

    private List<E> data;
    public MyQueue(){
        data = new LinkedList<>();
    }
    /**
     * adds item to the end of the queue. Returns true is successful
     *
     * @param item element to add to the end of the queue
     * @return true is successfully added
     */
    @Override
    public boolean offer(E item) {
        data.add(item);
        return true;
    }
    /**
     * removes element from the front of the queue and returns it
     * Returns null if the list is empty
     *
     * @return element from the front of the queue or null if
     * the queue is empty
     */
    @Override
    public E poll() {
        return data.remove(0);
    }


    /**
     * removes element from the front of the queue
     * and returns it
     *
     * @return element that was removed
     * @throws NoSuchElementException if empty
     */
    @Override
    public E remove() {
        return null;
    }

    /**
     * returns the element at the front of the queue w/o removing it
     *
     * @return element at the front of the queue
     * @throws NoSuchElementException if empty
     */
    @Override
    public E element() {
        return null;
    }


    /**
     * Return the element at the front of the queue w/o removing it
     * Returns null is the list is empty
     *
     * @return element at the front of the queue or null if the queue
     * is empty
     */
    @Override
    public E peek() {
        return null;
    }
}
