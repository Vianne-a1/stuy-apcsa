import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much does dinner usually cost?");
        double dinner = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double laser = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double scoop = input.nextDouble();

        dinner = dinner * 3;
        laser = laser * 2;
        scoop = scoop * 4 / 3;
        double total = dinner + laser + scoop;

        System.out.println("Dinner: $" + dinner);
        System.out.println("Laser Tag: $" + laser);
        System.out.println("Ice Cream: $" + scoop);
        System.out.println("Grand Total: $" + total);

    }
}
