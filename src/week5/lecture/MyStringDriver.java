/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.lecture;

public class MyStringDriver {
    public static void main(String[] args) {
        MyStringList list1 = new MyStringList();
        System.out.println("Initial size is "+list1.size());
        list1.add("foo");
        list1.add("bar");
        System.out.println("Size after is "+list1.size());

        for(int i = 0; i< list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        //list1.get(-1);
    }
}
