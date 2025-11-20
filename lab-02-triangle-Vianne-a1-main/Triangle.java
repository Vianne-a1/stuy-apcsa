public class Triangle {
    private Point point1, point2, point3;

    public Triangle(Point p1, Point p2, Point p3) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
    }

    public boolean equals(Triangle other) {
        return (point1.isEqual(other.point1) && point2.isEqual(other.point2) && point3.isEqual(other.point3)) ||
               (point1.isEqual(other.point2) && point2.isEqual(other.point3) && point3.isEqual(other.point1)) ||
               (point1.isEqual(other.point3) && point2.isEqual(other.point1) && point3.isEqual(other.point2));
    }

    public String getTriangleType() {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || c == a) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public double getArea() {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
