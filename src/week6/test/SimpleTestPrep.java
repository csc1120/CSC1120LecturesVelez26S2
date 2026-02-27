/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/24/2026
 */

package week6.test;


import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleTestPrep {
    @BeforeAll
    public static void initialize(){
        System.out.println("Running examples of JUnit annotations and assertions");
    }
    @BeforeEach
    public void testSetup(){
        System.out.println("Running any setup before each test");
    }
    @DisplayName("Testing 42 is greater than -1")
    @Test
    public void testCompareNineAndEight(){
        int x = 9;
        int y = 8;
        Assertions.assertTrue(x > y,
                "Error, 9 should be greater than 8");
        Assertions.assertFalse(x < y,
                "Error 8 should not be greater than 9");
    }
    @DisplayName("Testing 3 plus 4 is 7")
    @Test
    public void testThreePlusSeven(){
        int x = 3;
        int y = 4;
        int z = x + y;
        int expected = 7;
        Assertions.assertEquals(expected, z, "Answer for 3 + 4 should be 7");
        Assertions.assertNotEquals(expected, x, "Answer should not equal 3");
    }
    @DisplayName("Testing the Scanner has been set")
    @Test
    public void setScanner(){
        String[] words = new String[1];
        Assertions.assertNull(words[0], "Unset element should be null");
        words[0] = "foo";
        Assertions.assertNotNull(words[0], "First element should not be null");
    }


    @DisplayName("Testing out of bounds exception for an array")
    @Test
    public void testOutOfBoundsArray(){
        List<Integer> nums = new ArrayList<>();
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> nums.get(-1),
                "Indexing at -1 should throw an IndexOutOfBoundsException");
    }
    @DisplayName("Showing what happens when an assert fails")
    @Test
    public void showFailedAssert(){
        Assertions.assertTrue(false, "False is not true");
        Assertions.assertEquals(0, 1 + 1, "1 + 1 is not 0");
        Assertions.assertNotNull(null, "null is not not null");
    }
    @AfterEach
    public void testCleanup(){
        System.out.println("Running any cleanup operations after each test");
    }
    @AfterAll
    public static void shutdown(){
        System.out.println("Done with all tests.");
    }

}
