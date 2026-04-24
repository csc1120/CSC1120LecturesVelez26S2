/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/24/2026
 */
package week13.prep;

import java.util.Arrays;

public class CopyCircleArray {
    static void main() {
        Circle[] orig = {
                new Circle(new Center(3,4), 5),
                new Oval(new Center(6,7), 8, 9)
        };
        Circle[] copy = new Circle[orig.length];
        for (int i = 0; i < orig.length; i++) {
            //orig[i].clone();
            if(orig[i] instanceof Oval) {
                copy[i] = new Oval((Oval)orig[i]);
            } else {
                copy[i] = new Circle(orig[i]);
            }
        }
        System.out.println("Before");
        System.out.println("Original: "+ Arrays.toString(orig));
        System.out.println("Copy: "+ Arrays.toString(copy));

        copy[0] = new Circle(new Center(1,2),3);
        copy[1].radius = 42;

        System.out.println("After");
        System.out.println("Original: "+ Arrays.toString(orig));
        System.out.println("Copy: "+ Arrays.toString(copy));

    }
}
