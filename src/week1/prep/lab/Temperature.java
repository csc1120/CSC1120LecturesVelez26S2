/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/21/2026
 */

package week1.prep.lab;

public enum Temperature {
    HOT(100),
    MED(72),
    COLD(60);
    private final int temp;
    private Temperature(int temp){
        this.temp = temp;
    }
    @Override
    public String toString() {
        return String.valueOf(temp);
    }
}
