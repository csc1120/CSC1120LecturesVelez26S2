/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/4/2026
 */

package week6.prep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Quiz7 {
    List<String> empty;
    @BeforeEach
    public void setupLists(){
        empty = new ArrayList<>();
    }

    @Test
    public void testAdd(){
        empty.add("foo");
        Assertions.assertEquals(1, empty.size());
        Assertions.assertEquals("foo", empty.remove(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> empty.remove(0));
    }
}
