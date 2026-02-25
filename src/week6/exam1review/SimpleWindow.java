/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/23/2026
 */

package week6.exam1review;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Button b1 = new Button("Set Output");
        b1.setOnAction(this::setOutput);
        root.getChildren().addAll(output, textEntry, b1);
        stage.setScene(new Scene(root));
        stage.show();
    }
    private void setOutput(ActionEvent event){
        output.setText(textEntry.getText());
    }
}
