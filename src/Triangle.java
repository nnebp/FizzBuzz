public class Triangle implements Shape {
    private double sideA, sideB, sideC, base, height;

    Triangle(double asideA, double asideB, double abase, double aheight) {
        if (asideA <= 0 || asideB <= 0 || abase <= 0 || aheight <= 0)
            throw new  IllegalArgumentException("dimensions must be greater than 0");
        sideA = asideA;
        sideB = asideB;
        base = abase;
        height = aheight;

    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
       return sideA + sideB + sideC;
    }
}
