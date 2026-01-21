/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();
        final int numshapes = 10;
        for(int i = 0; i<numshapes; i++){
            shapes.add(queryShape(scanner));
        }
        for(Shape s: shapes){
            System.out.println(s.area());
        }
    }
    private static Shape queryShape(Scanner scanner) {
        Shape shape = null;
        do {
            System.out.println("Enter the shape type, following be it's dimensions" +
                    "on a single line. Each value should be separated by a space.");
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            try {
                shape = createShape(values);
                System.out.println(shape.area());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not of enough values");
            } catch (NumberFormatException e) {
                System.out.println("Error formating number");
            } catch (IllegalArgumentException e) {
                System.out.println("Shape type is invalid");
            } catch (ShapeDimensionException e) {
                //catch here instead of makeShape
                System.out.println(e.getMessage());
            }
        } while (shape == null);
        return shape;
    }

    private static Shape createShape(String[] values){
        Shape shape;
        if (values[0].equalsIgnoreCase("circle")) {
            shape = new Circle(Double.parseDouble(values[0]));
        } else if (values[0].equalsIgnoreCase("square")) {
            shape = new Square(Double.parseDouble(values[0]));
        } else {
            throw new IllegalArgumentException("invalid shape type");
        }
        return shape;
    }
}
