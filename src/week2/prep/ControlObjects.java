/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/25/2026
 */

package week2.prep;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlObjects extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private Label label1;
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new VBox();

        TextField entry = new TextField("Enter some text");
        label1 = new Label("On");
        Button b1 = new Button("Press Me");

        EventHandler<ActionEvent> h1 = this::respond3;
        b1.setOnAction(h1);
        entry.setOnAction(this::respond3);

        root.getChildren().addAll(label1, b1, entry);
        Scene scene = new Scene(root, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
    private void respond3(ActionEvent event){
        if(event.getSource() instanceof Button) {
            if (label1.getText().equalsIgnoreCase("on")) {
                label1.setText("Off");
            } else if (label1.getText().equalsIgnoreCase("off")) {
                label1.setText("On");
            } else {
                System.out.println("Error with Label text, setting to off");
                label1.setText("Off");
            }
        } else if(event.getSource() instanceof TextField){
            TextField text = (TextField) event.getSource();
            System.out.println(text.getText());
        }
    }
    private void respond2(Event event){
        TextField text = (TextField) event.getSource();
        System.out.println(text.getText());
    }
    private void respond(ActionEvent event){
        if(event.getSource() instanceof Button) {
            if (label1.getText().equalsIgnoreCase("on")) {
                label1.setText("Off");
            } else if (label1.getText().equalsIgnoreCase("off")) {
                label1.setText("On");
            } else {
                System.out.println("Error with Label text, setting to off");
                label1.setText("Off");
            }
        } else if(event.getSource() instanceof TextField){
            TextField text = (TextField) event.getSource();
            System.out.println(text.getText());
        }
    }
}
