/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/24/2026
 */
package week13;

import java.util.Arrays;

public class CopyStringArray {
    static void main() {
        String[] orig = {"one", "two", "three"};
        String[] copy1 = orig;

        System.out.println("Before ");
        System.out.println("orig "+ Arrays.toString(orig));
        System.out.println("copy1 "+Arrays.toString(copy1));

        copy1[0] = "1";
        System.out.println("After ");
        System.out.println("orig "+ Arrays.toString(orig));
        System.out.println("copy1 "+Arrays.toString(copy1));

        String[] copy2 = new String[orig.length];
        for(int i = 0; i<orig.length; i++){
            copy2[i] = orig[i];
        }

        copy2[2] = "3";
        System.out.println("After ");
        System.out.println("orig "+ Arrays.toString(orig));
        System.out.println("copy1 "+Arrays.toString(copy1));
        System.out.println("copy2 "+Arrays.toString(copy2));


    }
}
