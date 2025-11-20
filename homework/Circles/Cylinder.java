public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        // Override to calculate the surface area of the cylinder
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        // Override to include information about the height
        return "Cylinder with radius: " + radius + " and height: " + height;
    }
}
