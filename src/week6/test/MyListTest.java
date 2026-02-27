/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/25/2026
 */

package week6.test;

import org.junit.jupiter.api.*;
import week6.lecture.MyArrayList;
import week6.lecture.MyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyListTest {
    private List<Integer> expected;
    private List<Integer> list;
    private List<Integer> empty;
    private String type = "array";
    @BeforeEach
    public void setupTestLists(){
        if(type.equalsIgnoreCase("array")) {
            list = new MyArrayList<>();
            empty = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
            empty = new MyLinkedList<>();
        }
        expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(Integer i: expected){
            list.add(i);
        }
    }
    private void compareList(List<Integer> expected,
                             List<Integer> toTest,
                             String msg){
        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i<toTest.size(); i++){
            actual.add(toTest.get(i));
        }
        Assertions.assertEquals(expected, actual, msg);
    }

    @DisplayName("Test size of initial list")
    @Test
    public void testConstructorSize(){
        Assertions.assertEquals(0, empty.size(),
                "Size of the initial list should be 0");
    }
    @DisplayName("Testing size after multiple adds")
    @Test
    public void testSizeAfterAdd(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Assertions.assertEquals(5, list.size(),
                "Size after adding 5 elements should be 5");
        Assertions.assertTrue(list.add(6),
                "add() for a List should always return true");
    }
    @DisplayName("Testing get after a bunch of adds")
    @Test
    public void testGetAfterAdd(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        for(int i = 0; i<expected.size(); i++){
//            Assertions.assertEquals(expected.get(i), list.get(i),
//                    "Error comparing elements at index "+i);
//        }
        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            actual.add(list.get(i));
        }
        Assertions.assertEquals(expected, actual);

//        System.out.println("MyArrayList and List are equal "+list.equals(expected));
//        System.out.println("List and MyArrayList are equal "+expected.equals(list));
//        //Assertions.assertEquals(expected, actual);
//        Assertions.assertEquals(list, expected);
//        Assertions.assertEquals(expected, list);

    }
    @Nested
    public class addTests {
        @DisplayName("Testing add exceptions")
        @Test
        public void testAddExceptions(){
            Assertions.assertThrows(IndexOutOfBoundsException.class,
                    () -> list.add(-1, 42),
                    "Error add to index -1 should throw an IndexOutOfBounds");
            Assertions.assertThrows(IndexOutOfBoundsException.class,
                    () -> list.add(list.size() + 1, 42),
                    "Error add to beyond the size should throw an IndexOutOfBounds");
        }
        @DisplayName("Testing add to middle")
        @Test
        public void testAddToMiddle() {
            int index = list.size()/2;
            list.add(index, 42);
            expected.add(index, 42);
            compareList(expected, list, "Error when inserting 42 in the middle");
        }
        @DisplayName("Testing add to front")
        @Test
        public void testAddToFront() {
            int index = 0;
            list.add(index, 42);
            expected.add(index, 42);
            compareList(expected, list, "Error when inserting 42 in the middle");
        }
        @DisplayName("Testing add to back")
        @Test
        public void testAddToBack() {
            int index = list.size();
            list.add(index, 42);
            expected.add(index, 42);
            compareList(expected, list, "Error when inserting 42 in the middle");
        }


    }
    @Nested
    public class removeTests {
        @Test
        public void removeExceptionsTest(){
            Assertions.assertThrows(IndexOutOfBoundsException.class,
                    () -> list.remove(-1));
            Assertions.assertThrows(IndexOutOfBoundsException.class,
                    () -> list.remove(list.size()));

        }
        @DisplayName("TEsting removing from middle of list")
        @Test
        public void removeMiddle() {
            int index = list.size() / 2;
            list.remove(index);
            expected.remove(index);
            compareList(expected, list, "Error in removing the first element");
        }

        @DisplayName("TEsting removing from end of list")
        @Test
        public void removeLast() {
            int index = list.size() - 1;
            list.remove(index);
            expected.remove(index);
            compareList(expected, list, "Error in removing the first element");
        }

        @DisplayName("TEsting removing from first of list")
        @Test
        public void removeFirst() {
            int index = 0;
            list.remove(index);
            expected.remove(index);
            compareList(expected, list, "Error in removing the first element");
        }
    }

}
