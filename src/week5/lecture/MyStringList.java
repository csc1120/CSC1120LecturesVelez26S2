/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.lecture;

public class MyStringList {

    private static final int INITIAL_CAPACITY = 3;
    private int capacity;
    private int size;
    private String[] data;

    public MyStringList(){
        capacity = INITIAL_CAPACITY;
        data = new String[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(String obj){
        data[size] = obj;
        size++;
        return true;
    }
    public String get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index: "+index);
        }
        return data[index];
    }
}
