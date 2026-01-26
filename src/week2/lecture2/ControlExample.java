/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.lecture2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlExample extends Application {

    public void start(Stage stage){
        Pane root = new VBox();
        Label label1 = new Label("On");
        Button b1 = new Button("Press Me");

        root.getChildren().addAll(label1, b1);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

    }


}
