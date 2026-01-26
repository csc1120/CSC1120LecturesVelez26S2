package week2.prep;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Window");
        primaryStage.setX(0);
        primaryStage.setY(0);

        Pane root;
        root = new HBox();
        VBox innerPane = new VBox();

        Label l1 = new Label("Hello World");
        Label l2 = new Label("How are you?");
        innerPane.getChildren().addAll(new Label("foo"),
                new Label("bar"), new Label("taco"));

        root.getChildren().addAll(l1, innerPane, l2);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
