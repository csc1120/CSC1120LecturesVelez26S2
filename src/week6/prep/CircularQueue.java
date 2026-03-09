/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/3/2026
 */

package week6.prep;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements PureQueue<E> {
    private E[] data;
    private int capacity = 4;
    private int front;
    private int end;
    private int size;
    @SuppressWarnings("unchecked")
    public CircularQueue(){
        data = (E[]) new Object[capacity];
        front = 0;
        end = capacity - 1;
        size = 0;
    }
    private void reallocate(){
        capacity = capacity * 2;
        E[] temp = (E[]) new Object[capacity];

        int j = front;
        for(int i = 0; i<size; i++){
            temp[i] = data[j];
            j = (j + 1) % data.length;
        }
//        int j = 0;
//        for(int i = front; i < data.length; i++){
//            temp[j] = data[i];
//            j++;
//        }
//        for(int i = 0; i < front; i++){
//            temp[j] = data[i];
//            j++;
//        }
        data = temp;
        front = 0;
        end = size - 1;
    }
    /**
     * adds item to the end of the queue. Returns true is successful
     * @param item element to add to the end of the queue
     * @return true is successfully added
     */
    @Override
    public boolean offer(E item) {
        if(size == capacity){
            reallocate();
        }
        end = (end + 1) % capacity;
        data[end] = item;
        size++;
        return true;
    }

    /**
     * removes element from the front of the queue
     * and returns it
     * @throws NoSuchElementException if empty
     * @return element that was removed
     */
    @Override
    public E remove() throws NoSuchElementException {
        if(size == 0){
            throw new NoSuchElementException("Error queue is empty");
        }
        size--;
        E ret = data[front];
        front = (front + 1) % capacity;
        return ret;
    }
    /**
     * removes element from the front of the queue
     * and returns it
     * Returns null if the list is empty
     * @return element from the front of the queue or null if
     * the queue is empty
     */
    @Override
    public E poll() {
        if(size == 0){
            return null;
        }
        size--;
        E ret = data[front];
        front = (front + 1) % capacity;
        return ret;
    }

    /**
     * returns the element at the front of the queue w/o removing it
     * @throws NoSuchElementException if empty
     * @return element at the front of the queue
     */
    @Override
    public E element() throws NoSuchElementException {
        if(size == 0){
            throw new NoSuchElementException("Error queue is empty");
        }
        return data[front];
    }

    /**
     * Return the element at the front of the queue w/o removing it
     * Returns null is the list is empty
     * @return element at the front of the queue or null if the queue
     * is empty
     */
    @Override
    public E peek() {
        if(size == 0){
            return null;
        } else {
            return data[front];
        }
    }
}
