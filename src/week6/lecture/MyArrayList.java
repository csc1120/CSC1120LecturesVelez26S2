/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week6.lecture;

public class MyArrayList<E> {
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

    public boolean add(E obj) {
        if (size() == capacity) {
            reallocate();
        }
        data[size] = obj;
        size++;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
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

 }
