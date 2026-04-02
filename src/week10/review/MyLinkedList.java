/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/27/2026
 */

package week10.review;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;
        public Node(E data){
            this.data = data;
        }
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> head;
    //private int size;
    public MyLinkedList(){
        head = null;
    }
    //O(n)
    public int size(){
        Node<E> walker;
        int count = 0;
        walker = head;
        while(walker != null) {
            walker = walker.next;
            count++;
        }
        return count;
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
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        //add with an empty list
        if(head == null){
            head = newNode;
        } else {
            //add with a list with stuff
            Node<E> walker = head;
            int count = 0;
            while(count < size() - 1){
            //while(walker.next != null){
                walker = walker.next;
                count++;
            }
            //hopefully walker at the end is the last node
            walker.next = newNode;
        }

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
    private Node<E> getNode(int index){
        Node<E> walker = head;
        for(int i = 0; i<index; i++){
            walker = walker.next;
        }
        return walker;
    }
    @Override
    public E get(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return getNode(index).data;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        if(index > size() || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index == size()){
            add(element);
        } else {
            if(index == 0){
                Node<E> newNode = new Node<>(element);
                newNode.next = head;
                head = newNode;
            } else {
                Node<E> prev = getNode(index - 1);
                Node<E> curr = prev.next;
                Node<E> newNode = new Node<>(element);
                newNode.next = curr;
                prev.next = newNode;
            }

        }



    }

    @Override



    public E remove(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(index == 0){
            Node<E> curr = head;
            head = head.next;
            return curr.data;
        } else {
            Node<E> prev = getNode(index - 1);
            Node<E> curr = prev.next;
            prev.next = curr.next;
            return curr.data;
        }
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
