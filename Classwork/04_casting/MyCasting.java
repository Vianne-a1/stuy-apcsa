import java.util.Scanner;

public class MyCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first int: ");
        int int1 = input.nextInt();
        System.out.println("Enter second int: ");
        int int2 = input.nextInt();
        double quo = (double) int1/int2;
        System.out.println(quo);

    }
}
