/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/28/2026
 */

package week2.lecture2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OtherEventHandler extends Application {
    private Label label1;

    private class MyInnerEventHandler implements EventHandler<ActionEvent> {
        private int numPresses = 0;
        @Override
        public void handle(ActionEvent event){
            System.out.println("Inner class");
            numPresses++;
            System.out.println(numPresses);
            label1.setText(String.valueOf(numPresses));
        }
    }
    public void start(Stage stage){
        Pane root = new VBox();
//        Button b1 = new Button("Button 1");
//        EventHandler<ActionEvent> h1;
//        h1 = this::respond1;
//        b1.setOnAction(h1);
//
//        Button b2 = new Button("Button 2");
//        EventHandler<ActionEvent> h2;
//        h2 = (ActionEvent event) -> {
//            System.out.println("Lambda expression.");
//        };
//        b2.setOnAction(h2);
//
//        Button b3 = new Button("Button 3");
//        EventHandler<ActionEvent> h3;
//        h3 = new MyEventHandler();
//        b3.setOnAction(h3);
        Button b4 = new Button("Button 4");
        EventHandler<ActionEvent> h4;
        h4 = new EventHandler<ActionEvent>() {
            private int numPresses = 0;
            @Override
            public void handle(ActionEvent event){
                System.out.println("Anonymous Class");
                numPresses++;
                System.out.println(numPresses);
            }
        };
        b4.setOnAction(h4);
        Button b5 = new Button("Button 5");
        b5.setOnAction(new MyInnerEventHandler());

        //root.getChildren().addAll(b1, b2, b3, b4);
        root.getChildren().addAll(b4, b5);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
    private void respond1(ActionEvent event){
        System.out.println("Method reference");
    }
}
