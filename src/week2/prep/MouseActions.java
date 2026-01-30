/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/28/2026
 */

package week2.prep;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MouseActions extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ImageView imageView = new ImageView();

        Path filePath = Paths.get("data/week2/robot.jpg");
        InputStream in = Files.newInputStream(filePath);
        Image image = new Image(in);

        imageView.setImage(image);

        Group root = new Group();
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
