/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/24/2026
 */

package week1.lecture;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height)
            throws BadShapeDimensionException {
        if(width <= 0 || height <= 0){
            throw new BadShapeDimensionException(""+width +", "+height);
        }
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
    public void draw(){
        System.out.println("drawing a rectangle");
    }
}
