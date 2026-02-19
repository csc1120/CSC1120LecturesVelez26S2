/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.prep.review;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleWindow extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private Label output;
    private TextField textEntry;
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new VBox();
        output = new Label();
        textEntry = new TextField();







        stage.setScene(new Scene(root));
        stage.show();
    }
}
