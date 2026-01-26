/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/24/2026
 */

package week1.lecture;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BinaryFileIO {
    public static void main(String[] args) {
        double[] values ={1.2, 0.4, 3.14, 10, 0, -2};
        String filename = "data/week1/binExample.bin";
        Path filePath = Paths.get(filename);

        writeBinary(filePath, values);
        readBinary(filePath);

    }
    private static void readBinary(Path filePath) {
        try(InputStream in = Files.newInputStream(filePath);
            DataInputStream dIn = new DataInputStream(in)){
            for(int i = 0; i < 6; i++) {
                System.out.println(dIn.readDouble());
            }
        } catch (IOException e){
            System.out.println("Error opening and reading file");
            System.out.println(e.getMessage());
        }
    }
    private static void writeBinary(Path filePath, double[] values) {
        try(OutputStream out = Files.newOutputStream(filePath);
            DataOutputStream dOut = new DataOutputStream(out)){
            for(int i = 0; i< values.length; i++){
                dOut.writeDouble(values[i]);
            }
        } catch (IOException e){
            System.out.println("Error opening or writing to file");
            System.out.println(e.getMessage());
        }
    }
}
