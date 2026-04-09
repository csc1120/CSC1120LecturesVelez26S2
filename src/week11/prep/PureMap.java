/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/7/2026
 */
package week11.prep;

public interface PureMap<K, V> {
    int size();

    boolean isEmpty();

    /**
     * Returns the value associated with the passed-in key
     * or null if the key-value entry is not in the map
     * @param key
     * @return
     */
    V get(Object key);

    /**
     * Attempts to remove the key-value entry that contains
     * the passed-in key if present.
     * @param key
     * @return The value of the entry removed or null if the
     * key was not found
     */
    V remove(Object key);



    /**
     * Attempts to put a new entry with the key K and
     * value V. If an entry already exists with the key K
     * then the value of the entry is replaced by the passed-in
     * value.
     * @param key
     * @param value
     * @return Returns the prior value if the entry already
     * existed, null otherwise
     */
    V put(K key, V value);
}
