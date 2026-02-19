/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXQuestion2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new VBox();
        TextField t1 = new TextField();
        Label l1 = new Label();
        t1.setOnAction((ActionEvent event)->{
            l1.setText(t1.getText().toUpperCase());
        });



        root.getChildren().addAll(t1, l1);
        Scene s1 = new Scene(root);
        stage.setScene(s1);
        stage.show();
    }
}

