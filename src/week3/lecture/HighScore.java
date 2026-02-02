/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/2/2026
 */

package week3.lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HighScore {

    @FXML
    private Label score;

    @FXML
    private void initialize(){
        System.out.println("controller started!!!");
    }

    @FXML
    private void increaseScore(ActionEvent event){
        String text = score.getText();
        int s = Integer.parseInt(text);
        s++;
        score.setText(String.valueOf(s));
    }

}
