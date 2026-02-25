/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/23/2026
 */

package week6.exam1review;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOQuestion {
    /**
     * JavaDoc for writeFirstFive
     * Writes the first five elements of the passed-in List to the file specified by the
     * filename. Each element should be written to a separate line. If there are fewer than
     * five elements in the passed-in List, throw an IllegalArgumentException.
     * @param filename String that contains the name to the file
     * @param nums List of Integers to write
     * @throws IOException if there is an error writing the file
     * @throws IllegalArgumentException if there are fewer than five elements in nums
     */
    private static void writeFirstFive(String filename, List<Integer> nums)
            throws IOException, IllegalArgumentException{
        if(nums.size()<5){
            throw new IllegalArgumentException("size must be greater than 5");
        }
        try(PrintWriter pw = new PrintWriter(filename)){
            for(int i = 0; i<5; i++){
                pw.println(nums.get(i));
            }
        }

    }

    public static void main(String[] args) {
        String filename = "output1.txt";
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(2,8,6,4,4,5,6,8,4));
        try{
            writeFirstFive(filename, nums1);
        } catch (IllegalArgumentException e){
            System.out.println("Error less than 5 numbers");
        } catch (IOException e){
            System.out.println("error writing");
        }

    }
}
