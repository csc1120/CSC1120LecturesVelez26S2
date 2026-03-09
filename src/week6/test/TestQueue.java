/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/4/2026
 */

package week6.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week6.prep.CircularQueue;
import week6.prep.PureQueue;

import java.util.NoSuchElementException;

public class TestQueue {
    PureQueue<String> empty;

    @BeforeEach
    public void setupQueues(){
        empty = new CircularQueue<>();
    }

    @Test
    public void emptyQueueOperations(){
        Assertions.assertNull(empty.peek());
        Assertions.assertThrows(NoSuchElementException.class,
                () -> empty.element());

        Assertions.assertNull(empty.poll());
        Assertions.assertThrows(NoSuchElementException.class,
                () -> empty.remove());
    }
    @Test
    public void testPeekAndElementWithOne(){
        empty.offer("foo");
        Assertions.assertEquals("foo", empty.peek());
        Assertions.assertEquals("foo", empty.element());
    }

    @Test
    public void testPeekAndElementWithMany(){
        empty.offer("foo");
        empty.offer("bar");
        empty.offer("taco");
        empty.offer("cat");
        Assertions.assertEquals("foo", empty.peek());
        Assertions.assertEquals("foo", empty.element());
    }

    @Test
    public void testPollAndRemoveWithOne(){
        empty.offer("foo");
        Assertions.assertEquals("foo", empty.poll());
        Assertions.assertNull(empty.poll());

        empty.offer("foo");
        Assertions.assertEquals("foo", empty.remove());
        Assertions.assertThrows(NoSuchElementException.class,
                () -> empty.remove());
    }
    @Test
    public void testPollAndRemoveWithMany(){
        empty.offer("foo");
        empty.offer("bar");
        empty.offer("taco");
        empty.offer("cat");

        Assertions.assertEquals("foo", empty.poll());
        empty.offer("foo");
        Assertions.assertEquals("bar", empty.remove());

        Assertions.assertNotNull(empty.poll());
        Assertions.assertDoesNotThrow(() -> empty.remove());
    }

    @Test
    public void testReallocate(){
        empty.offer("foo");
        empty.offer("bar");
        empty.offer("taco");
        empty.offer("cat");

        Assertions.assertEquals("foo", empty.poll());
        Assertions.assertEquals("bar", empty.poll());

        empty.offer("hello");
        empty.offer("how");
        //reallocate happens
        empty.offer("are");
        empty.offer("you");

        Assertions.assertEquals("taco", empty.poll());
        Assertions.assertEquals("cat", empty.poll());
        Assertions.assertEquals("hello", empty.poll());
        Assertions.assertEquals("how", empty.poll());
        Assertions.assertEquals("are", empty.poll());
        Assertions.assertEquals("you", empty.poll());
    }
}
