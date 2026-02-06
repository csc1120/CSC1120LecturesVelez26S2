/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/5/2026
 */

package week3.prep;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz3 extends Application {
    private Label result;
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new VBox();
        result = new Label("0");
        Button up = new Button("Up");
        Button down = new Button("Down");
        root.getChildren().addAll(result, up, down);

        Scene s1 = new Scene(root, 200, 100);
        stage.setScene(s1);
        stage.show();
    }
}
