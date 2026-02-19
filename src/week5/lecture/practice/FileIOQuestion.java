/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.practice;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIOQuestion {

/**
 * readFirstFiveLines()
 * @param filename String with the path of the file to open
 * @return List of Integers on the first five lines of the file
 * @throws IOException if there is an error reading the file
 * @throws IllegalArgumentException if there are fewer than five lines to read
 */

public static List<Integer> readFirstFiveLines(String filename)
        throws IllegalArgumentException, IOException {
    List<Integer> ret = new ArrayList<>();
    Path filePath = Paths.get(filename);
    InputStream in = Files.newInputStream(filePath);
    Scanner line = new Scanner(in);
    while (line.hasNextLine() && ret.size() < 5){
        ret.add(Integer.parseInt(line.nextLine()));
    }
    line.close();
    if(ret.size() < 5){
        throw new IllegalArgumentException("Number of lines less than 5");
    } else {
        return ret;
    }

}
    public static void main(String[] args) {
        String filename = "foo.txt";
        try {
            List<Integer> result = readFirstFiveLines(filename);
            System.out.println(result);
        } catch(IOException e){
            System.out.println("io exception");
        } catch (IllegalArgumentException e){
            System.out.println("illegal args");
        }
    }
}
