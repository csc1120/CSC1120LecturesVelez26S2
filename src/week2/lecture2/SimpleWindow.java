package week2.lecture2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
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
        primaryStage.setTitle("Simple window");
        Pane root;
        root = new HBox();
        VBox vertPane = new VBox();
        vertPane.getChildren().addAll(new Label("foo"),
                new Label("bar"), new Label("taco"));
        Label label1 = new Label("Hello world");
        Label label2 = new Label("How are you");

        root.getChildren().addAll(label1, vertPane,
                label2);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
