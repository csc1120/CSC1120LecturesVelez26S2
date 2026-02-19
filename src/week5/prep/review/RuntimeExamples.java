/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/18/2026
 */

package week5.prep.review;

import java.util.List;

public class RuntimeExamples {

    public static String concat(String[] words){
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void repeat(int num){
        String[] words = {"foo", "bar", "taco", "cat"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<num; i++){
            sb.append(concat(words));
        }
    }
    public static void tri(int r, int c, int s){
        for(int i = 0; i<10; i++){
            for(int j = 0;j<1000;j++){
                for(int k = 0;k < 20; k++){
                    System.out.println(i + j + k);
                }
            }
        }
    }
    public void test(List<Integer> list){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + 2);
            int x = list.get(i) + 2;
            int y = x + 42;
            System.out.println(list.set(i, y));
        }
    }
    public void hello(int n) {
        System.out.println("hello");
        for (int i = 0; i < n; i++) {
            System.out.println("world");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("!!!");
            }
        }
    }

    public static void main(String[] args) {
    }



}
