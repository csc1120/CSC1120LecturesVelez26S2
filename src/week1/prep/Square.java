/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

public class Square extends Shape {
    public Square(double side) throws ShapeDimensionException {
        if(side <= 0){
            throw new ShapeDimensionException("Invalid side: "+side);
        }
        dimensions.add(side);
    }
    @Override
    public double area() {
        return dimensions.get(0) * dimensions.get(0);
    }
}
