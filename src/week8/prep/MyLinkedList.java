/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/24/2026
 */

package week8.prep;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data){
            this.data = data;
        }
        private Node(E data, Node<E> next){
            this.next = next;
        }
    }
    private Node<E> head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        if(head == null){
            return 0;
        } else {
            Node<E> walker = head;
            int count = 1;
            while(walker.next != null){
                walker = walker.next;
                count++;
            }
            return count;
        }
        //return size;
    }

    private Node<E> getNode(int index){
        Node<E> walker = head;
        int count = 0;
        while (walker.next != null && count < index){
            walker = walker.next;
            count++;
        }
        return walker;
    }
    @Override
    public boolean add(E e) {
        if(size == 0){
            head = new Node<>(e);
            size++;
        } else {
//            Node<E> walker = head;
//            while(walker.next != null){
//                walker = walker.next;
//            }
//            walker.next = new Node<>(e);
            Node<E> last = getNode(size - 1);
            last.next = new Node<>(e);
            size++;
        }
        return true;
    }
    @Override
    public E get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        if(index == 0){
            return head.data;
        } else {
//            Node<E> walker = head;
//            int count = 0;
//            while (walker.next != null && count < index){
//                walker = walker.next;
//                count++;
//            }
            Node<E> current = getNode(index);
            return current.data;
        }
    }
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        E ret;
        if(index == 0){
            ret = head.data;
            head = head.next;
            size--;
        } else {
//            Node<E> walker = head;
//            int count = 0;
//            while (walker.next != null && count < index - 1){
//                walker = walker.next;
//                count++;
//            }
            Node<E> prev = getNode(index - 1);
            ret = prev.next.data;
            prev.next = prev.next.next;
            size--;
        }
        return ret;
    }

    @Override
    public E set(int index, E element) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        E ret;
        if(index == 0){
            ret = head.data;
            head.data = element;
        } else {
            Node<E> current = getNode(index);
            ret = current.data;
            current.data = element;
        }
        return ret;
    }

    @Override
    public void add(int index, E element) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        Node<E> newNode = new Node<>(element);
        if(index == 0){
            newNode.next = head;
            head = newNode;
            size++;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
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
