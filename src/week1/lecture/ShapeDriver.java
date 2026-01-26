/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/24/2026
 */

package week1.lecture;

import java.nio.file.Paths;
import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"rectangle 3 4"
        Shape shape;
        shape = queryShape(scanner);
    }

    private static Shape queryShape(Scanner scanner) {
        Shape shape = null;
        do {
            System.out.println("Enter the shape type and " +
                    "it's dimensions on a single line. " +
                    "\nEach value should be separated by a " +
                    "space.");
            String input = scanner.nextLine();
            String[] elements = input.split(" ");
            try {
                shape = makeShape(elements);
                System.out.println(shape.area());
            } catch (NumberFormatException e) {
                System.out.println("Error, inputed number is not a double");
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error indexing the array ");
                System.out.println(e.getMessage());
            } catch (BadShapeDimensionException e) {
                System.out.println("Error with shape dimension, stopping program");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (shape == null);
        return shape;
    }

    public static Shape makeShape(String[] elements){
        Shape shape;
        if (elements[0].equalsIgnoreCase("rectangle")) {
            double width = Double.parseDouble(elements[1]);
            double height = Double.parseDouble(elements[2]);
            shape = new Rectangle(width, height);
        } else if (elements[0].equalsIgnoreCase("circle")) {
            double radius = Double.parseDouble(elements[1]);
            shape = new Circle(radius);
        } else {
            throw new IllegalArgumentException("Invalid shape type " + elements[0]);
        }
        return shape;
    }
}
