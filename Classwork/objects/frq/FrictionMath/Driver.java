package FrictionMath;

public class Driver {
    public static void main(String[] args) {
        Fraction first = new Fraction(3, 4);
        Fraction half = new Fraction(1, 2);

        System.out.println("Original: " + first);
        System.out.print("Multiplying by: " + half);

        // Corrected usage of multiplyFraction
        first.multiplyFraction(half);

        System.out.println("\nAnswer: " + first);

        System.out.println();
        System.out.print("Adding: " + half);
        first.addFraction(half);

        System.out.println("\nAnswer: " + first);
    }
}
