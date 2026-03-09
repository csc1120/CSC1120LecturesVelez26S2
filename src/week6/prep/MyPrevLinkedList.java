/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/4/2026
 */

package week6.prep;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyPrevLinkedList<E> implements List<E> {
    private static class Node<E> {
        private E data;
        private Node<E> prev;

        private Node(E data){
            this.data = data;
        }
        private Node(E data, Node<E> prev){
            this.prev = prev;
        }
    }
    private Node<E> tail;
    private int size;

    public MyPrevLinkedList(){
        tail = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Adds the passed-in element to the back of the list.
     * @param e element to add
     * @return true if the operation is a success
     */
    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.prev = tail;
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    public Node<E> getNode(int index){
        Node<E> walker = tail;
        int count = size - 1;
        while (walker.prev != null && count > index){
            walker = walker.prev;
            count--;
        }
        return walker;
    }
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        E ret;
        if(index == size - 1){
            ret = tail.data;
            tail = tail.prev;
            size--;
        } else {
            Node<E> next = getNode(index + 1);
            Node<E> curr = next.prev;
            ret = curr.data;
            next.prev = curr.prev;
            size--;
        }
        return ret;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
