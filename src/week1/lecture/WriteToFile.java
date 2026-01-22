/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.lecture;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String[] values ={"1", "2.3", "foo", "4", "5"};

        String filename = "example1.txt";
        Path filePath = Paths.get(filename);

        OutputStream out = Files.newOutputStream(filePath);

    }
}
