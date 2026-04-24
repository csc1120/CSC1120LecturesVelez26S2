/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/24/2026
 */
package week13.prep;

public class Oval extends Circle{
    public int radius2;
    public Oval(Center center, int radius, int radius2) {
        super(center, radius);
        this.radius2 = radius2;
    }

    public Oval(Oval o){
        super(o);
        radius2 = o.radius2;
    }
    @Override
    public String toString() {
        return "Oval{" +
                "radius2=" + radius2 +
                ", center=" + center +
                ", radius=" + radius +
                '}';
    }
}
