import java.util.Scanner;

public class NoonSnooze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes (snooze) elapsed since 12:00 pm (noon): ");
        int snooze = input.nextInt();

        if (snooze >= 0) {
            int hours = snooze / 60; // Calculate the hours
            int minutes = snooze % 60; // Calculate the remaining minutes

            if (hours == 0) {
                System.out.println("12:" + String.format("%02d", minutes) + " pm");
            } else if (hours < 12) {
                System.out.println(hours + ":" + String.format("%02d", minutes) + " pm");
            } else if (hours == 12) {
                System.out.println("12:" + String.format("%02d", minutes) + " am");
            } else {
                hours -= 12;
                System.out.println(hours + ":" + String.format("%02d", minutes) + " am");
            }
        } else {
            System.out.println("No negative values are allowed");
        }
    }
}
