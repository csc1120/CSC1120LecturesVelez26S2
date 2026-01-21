/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

public class Circle extends Shape {
    public Circle(double radius) throws ShapeDimensionException{
        if(radius <= 0){
            throw new ShapeDimensionException("Invalid radius "+radius);
        }
        dimensions.add(radius);
    }

    @Override
    public double area() {
        return Math.pow(dimensions.getFirst(),2) * Math.PI;
    }
}
