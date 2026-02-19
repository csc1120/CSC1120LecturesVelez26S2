/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.prep.review;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Controller for the review example of loading
 * and saving integer values
 */
public class Controller {
    @FXML
    private TextField dataEntry;
    @FXML
    private TextField filenameEntry;
    private void saveHelper(String filename, String data) throws IOException {
        String[] tokens = data.split("\\s+");
        try(OutputStream out = Files.newOutputStream(Paths.get(filename));
                PrintWriter printWriter = new PrintWriter(out)){
            for(int i = 0; i<tokens.length; i++){
                try {
                    int v = Integer.parseInt(tokens[i]);
                    printWriter.print(v + " ");
                } catch (NumberFormatException e){
                    System.out.println("Not saving "+tokens[i]);
                }
            }
        }
    }
    @FXML
    private void saveAction(ActionEvent event) {
        String data = dataEntry.getText();
        String filename = filenameEntry.getText();
        try {
            saveHelper(filename, data);
        } catch (IOException e){
            System.out.println("Error saving file");
        }
    }
    private String loadHelper(String filename) throws IOException{
        StringBuilder sb = new StringBuilder();
        try(InputStream in = Files.newInputStream(Paths.get(filename));
            Scanner sc = new Scanner(in)) {
            while (sc.hasNext()) {
                String input = sc.next();
                try {
                    int v = Integer.parseInt(input);
                    sb.append(v).append(" ");
                } catch (NumberFormatException e) {
                    System.out.println("Ignore saved value " + input);
                }
                dataEntry.setText(sb.toString());
            }
        }
        return sb.toString();
    }
    @FXML
    private void loadAction(ActionEvent event) {
        String filename = filenameEntry.getText();
        try{
            String data = loadHelper(filename);
            dataEntry.setText(data);
        } catch (IOException e){
            System.out.println("Error loading and reading the file: "+filename);
        }
    }
}
