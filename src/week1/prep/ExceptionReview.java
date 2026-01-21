/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean isDone = false;
        do {
            System.out.println("Enter an int between 0 and 10 or -1 to quit");
            try {
                input = scanner.nextInt();
                if(input != -1 && input < 0 || input > 10){
                    throw new IllegalArgumentException("Input must be between 0 and 10: "+input);
                }
                if (input != -1) {
                    System.out.println(input);
                } else {
                    System.out.println("quitting");
                    isDone = true;
                }
            } catch (InputMismatchException e){
                System.out.println("Error, must enter an int");
                //clear the buffer
                scanner.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (!isDone);
    }
}
