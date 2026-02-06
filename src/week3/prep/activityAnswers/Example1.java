/*
 * Course: CS 1021
 * Winter 2021
 * Demo
 * Name: Roby Velez
 * Created: 2/4/2022
 */
package week3.prep.activityAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,2,5,2,8,9,5,4,3,2,1,5,7,4,5,3);

        //For each of these operations, if the result is a stream
        //do a forEach() print to verify your result

        //Filter all the odd numbers
        //Count the odd numbers
        //Create a List of all the odd numbers
        System.out.print("Odd numbers: ");
        numbers.stream().filter(a -> a%2 == 1).forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println("Number of odd values "+numbers.stream().filter(a -> a%2 == 1).count());
        System.out.println("List of odd values "+numbers.stream().filter(a -> a%2 == 1).collect(Collectors.toList()));

        System.out.println();
        //Sort the even numbers
        //Create a List of the four smallest even numbers
        //Create a List minus the four smallest even numbers
        System.out.println("Even numbers: ");
        numbers.stream().filter(a -> a%2 == 0).forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.println("4 smallest "+numbers.stream().filter(a -> a%2 == 0).limit(4).collect(Collectors.toList()));
        long numEven = numbers.stream().filter(a -> a%2 == 0).count();
        System.out.println("4 largest "+numbers.stream().filter(a -> a%2 == 0).skip(numEven-4).collect(Collectors.toList()));
        System.out.println();

        //Find the max and min number that is divisible by 3
        //Find the product of all the numbers divisible by 3
        //Sum up all the numbers divisible by 3
        System.out.print("Divisible by 3 numbers: ");
        numbers.stream().filter(a -> a%3 == 0).forEach(a -> System.out.print(a+" "));
        System.out.println();
        int max3 = numbers.stream().filter(a -> a%3 == 0).max((x,y) -> Integer.compare(x,y)).get();
        System.out.println("Max divisible by 3 is " + max3);
        int prod3 = numbers.stream().filter(a -> a%3 == 0).reduce((a,b) -> a*b).get();
        System.out.println("Prod of divisiblel by 3 is "+prod3);
        int sum3 = numbers.stream().filter(a -> a%3 == 0).reduce((a,b) -> a+b).get();
        System.out.println("Sum of divisible by 3 is "+sum3);

        System.out.println();
        System.out.println("Circles printed: ");
        numbers.stream().limit(4).map(a -> new Circle(a)).forEach(a-> System.out.println(a+" "));
        System.out.println();
        //Create a stream of Circles using the first four numbers (Hint use map())
        //Create a private static method that takes in two Circles as arguments and
        //--returns 0 if they have the same radius
        //--returns a positive value if the first's radius is greater than the second's radius
        //--returns a negative value if the first's radius is less than the second's radius
        System.out.println("Sorted circles:");
        numbers.stream().limit(4).map(a -> new Circle(a)).sorted((a,b) -> compareCircles(a,b)).forEach(a-> System.out.println(a+" "));
        System.out.println();
        //Using this compare, sort your stream of Circles
        //Create a new List of the areas of your sorted Circles (Hint use map())
        List<Double> areas = numbers.stream().
                                            limit(4).
                                            map(a -> new Circle(a)).
                                            sorted((a,b) -> compareCircles(a,b)).
                                            map(a -> Math.PI*Math.pow(a.getRadius(),2)).
                                            collect(Collectors.toList());
        System.out.println("Areas " +areas);
    }
    private static int compareCircles(Circle c1, Circle c2){
        return c1.getRadius()-c2.getRadius();
    }
}
