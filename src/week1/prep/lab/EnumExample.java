/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep.lab;

public class EnumExample {
    public static void main(String[] args) {
        for(Temperature t: Temperature.values()){
            System.out.println(t.name() + " " + t);
        }
        Temperature t1 = Temperature.valueOf("HOT");
        System.out.println(t1);
        Temperature t2 = Temperature.valueOf("MED");
        System.out.println(t2);
        Temperature t3 = Temperature.valueOf("COLD");
        System.out.println(t3);
    }
}
