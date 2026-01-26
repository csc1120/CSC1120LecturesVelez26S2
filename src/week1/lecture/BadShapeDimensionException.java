/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/24/2026
 */

package week1.lecture;

public class BadShapeDimensionException extends RuntimeException {
    public BadShapeDimensionException(String msg){
        super("Error with shape dimension "+msg);
    }
}
