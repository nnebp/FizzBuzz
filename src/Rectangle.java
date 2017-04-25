public class Rectangle {
    private double length, width;

    Rectangle(double alength, double awidth) {
        if (alength <= 0 || awidth <= 0)
            throw new  IllegalArgumentException("dimensions must be greater than 0");
        length = alength;
        width = awidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }
}
