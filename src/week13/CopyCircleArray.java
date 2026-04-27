/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/24/2026
 */
package week13;

import java.util.Arrays;

public class CopyCircleArray {
    static void main() {
        Circle[] orig = {
                new Circle(new Center(4,5), 6),
                new Oval(new Center(7,8), 9, 10),
        };
        Circle[] copy = new Circle[orig.length];
        for(int i = 0; i<orig.length; i++){
            copy[i] = (Circle) orig[i].clone();
//            if(orig[i] instanceof Oval){
//                copy[i] = new Oval((Oval) orig[i]);
//            } else {
//                copy[i] = new Circle(orig[i]);
//            }
        }

        System.out.println("Before");
        System.out.println("Orig "+ Arrays.toString(orig));
        System.out.println("Copy "+ Arrays.toString(copy));

        copy[0] = new Circle(new Center(1,2),3);
        copy[1].radius = 42;
        copy[1].center.x = 67;
        System.out.println("After");
        System.out.println("Orig "+ Arrays.toString(orig));
        System.out.println("Copy "+ Arrays.toString(copy));


    }
}
