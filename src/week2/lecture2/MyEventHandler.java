/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/30/2026
 */

package week2.lecture2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent> {
    private int numPresses = 0;
    @Override
    public void handle(ActionEvent event){
        System.out.println("Custom EventHandler class");
        numPresses++;
        System.out.println(numPresses);
    }
}
