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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PasswordController {

    private String correctUser = "foobar";
    private String correctPass = "tacocat";

    @FXML
    private TextField passEntry;
    @FXML
    private TextField userEntry;
    @FXML
    private Label resultText;
    @FXML
    private void cancelAction(ActionEvent event){
        passEntry.clear();
        userEntry.setText("");
    }
    @FXML
    private void clickOk(){
        String username = userEntry.getText();
        String password = passEntry.getText();
        if(username.equalsIgnoreCase(correctUser) &&
                password.equalsIgnoreCase(correctPass)){
            resultText.setText("Access Granted");
        } else {
            resultText.setText("Access Denied!!!");
        }
    }

}
