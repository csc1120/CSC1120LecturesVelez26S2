/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.lecture;

import java.util.Scanner;

public class MyArrayListDriver {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //runtime for size?
        System.out.println("Initial size is "+list.size());

        list.add(42);
        list.add(9);
        System.out.println("Size after "+list.size());
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        list.add(-1);
        list.add(0);
        System.out.println("Size after "+list.size());
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        for(int i = 0; i< 100; i++){
            list.add(0);
        }
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
