/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/1/2026
 */

package week3.prep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Example1 {

    @FXML
    private Label score;

    @FXML
    private void initialize(){
        System.out.println("Controller started!!!");
    }

    @FXML
    public void increaseScore(ActionEvent event) {
        int newScore = Integer.parseInt(score.getText()) + 1;
        score.setText(String.valueOf(newScore));
    }
}
