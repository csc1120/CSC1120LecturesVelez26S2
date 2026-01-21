/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {
        String filename = "data/week1/filesExp.txt";
        try {
            Files.writeString(Paths.get(filename), "Hello world\nHow are you doing?\ncool");
        } catch (IOException e){
            System.out.println("Error writing to file");
        }

        try{
            List<String> lines = Files.readAllLines(Paths.get(filename));
            System.out.println(lines);
        } catch (IOException e){
            System.out.println("Error reading the file");
        }
    }
}
