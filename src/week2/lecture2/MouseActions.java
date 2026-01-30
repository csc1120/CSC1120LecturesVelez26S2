/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/30/2026
 */

package week2.lecture2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MouseActions extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //Display an image?
        ImageView imageView = new ImageView();

        String filename = "data/week2/robot.jpg";
        Path imagePath = Paths.get(filename);
        InputStream in = Files.newInputStream(imagePath);
        Image image = new Image(in);
        imageView.setImage(image);

        Rectangle r1 = new Rectangle(200, 200, 40, 40);
        r1.setFill(Color.RED);
        r1.setOnMouseClicked(this::mouseClick);

        Group root = new Group();
        root.getChildren().addAll(imageView, r1);

        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();

    }
    public void mouseClick(MouseEvent event){
        System.out.println("Click square");
        System.out.println(event.getX() +", "+ event.getY());
    }
}
