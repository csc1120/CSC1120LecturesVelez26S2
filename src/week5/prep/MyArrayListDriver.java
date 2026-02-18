/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.prep;

public class MyArrayListDriver {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(0, 42);
        list.add(0, 7);
        list.add(0, 1000);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
        list.add(list.size(), -1);
        list.add(list.size()/2, 67);
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
