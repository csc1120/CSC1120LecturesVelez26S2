/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 4/24/2026
 */
package week13;

public class Circle {
    public Center center;
    public int radius;

    public Circle(Center center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle(Circle c){
        center = new Center(c.center.x, c.center.y);
        radius = c.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    protected Object clone() {
        Circle clone = null;
        try{
            clone = (Circle) super.clone();
            //clone.center = new Center(center.x, center.y);
            //clone.radius = radius;
        } catch (CloneNotSupportedException e){
            System.out.println("Warning clone not implemented");
        }
        return clone;
    }
}
