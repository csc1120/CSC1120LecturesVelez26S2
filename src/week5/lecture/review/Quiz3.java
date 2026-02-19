/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.lecture.review;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Arrays;
import java.util.List;

public class Quiz3 {
    Label label = new Label();

    public void changeLabel(ActionEvent event){
        int value = Integer.parseInt(label.getText());
        Button b = (Button) event.getSource();
        if(b.getText().equalsIgnoreCase("Up")){
            value++;
        } else {
            value--;
        }
        label.setText(String.valueOf(value));

    }


    public static void main(String[] args) {
        System.out.println(5 + 4 + " ");

        List<String> words = Arrays.asList("bear","dog","lion","tiger");

        words.stream().
                map(a -> a.toUpperCase()).
                map(a -> a.charAt(0)).
                forEach(a -> System.out.println(a + ":"));

    }
}
