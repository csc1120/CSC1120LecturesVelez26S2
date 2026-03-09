/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/4/2026
 */

package week6.prep;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class TestStackAndQueues {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        //if MyArrayList -> O(1)
        //if MyLinkedList w/ size attribute -> O(n)
        //if MyLinkedList w/ tail -> O(1)
        stack.push("foo");
        stack.push("bar");
        stack.push("taco");
        stack.push("cat");
        //O(1)
        System.out.println(stack.isEmpty());

        //if MyArrayList -> O(1)
        //if MyArrayList w/ size attribute -> O(n)
        //if MyArrayList w/ size tail -> O(1)
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
