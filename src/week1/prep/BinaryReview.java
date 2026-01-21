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

public class BinaryReview {
    public static void main(String[] args) {
        double[] values = {2.4,8.9,1.0,2.3,100};
        String filename = "data/week1/binExp.bin";
        Path filePath = Paths.get(filename);

        try(OutputStream out = Files.newOutputStream(filePath);
            DataOutputStream dOut = new DataOutputStream(out)){
            for(double d:values){
                dOut.writeDouble(d);
            }
        } catch (IOException e){
            System.out.println("Error opening and writing file");
            System.out.println(e.getMessage());
        }

        try(InputStream in = Files.newInputStream(filePath);
            DataInputStream dIn = new DataInputStream(in)){
            for(int i = 0; i<values.length; i++){
                System.out.println(dIn.readDouble());
            }
        } catch (IOException e){
            System.out.println("Error opening and reading file");
            System.out.println(e.getMessage());
        }


    }
}
