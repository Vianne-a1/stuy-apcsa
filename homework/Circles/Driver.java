public class Driver {
    public static void main(String[] args) {
        // Test the Circle class
        Circle circle = new Circle(5.0);
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Details: " + circle.toString());

        // Test the Cylinder class
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Area: " + cylinder.getArea());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Cylinder Details: " + cylinder.toString());
    }
}
