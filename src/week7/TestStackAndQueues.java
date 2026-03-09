/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/4/2026
 */
package week7;

import java.util.ArrayDeque;

public class TestStackAndQueues {
    public static void main(String[] args) {
        //ArrayDeque<String> stack = new ArrayDeque<>();
        PureStack<String> stack;
        //stack = new ListStack<>();
        stack = new NodeStack<>();

        stack.push("foo");
        stack.push("bar");
        stack.push("taco");
        stack.push("cat");
        //O(1)
        System.out.println(stack.isEmpty());

        //if MyArrayList -> O(1)
        //if MyArrayList w/ size attribute -> O(n)
        //if MyArrayList w/ size tail -> O(1)
        System.out.println(stack.pop()); //cat
        System.out.println(stack.pop()); //taco

        System.out.println(stack.peek()); //bar
        System.out.println(stack.peek()); //bar
    }
}
