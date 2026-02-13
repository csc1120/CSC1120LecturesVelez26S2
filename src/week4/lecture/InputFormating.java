/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week4.lecture;

import java.util.Scanner;
import java.util.function.Consumer;

public class InputFormating {

    private static void printMsg(String msg, String rule){
        if(rule.equalsIgnoreCase("caps")){
            System.out.println(msg.toUpperCase());
        } else if(rule.equalsIgnoreCase("star")) {
            System.out.println("*" + msg + "*");
        }
    }
    private static void printMsg2(String msg, Consumer<String> rule){
        rule.accept(msg);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Hello World";
        System.out.println("How do you want to format the output?");
        System.out.println("1.All caps\n2.Surround with *\n3.First char");
        String option = scanner.nextLine();
        if(option.equalsIgnoreCase("1")){
            //printMsg(msg, "caps");
            printMsg2(msg, a -> System.out.println(a.toUpperCase()));
        } else if (option.equalsIgnoreCase("2")) {
            //printMsg(msg, "star");
            printMsg2(msg, a -> System.out.println("*"+a+"*"));
        } else if (option.equalsIgnoreCase("3")) {
            printMsg2(msg, a -> System.out.println(a.charAt(0)));
        }

    }
}
