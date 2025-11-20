public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }
}
