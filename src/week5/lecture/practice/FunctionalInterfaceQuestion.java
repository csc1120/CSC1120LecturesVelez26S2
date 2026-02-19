/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.practice;

public class FunctionalInterfaceQuestion {

    @FunctionalInterface
    public interface Operation{
        int apply(int x, int y);
    }
    public static int process(int x, int y, Operation operation){
        return operation.apply(x, y);
    }
    public static void main(String[] args) {
        int result = process(1, 2, (x, y) -> x + y);
    }
}
