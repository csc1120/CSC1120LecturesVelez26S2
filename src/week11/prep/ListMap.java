/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListMap<K, V> implements PureMap<K, V> {
    private class Entry<K, V> {
        private final K key;
        private V value;
        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString() {
            return "("+key+":"+value+")";
        }
    }
    List<Entry<K,V>> items;

    public ListMap (){
        items = new ArrayList<>();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Returns the value associated with the passed-in key
     * or null if the key-value entry is not in the map
     *
     * @param key
     * @return
     */
    @Override
    public V get(Object key) {
        V ret = null;
        for(Entry<K,V> e: items){
            if(Objects.equals(key, e.key)){
                ret = e.value;
            }
        }
        return ret;
    }

    private int find(Object key){
        int index = -1;
        for(int i = 0; i<items.size() && index == -1; i++){
            if(Objects.equals(key, items.get(i).key)){
                index = i;
            }
        }
        return index;
    }

    /**
     * Attempts to remove the key-value entry that contains
     * the passed-in key if present.
     *
     * @param key
     * @return The value of the entry removed or null if the
     * key was not found
     */
    @Override
    public V remove(Object key) {
        int index = find(key);
        if(index == -1){
            return null;
        } else {
            return items.remove(index).value;
        }
    }

    /**
     * Attempts to put a new entry with the key K and
     * value V. If an entry already exists with the key K
     * then the value of the entry is replaced by the passed-in
     * value.
     *
     * @param key
     * @param value
     * @return Returns the prior value if the entry already
     * existed, null otherwise
     */
    @Override
    public V put(K key, V value) {
        V ret = null;
        for(int i = 0; i<items.size() && ret == null; i++){
            if(Objects.equals(key, items.get(i).key)){
                ret = value;
                items.get(i).value = value;
            }
        }
        if(ret == null){
            items.add(new Entry<>(key, value));
        }
        return ret;
    }
    public String toString(){
        return items.toString();
    }
}
