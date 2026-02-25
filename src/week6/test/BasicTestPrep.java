/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/24/2026
 */

package week6.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTestPrep {
    @BeforeAll
    public static void initialize(){
        System.out.println("Setting up things needed before all tests run.");
    }
    @BeforeEach
    public void setup2(){
        System.out.println("Initializing things before each week6.test");
    }
    @Test
    public void someTest(){
        System.out.println("Method to week6.test some operation");
    }
    @AfterEach
    public void cleanup1(){
        System.out.println("Cleaning up after each week6.test");
    }
    @AfterAll
    public static void cleanup2(){
        System.out.println("Done will all tests.");
    }
}
