/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/24/2026
 */

package week6.test;

import org.junit.jupiter.api.*;
import week6.prep.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayListTestPrep {
    MyArrayList<Integer> list;
    MyArrayList<Integer> filled;
    List<Integer> expected;

    @DisplayName("Creating a basic empty list.")
    @BeforeEach
    public void setupBasicList(){
        list = new MyArrayList<>();
        expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        filled = new MyArrayList<>();
        for(Integer i: expected){
            filled.add(i);
        }
    }
    private void compareList(List<Integer> list1, MyArrayList<Integer> list2){
        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i<list2.size(); i++){
            actual.add(list2.get(i));
        }
        Assertions.assertEquals(list1, actual,
                "List contents does not match the expected values.");
    }

    @DisplayName("Testing the constructor.")
    @Test
    public void constructorTest(){
        Assertions.assertEquals(0, list.size(),
                "Error size of the list at the start should be 0.");
    }

    @DisplayName("Testing the add method")
    @Test
    public void addTest(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Assertions.assertEquals(5, list.size(),
                "Error size after adding 5 elements should be 5.");
        Assertions.assertTrue(list.add(6),
                "add() for an ArrayList should always return true");
    }

    @DisplayName("Testing the get method")
    @Test
    public void getTest(){
        MyArrayList<Integer> list = new MyArrayList<>();
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(Integer i:expected){
            list.add(i);
        }
//        //Two different ways of testing the contents of the list
//        //Using a for loop and comparing each value one at a time
//        for(int i = 0; i < list.size(); i++){
//            Assertions.assertEquals(expected.get(i), list.get(i),
//                    "Element at index "+i+ " did not match expected value.");
//        }
        //Add the contents to a List and comparing the two lists.
        //This version gives a nicer printout if an error occurs
        //but takes slightly more work to setup.
        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            actual.add(list.get(i));
        }
        Assertions.assertEquals(expected, actual,
                "Contents of the list did not match the expect values");
    }

    @Nested
    @DisplayName("Testing the remove() method")
    public class removeTest {
        @DisplayName("Test remove from front")
        @Test
        public void removeFromFront() {
            Integer removedA;
            Integer removedE;
            //Remove the first element
            removedA = filled.remove(0);
            removedE = expected.remove(0);
            Assertions.assertEquals(removedE, removedA,
                    "Error, element removed is not correct");
            compareList(expected, filled);
        }
        @DisplayName("Test remove from back")
        @Test
        public void removeFromBack() {
            Integer removedA;
            Integer removedE;
            //Remove the first element
            removedA = filled.remove(filled.size() - 1);
            removedE = expected.remove(expected.size() - 1);
            Assertions.assertEquals(removedE, removedA,
                    "Error, element removed is not correct");
            compareList(expected, filled);
        }
        @DisplayName("Test remove from middle")
        @Test
        public void removeFromMiddle() {
            Integer removedA;
            Integer removedE;
            //Remove the first element
            removedA = filled.remove(filled.size()/2);
            removedE = expected.remove(expected.size()/2);
            Assertions.assertEquals(removedE, removedA,
                    "Error, element removed is not correct");
            compareList(expected, filled);
        }
    }

    @DisplayName("Testing get exceptions")
    @Test
    public void getExceptions(){
        MyArrayList<Integer> list = new MyArrayList<>();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(0),
                "Getting the element at index 0 of an empty list should throw IndexOutOfBoundException");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1),
                "Getting the element at index -1 should throw IndexOutOfBoundException");
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size()),
                "Getting the element at index size() should throw IndexOutOfBoundException");
    }

    @Nested
    @DisplayName("Testing the add(int i, E e) method")
    class testAdd2 {
        @DisplayName("Adding to front")
        @Test
        public void testAddingToTheFront(){
            filled.add(0,42);
            expected.add(0, 42);
            compareList(expected,filled);
        }
        @DisplayName("Adding to back")
        @Test
        public void testAddingToTheBack(){
            filled.add(filled.size(),42);
            expected.add(expected.size(), 42);
            compareList(expected,filled);
        }
        @DisplayName("Adding to middle")
        @Test
        public void testAddingToTheMiddle(){
            filled.add(filled.size()/2,42);
            expected.add(expected.size()/2, 42);
            compareList(expected,filled);
        }
    }
    @Nested
    @DisplayName("Testing the set(int i, E e) method")
    class testSet {
        @DisplayName("Setting to front")
        @Test
        public void testAddingToTheFront(){
            filled.set(0,42);
            expected.set(0, 42);
            compareList(expected,filled);
        }
        @DisplayName("Setting to the back")
        @Test
        public void testAddingToTheBack(){
            filled.set(filled.size(),42);
            expected.set(expected.size(), 42);
            compareList(expected,filled);
        }
        @DisplayName("Setting to middle")
        @Test
        public void testAddingToTheMiddle(){
            filled.set(filled.size()/2,42);
            expected.set(expected.size()/2, 42);
            compareList(expected,filled);
        }
    }
}
