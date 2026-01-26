/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.lecture;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        String[] values ={"1", "2.3", "foo", "4", "5"};
        String filename = "data/week1/example1.txt";
        Path filePath = Paths.get(filename);
        writeValues(filePath, values);
        readValues(filePath);
    }

    private static void readValues(Path filePath) {
        try(InputStream in = Files.newInputStream(filePath);
            Scanner fileIn = new Scanner(in)){
            while(fileIn.hasNextLine()){
                System.out.println(fileIn.nextLine());
            }
        } catch (IOException e){
            System.out.println("Errror opening and writing to file "
                    + filePath.toString());
        }
    }

    private static void writeValues(Path filePath, String[] values) {
        try (OutputStream out = Files.newOutputStream(filePath);
             PrintWriter printWriter = new PrintWriter(out)) {
            for(int i = 0; i< values.length + 1; i++){
                printWriter.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error with array indices");
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Error opening and reading file");
        }
    }
}
