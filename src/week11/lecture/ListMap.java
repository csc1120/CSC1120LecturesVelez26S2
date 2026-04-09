/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListMap<K,V> implements PureMap<K,V> {
    private class Entry<K, V> {
        private final K key;
        private V value;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
        public String toString(){
            return "("+key+","+value+")";
        }
    }
    private List<Entry<K,V>> items;
    public ListMap(){
        items = new ArrayList<>();
    }

    /**
     * Attempts to put an entry into the map
     * with the passed-in key value pair.
     * If an entry with the same key, already
     * exits, overwrite the value of that entry.
     *
     * @param key
     * @param value
     * @return The previous value or
     * null if the entry was not already present
     */
    @Override
    public V put(K key, V value) {
        int index = find(key);
        if(index == -1){
            items.add(new Entry<>(key, value));
            return null;
        } else {
            V ret = items.get(index).value;
            items.get(index).value = value;
            return ret;
        }

    }

    /**
     * Finds the index of the entry with the specified key
     * or returns -1 if there is no entry with the given key.
     * @param key
     * @return
     */
    private int find(K key){
        int index = -1;
        for(int i = 0 ;i< items.size() && index == -1; i++){
            if(Objects.equals(key, items.get(i).key)){
                index = i;
            }
        }
        return index;
    }
    /**
     * Returns the value for the entry with
     * the given key, or null if no entry with
     * that key exists
     *
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        int index = find(key);
        if(index == -1){
            return null;
        } else {
            return items.get(index).value;
        }
    }

    /**
     * Removes the entry with the associated key
     * if it exists.
     *
     * @param key
     * @return Returns the value of the entry if
     * it exists else returns null
     */
    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
