public class RationalNumber extends RealNumber {
    private int numerator, denominator;

    public RationalNumber(int nume, int deno) {
        super(0.0); // this value is ignored!
        if (deno < 0) {
            nume = -nume;
            deno = -deno;
        }
        if (deno == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            this.numerator = nume;
            this.denominator = deno;
        }
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public double getValue() {
        return (double) numerator / denominator;
    }

    public RationalNumber reciprocal() {
        return new RationalNumber(denominator, numerator);
    }

    public boolean equals(RationalNumber other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public void reduce() {
        int common = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= common;
        denominator /= common;
    }

    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public RationalNumber divide(RationalNumber other) {
        return new RationalNumber(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
}