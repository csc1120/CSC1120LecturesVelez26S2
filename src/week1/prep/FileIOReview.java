/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIOReview {
    public static void main(String[] args) {
        String[] elements = {"3", "2", "5.3", "foo", "10"};
        String filename = "data/week1/example1.txt";
        writeValues(filename, elements);
        readValues(filename);
    }
    private static void readValues(String filename) {
        try(InputStream in = Files.newInputStream(Paths.get(filename));
            Scanner fileIn = new Scanner(in)){
            while (fileIn.hasNextLine()){
                System.out.println(fileIn.nextLine());
            }
        } catch (IOException e){
            System.out.println("Error opening and reading from file");
            System.out.println(e.getMessage());
        }
    }

    private static void writeValues(String filename, String[] elements) {
        try(OutputStream out = Files.newOutputStream(Paths.get(filename));
            PrintWriter printWriter = new PrintWriter(out)) {
            for(int i = 0; i< elements.length + 1; i++) {
                printWriter.println(elements[i]);
            }
            //No longer need since we are using try-with-resource
            //printWriter.close();
        } catch (IOException e){
            System.out.println("Error opening file "+ filename);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error with the array indices");
            System.out.println(e.getMessage());
        }
    }
}
