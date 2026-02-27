/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/25/2026
 */

package week6.test;


import org.junit.jupiter.api.*;

import java.io.PrintWriter;

public class BasicTest {
    private PrintWriter pw;
    @BeforeAll
    public static void initialize(){
        System.out.println("Running sample tests");
    }
    @BeforeEach
    public void setupTest(){
        System.out.println("Setting stuff for each test");
    }
    @DisplayName("Testing method 1")
    @Test
    public void test1(){

    }
    @DisplayName("Testing method 2")
    @Test
    public void test2(){

    }
    @DisplayName("Testing method 3")
    @Test
    public void test3(){

    }
    @AfterEach
    public void testClean(){
        System.out.println("Cleaning up variables after each test");
    }
    @AfterAll
    public static void cleanup(){
        System.out.println("Tests are all done.");
    }

}
