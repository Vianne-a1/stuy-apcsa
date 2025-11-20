public class Fractions {
    public static void main(String[] args) {
        int numerator1 = 1;
        int denominator1 = 2;
        int numerator2 = 2;
        int denominator2 = 5;

        int resultNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);
        int resultDenominator = denominator1 * denominator2;

        System.out.println("The sum of " + numerator1 + "/" + denominator1 + " + " + numerator2 + "/" + denominator2 + " = " + resultNumerator + "/" + resultDenominator);
    }
}
