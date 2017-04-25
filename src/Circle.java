public class Circle {

    private double radius;

    Circle(double aradius) {
        if (aradius <= 0)
            throw new  IllegalArgumentException("radius must be greater than 0");
        radius = aradius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
