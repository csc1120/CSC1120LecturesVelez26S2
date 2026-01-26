/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep.lab;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UnicodeDemo {
    public static void printCode(char[] codes){
        for(int i = 0; i<codes.length; i++){
            System.out.print(i+". ");
            System.out.println(codes[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        //Basic ascii characters
        char[] codes1 = {'a', '1', ' ', '@', '\n', '+'};
        printCode(codes1);

        //Ascii characters via their Unicode
        char[] codes2 = {'\u0061', '\u0031','\u002b'};
        printCode(codes2);

        //Special symbols like copyright and smiley
        char[] codes3 = {'\u00a9', '\u00ae', '\u263a'};
        printCode(codes3);

        //Block element unicode
        char fullBlock = '\u25a0';
        char leftOneEight = '\u258F';
        char backDiag = '\u259A';
        char forwardDiag = '\u259E';
        char[] codes4 = {fullBlock, leftOneEight, forwardDiag, backDiag};
        printCode(codes4);
//
        //Printing chars together
        System.out.println(backDiag + forwardDiag + '\n'
                + forwardDiag + backDiag);
        System.out.println(String.valueOf(backDiag)
                + forwardDiag + '\n' + forwardDiag + backDiag);
        System.out.println();
//        System.out.println('a' + '#' + '\n' + 'A' + '!');
//        System.out.println(String.valueOf('a') + '#'
//                + '\n' + 'A' + '!');
//
        //Writing chars to a file
        String unicodeFile = "data/week1/unicodeExp.txt";

        Path filePath = Paths.get(unicodeFile);
        OutputStream out = Files.newOutputStream(filePath);
        PrintWriter printWriter = new PrintWriter(out);

        printWriter.println(String.valueOf(backDiag)
                + forwardDiag + '\n' + forwardDiag + backDiag);
        printWriter.println(String.valueOf('\u0041') + 'a'
                + '\n' + 'A' + '!');
        printWriter.close();
//
//        //Reading chars from file

        InputStream in = Files.newInputStream(filePath);
        Scanner fileIn = new Scanner(in);
        String line1 = fileIn.nextLine();
        String line2 = fileIn.nextLine();

        //Showing the contents and size of the lines read
        System.out.println(line1.length());
        System.out.println(line1.charAt(0));
        System.out.println(line1.charAt(1));
        System.out.println(line2.length());
        System.out.println(line2.charAt(0));
        System.out.println(line2.charAt(1));
    }
}
