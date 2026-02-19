/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.lecture.review;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller {
    @FXML
    private TextField dataEntry;
    @FXML
    private TextField filenameEntry;

    @FXML
    private void saveAction(){
        String data = dataEntry.getText();
        String[] tokens = data.split("\\s+");
        String filename = filenameEntry.getText();
        try(OutputStream out = Files.newOutputStream(Path.of(filename));
            PrintWriter pw = new PrintWriter(out)){
            for(int i = 0; i<tokens.length; i++) {
                try {
                    int val = Integer.parseInt(tokens[i]);
                    pw.print(val + " ");
                } catch (NumberFormatException e) {
                    System.out.println("Token can't be save "+tokens[i]);
                }
            }
        } catch (IOException e){
            System.out.println("error writing to file");
        }
    }
    @FXML
    private void loadAction(){
        System.out.println("load");
    }

}
