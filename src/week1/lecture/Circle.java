/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/24/2026
 */

package week1.lecture;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) throws BadShapeDimensionException {
        if(radius <= 0){
            throw new BadShapeDimensionException("Invalid dimension "+radius);
        }
        this.radius = radius;
    }

    public double area(){
        return radius * radius * Math.PI;
    }
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
