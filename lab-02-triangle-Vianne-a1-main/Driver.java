public class Driver {
    public static void main(String[] args) {
        Point p1 = new Point(8.0, 8.0);
        Point p2 = new Point(2.0, 10.0);
        Point p3 = new Point(0.0, 0.0);

        // Print coordinates using your toString method from Point class
        System.out.println("Point 1: " + p1.toString());
        System.out.println("Point 2: " + p2.toString());
        System.out.println("Point 3: " + p3.toString());

        // Calculate distances and print results
        double distanceP1P2 = Point.distance(p1, p2);
        double distanceP2P3 = Point.distance(p2, p3);
        double distanceP3P1 = Point.distance(p3, p1);
        System.out.println("Distance between Point 1 and Point 2: " + distanceP1P2);
        System.out.println("Distance between Point 2 and Point 3: " + distanceP2P3);
        System.out.println("Distance between Point 3 and Point 1: " + distanceP3P1);

        // Create Triangle objects and test the methods
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(new Point(0.0, 0.0), new Point(4.0, 0.0), new Point(0.0, 3.0));

        System.out.println("Are the triangles equal? " + t1.equals(t2));
        System.out.println("Triangle 1 is " + t1.getTriangleType());
        System.out.println("Triangle 2 is " + t2.getTriangleType());
        System.out.println("Area of Triangle 1: " + t1.getArea());
        System.out.println("Area of Triangle 2: " + t2.getArea());

        // Create Triangle objects and test the methods
        System.out.println("Are the triangles equal? " + t1.equals(t2));
    }
}
