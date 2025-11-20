import java.util.Scanner;

public class Movies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter movie rating (as a decimal): ");
        double rating = input.nextDouble();

        int roundedRating = (int) Math.round(rating);

        System.out.println("Rating rounded: " + roundedRating);
    }
}
