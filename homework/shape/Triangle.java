public class Triangle extends Shape {
    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }
}
