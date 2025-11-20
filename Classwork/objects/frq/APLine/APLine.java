public class APLine {
    private double a, b, c;
    private double x, y;

    // Constructors

    // Initialize this line with the parameters a, b, and c
    public APLine(int aVal, int bVal, int cVal) {
        a = aVal;
        b = bVal;
        c = cVal;
    }

    // Methods

    // Set the point on the line
    public void setPoint(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    // Check if a point is on the line
    public boolean isOnLine(double xVal, double yVal) {
        return (a * xVal + b * yVal + c == 0);
    }

    // Calculate and return the slope of the line
    public double getSlope() {
        return (-a / b);
    }
}
