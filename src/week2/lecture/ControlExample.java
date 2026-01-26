/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.lecture;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.beans.EventHandler;

public class ControlExample extends Application {
    private Label label1;
    public void start(Stage stage){

        Pane root = new VBox();
        label1 = new Label("On");
        Button b1 = new Button("Press me");

        //EventHandler<ActionEvent> h1;

        b1.setOnAction(this::buttonPress);
        root.getChildren().addAll(label1, b1);

        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.show();

    }
    public void buttonPress(ActionEvent event){
        System.out.println("Pressed!!!");
        if(label1.getText().equals("On")){
            label1.setText("Off");
        }
    }
}
