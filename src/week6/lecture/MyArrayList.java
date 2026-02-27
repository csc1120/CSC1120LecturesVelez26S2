/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week6.lecture;

import java.util.*;
import java.util.stream.Collectors;

public class MyArrayList<E> implements List<E> {
    private static final int INITIAL_CAPACITY = 3;
    private int capacity;
    private int size;
    private E[] data;

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

    //add(int index, E e)
    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid index "+index);
        }
        if(capacity == size){
            reallocate();
        }
        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        } else if (object instanceof MyArrayList){
            MyArrayList<Integer> testList = (MyArrayList<Integer>)object;
            for(int i = 0; i<size; i++){
                if(!data[i].equals(testList.get(i))){
                    return false;
                }
            }
            return true;
        } else if (object instanceof List){
            List<Integer> testList = (List<Integer>)object;
            for(int i = 0; i<size; i++){
                if(!data[i].equals(testList.get(i))){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[" + Arrays.stream(data).
                limit(size).
                map(a -> String.valueOf(a)).
                collect(Collectors.joining(", "))
                + "]";
    }
}
