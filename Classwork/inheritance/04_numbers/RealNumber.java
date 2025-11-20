public class RealNumber {
    private double value;

    public RealNumber(double v) {
        value = v;
    }

    public double getValue() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

    /**
     * @return 0 when other is the same as this, a positive value when this is
     * greater than other, or a negative value when this is less than other
     */
    public int compareTo(RealNumber other) {
        double o = other.getValue();

        if (value == o) {
            return 0;
        } else if (value > o) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * @return the sum of this and the other
     * @param other - ANY RealNumber, including a RationalNumber or other subclasses
     * of RealNumber (that aren't written yet)
     */
    public double add(RealNumber other) {
        return this.value + other.getValue();
    }

    /**
     * @return the product of this and the other
     * @param other - ANY RealNumber, including a RationalNumber or other subclasses
     * of RealNumber (that aren't written yet)
     */
    public double multiply(RealNumber other) {
        return this.value * other.getValue();
    }

    /**
     * @return the this divided by the other, use the / operator and don't worry
     * about errors.
     */
    public double divide(RealNumber other) {
        return this.value / other.getValue();
    }

    /**
     * @return the this minus the other
     */
    public double subtract(RealNumber other) {
        return this.value - other.getValue();
    }

    /**
     * @return true if and only if the other parameter has the same value as this.
     * hint: you should use getValue()
     */
    public boolean equals(RealNumber other) {
        return this.value == other.getValue();
    }
}