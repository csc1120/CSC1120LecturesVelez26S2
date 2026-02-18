/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.lecture;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 3;
    private int capacity;
    private int size;
    private E[] data;

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        capacity = INITIAL_CAPACITY;

        data = (E[])new Object[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(E obj){
        if(size() == capacity){
            reallocate();
        }
        data[size] = obj;
        size++;
        return true;
    }
    public E get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index: "+index);
        }
        return data[index];
    }
    private void reallocate(){
        capacity = capacity * 2;
        E[] temp = (E[]) new Object[capacity];
        for(int i = 0; i < size();i++){
            temp[i] = data[i];
        }
        data = temp;
    }


}
