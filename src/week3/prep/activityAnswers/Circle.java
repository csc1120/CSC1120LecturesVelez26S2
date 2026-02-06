/*
 * Course: CS 1021
 * Winter 2021
 * Demo
 * Name: Roby Velez
 * Created: 2/4/2022
 */
package week3.prep.activityAnswers;

/**
 * Simple circle class with a radius
 */
public class Circle {
    private final int radius;
    /**
     * Constructor for a circle
     * @param radius radius of the circle
     */
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
