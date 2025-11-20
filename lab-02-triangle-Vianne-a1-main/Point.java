public class Point {
    private double x, y;

    public Point(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    public Point(Point p) {
        x = p.x;
        y = p.y;
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
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceTo(Point other) {
        return distance(this, other);
    }

    public static boolean isClose(double value1, double value2) {
        double close = 0.001;
        return Math.abs(value1 - value2) <= close * Math.max(Math.abs(value1), Math.abs(value2));
    }

    public boolean isEqual(Point other) {
        return isClose(x, other.x) && isClose(y, other.y);
    }
}
