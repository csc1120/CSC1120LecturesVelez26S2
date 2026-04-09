/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/8/2026
 */
package week11.lecture;

public interface PureMap<K, V> {
    /**
     * Attempts to put an entry into the map
     * with the passed-in key value pair.
     * If an entry with the same key, already
     * exits, overwrite the value of that entry.
     * @return The previous value or
     * null if the entry was not already present
     */
    V put(K key, V value);

    /**
     * Returns the value for the entry with
     * the given key, or null if no entry with
     * that key exists
     * @param key
     * @return
     */
    V get(K key);

    /**
     * Removes the entry with the associated key
     * if it exists.
     * @param key
     * @return Returns the value of the entry if
     * it exists else returns null
     */
    V remove(K key);

    int size();
    boolean isEmpty();
}
