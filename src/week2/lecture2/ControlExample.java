/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.lecture2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.beans.EventHandler;

public class ControlExample extends Application {
    private Label label1;

    public void start(Stage stage){
        Pane root = new VBox();
        label1 = new Label("On");

        Label prompt = new Label("Enter some text");

        TextField text1 = new TextField();
        text1.setOnAction(this::buttonTextInteract);

        Button b1 = new Button("Press Me");
        EventHandler<ActionEvent> h1;
        h1 = this::buttonTextInteract;
        b1.setOnAction(h1);

        root.getChildren().addAll(label1, b1, prompt, text1);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
    public void buttonTextInteract(ActionEvent event){
        if(event.getSource() instanceof Button){
            Button b1 = (Button) event.getSource();
            b1.setText("foobar");
        } else if (event.getSource() instanceof TextField){
            TextField t1 = (TextField) event.getSource();
            label1.setText(t1.getText());
        }
        //System.out.println("Button was pressed or textfield was entered");
    }
    public void textEntry(ActionEvent event){
        TextField t1 = (TextField)event.getSource();
        System.out.println("Text is entered!!!");
        System.out.println(t1.getText());
    }
    public void buttonPress(ActionEvent event){
        System.out.println("Button pressed!!!");
        if(label1.getText().equalsIgnoreCase("on")){
            label1.setText("Off");
        } else if(label1.getText().equalsIgnoreCase("off")){
            label1.setText("On");
        }
    }

}
