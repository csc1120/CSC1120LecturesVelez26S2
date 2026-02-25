/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/23/2026
 */

package week6.exam1review;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label scoreLabel;
    private int score = 0;
    @FXML
    private void increaseScore(ActionEvent event){
        if(((Button)event.getSource()).getText().
                equalsIgnoreCase("Increment")){
            int val = Integer.parseInt(scoreLabel.getText());
            val++;
            scoreLabel.setText(String.valueOf(val));
            score++;
            scoreLabel.setText(String.valueOf(score));
        }
    }
}
