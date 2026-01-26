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
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class OtherEventHandlers extends Application {
    private class MyEventHandlerInner
            implements EventHandler<ActionEvent> {
        private int numPressed = 0;
        public void handle(ActionEvent event){
            numPressed += 1;
            System.out.println("Inner class");
            label.setText("Times pressed "+numPressed);
        }
    }
    private Label label;
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new VBox();

//        Button b1 = new Button("Button 1");
//        b1.setOnAction(this::respond);
//
//        Button b2 = new Button("Button 2");
//        b2.setOnAction((ActionEvent event) -> {
//            System.out.println("Lambda expression!!!");
//        });
//
//        Button b3 = new Button("Button 3");
//        EventHandler<ActionEvent> h1 = new MyEventHandler();
//        b3.setOnAction(h1);

        label = new Label();
        Button b4 = new Button("Button 4");
        EventHandler<ActionEvent> h2 = new EventHandler<ActionEvent>() {
            private int numPressed = 0;
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Anonymous Class");
                numPressed += 1;
                label.setText("Times pressed " + numPressed);
            }
        };
        b4.setOnAction(h2);

        Button b5 = new Button("Button 5");
        b5.setOnAction(new MyEventHandlerInner());

        root.getChildren().addAll(new Label("Press the buttons!!!"),
                b4, b5, label);
        Scene scene = new Scene(root, 400,200);
        stage.setScene(scene);
        stage.show();
    }
    private void respond(ActionEvent event){
        System.out.println("Method reference!!!");
    }
}
