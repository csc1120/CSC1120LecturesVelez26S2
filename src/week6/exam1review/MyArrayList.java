package week6.exam1review;

public class MyArrayList<E> {

    /**
     * Default initial size of storage array
     */
    private static final int INITIAL_CAPACITY = 3;
    /**
     * Current size of the internal storage array
     */
    private int capacity;
    /**
     * Number of elements that have been stored
     */
    private int size;
    /**
     * Internal storage array
     */
    private E[] data;

    /**
     * Constructor for MyArrayList. Sets the capacity
     * to the initial capacity, creates a new array for
     * data, and sets size to 0.
     */
    @SuppressWarnings("unchecked")
    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        //data = new E[capacity]; //compilation error
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * Returns the number of elements stored in this List
     * @return number of elements stored
     */
    public int size() {
        return size;
    }

    /**
     * Adds the passed in element ot the back of the list
     * @param obj element to add
     * @return true is the element was successfully added. false otherwise
     */
    public boolean add(E obj){
        if(size() == capacity){
            reallocate();
        }
        data[size] = obj;
        size++;
        return true;
    }

    /**
     * Doubles the capacity of the internal storage array
     */

    public void reallocate(){
        capacity = capacity * 2;
        @SuppressWarnings("unchecked") E[] temp = (E[]) new Object[capacity];
        for(int i = 0; i<size; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    /**
     * Inserts the passed in object as the specified index
     * @param index location to insert the object
     * @param obj element ot insert
     * @return true or false is the operation was successful
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public boolean add(int index, E obj){
        if(size == capacity){
            reallocate();
        }
        if(index == size){
            return add(obj);
        } else {
            for (int i = size(); i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = obj;
            size++;
        }
        return true;
    }
    public E get(int index) {
        return data[index];
    }

    public E removeFromMiddle() throws IllegalStateException {
        int index = size()/2;
        E element = data[index];
        if(size() == 0){
            throw new IllegalStateException("List is empty");
        }
        for(int i = index; i + 1 < size(); i++){
            data[i] = data[i + 1];
        }
        size--;
        return element;
    }


}
