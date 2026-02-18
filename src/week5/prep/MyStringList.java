/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/15/2026
 */

package week5.prep;

public class MyStringList {
    /**
     * Internal storage array
     */
    private String[] data;
    /**
     * Default initial size of storage array
     */
    private static final int INITIAL_CAPACITY = 5;
    /**
     * Current capacity of the internal storage array
     */
    private int capacity;
    /**
     * Number of elements that have been stored
     */
    private int size;
    /**
     * Constructor for MyString. Sets the capacity
     * to the initial capacity, creates a new array for
     * data, and sets size to 0.
     */
    public MyStringList(){
        capacity = INITIAL_CAPACITY;
        data = new String[capacity];
        size = 0;
    }

    /**
     * Returns the number of elements stored in this List
     * @return number of elements stored
     */
    public int size() {
        return size;
    }
}

