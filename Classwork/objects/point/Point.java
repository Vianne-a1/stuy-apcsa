public class Point {
    private double x, y;

    public Point(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    public Point(Point other) {
        x = other.x;
        y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static double distance(Point a, Point b) {
        double xdistance = a.x - b.x;
        double ydistance = a.y - b.y;
        return Math.sqrt(xdistance * xdistance + ydistance * ydistance);
    }

    public double distanceTo(Point other) {
        return distance(this, other);
    }
}
