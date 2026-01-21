/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

public class ShapeDimensionException extends RuntimeException {
    public ShapeDimensionException(String msg){
        super("Shape dimension error: "+msg);
    }
}
