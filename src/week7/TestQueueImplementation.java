/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/6/2026
 */
package week7;

public class TestQueueImplementation {
    public static void main(String[] args) {
        PureQueue<String> queue = new ListQueue<>();

        queue.offer("foo");
        queue.offer("bar");
        queue.offer("taco");
        queue.offer("cat");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        while(queue.peek() != null){
            System.out.println(queue.remove());
        }
    }
}
