/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/25/2026
 */

package week2.prep;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent> {
    private int numPressed = 0;
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Do something.");
        numPressed += 1;
        System.out.println(numPressed);
    }
}
