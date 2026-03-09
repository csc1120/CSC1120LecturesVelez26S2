/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/6/2026
 */
package week7;

import java.util.NoSuchElementException;

public class NodeStack<E> implements PureStack<E>{

    private static class Node<E> {
        private E data;
        private Node<E> next;
    }
    private Node<E> head;
    /**
     * Returns true if the stack is empty
     * and false other wiese
     *
     * @return True if the stack is empty, false otherswise
     */
    @Override
    public boolean isEmpty() {
        return false;
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
        return null;
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
        return null;
    }

    /**
     * Adds an item to the top of the stack
     *
     * @param obj Item to be added to the stack
     * @return The item added to the top of teh stack
     */
    @Override
    public E push(E obj) {
        return null;
    }
}
