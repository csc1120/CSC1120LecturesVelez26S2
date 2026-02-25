/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/23/2026
 */

package week6.exam1review;

public class FunctionalInterface {
//    1.(3 points) Below main(), define a functional interface called
//    Check whose single abstract method is called week6.test(). week6.test() takes
//    two ints as arguments and returns a boolean.
//    2.(3 points) Below main(), create a method called process() that
//    takes in two ints and a Check object as arguments. The method should
//    call the week6.test() method of the Check object using the two ints and return the result.
//    3.(3 points) In the main() method below, call the process() method
//    and pass in two ints and a lambda expression that returns true if the
//    first int is greater than the second, and false otherwise.

    public interface Check{
        boolean test(int x, int y);
    }
    public static boolean process(int x, int y, Check check){
        return check.test(x,y);
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        boolean result = process(x,y,(a,b) -> a>b);

        boolean result2 = process(x,y,(a,b) -> {
            if(a > b){
                return true;
            } else {
                return false;
            }
        });
    }
}
