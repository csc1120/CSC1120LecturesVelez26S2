/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week11.exam2review;

import java.io.IOException;
import java.util.*;

public class MyArrayList<E> implements List<E> {
    private static final int INITIAL_CAPACITY = 3;
    private int capacity;
    private int size;
    private E[] data;
    private class MyArrayListIterator implements Iterator<E> {
        private int position;
        boolean elementToRemove;
        public MyArrayListIterator(){
            position = -1;
            elementToRemove = false;
        }
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return position < size - 1;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() throws NoSuchElementException{
            if(hasNext()){
                E d = data[++position];
                elementToRemove = true;
                return d;
            } else{
                throw new NoSuchElementException();
            }

        }

        /**
         * Removes from the underlying collection the last element returned
         * by this iterator (optional operation).  This method can be called
         * only once per call to {@link #next}.
         * <p>
         * The behavior of an iterator is unspecified if the underlying collection
         * is modified while the iteration is in progress in any way other than by
         * calling this method, unless an overriding class has specified a
         * concurrent modification policy.
         * <p>
         * The behavior of an iterator is unspecified if this method is called
         * after a call to the {@link #forEachRemaining forEachRemaining} method.
         *
         * @throws UnsupportedOperationException if the {@code remove}
         *                                       operation is not supported by this iterator
         * @throws IllegalStateException         if the {@code next} method has not
         *                                       yet been called, or the {@code remove} method has already
         *                                       been called after the last call to the {@code next}
         *                                       method
         * @implSpec The default implementation throws an instance of
         * {@link UnsupportedOperationException} and performs no other action.
         */
        @Override
        public void remove() {
            if(!elementToRemove){
                throw new IllegalStateException("next() must be called beore a remove()");
            }
            MyArrayList.this.remove(position);
            elementToRemove = false;
            position--;
        }
    }
    
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        capacity = INITIAL_CAPACITY;

        data = (E[]) new Object[capacity];
        size = 0;
    }

    public int size() {
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
        return new MyArrayListIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(E obj) {
        if (size() == capacity) {
            reallocate();
        }
        data[size] = obj;
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

    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    private void reallocate() {
        capacity = capacity * 2;
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size(); i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    /**
     * Removes the element at the given index
     * @param index index of element to remove
     * @return element that was removed
     * @throws IndexOutOfBoundsException if the index is invalid.
     *                                   The invalid is invalid if it is less than 0 or greater than or equal to the size.
     */
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
        E result = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        //data[size - 1] = null;
        size--;
        return result;
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

    public void add(int index, E e){
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
        if(size == capacity){
            reallocate();
        }
        if(index == size){
            add(e);
        } else {
            E ret = data[index];
            for(int i = size; i - 1 >= index; i--){
                data[i] = data[i - 1];
            }
            data[index] = e;
            size++;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<size; i++){
            sb.append(data[i]  + ",");
        }
        return sb.toString();
    }
}
