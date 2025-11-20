package FrictionMath;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }

    public void addFraction(Fraction other) {
        Fraction result = FractionMath.add(this, other);
        this.numerator = result.getNumerator();
        this.denominator = result.getDenominator();
    }

    public Fraction multiplyFraction(Fraction other) {
        int newNumerator = this.numerator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
