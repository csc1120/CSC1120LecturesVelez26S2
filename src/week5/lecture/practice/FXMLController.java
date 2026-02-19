/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
    @FXML
    private TextField inputText;

    @FXML
    private Label outputText;

    @FXML
    private void buttonAction(ActionEvent event){
        Button button = (Button)event.getSource();
        if(button.getText().equalsIgnoreCase("upper")){
            outputText.setText(inputText.getText().toUpperCase());
        }
    }
}
