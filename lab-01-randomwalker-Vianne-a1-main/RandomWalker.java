import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many steps do you want to take?");
        int n = input.nextInt();
        double randomNum = Math.random();
        int xCor = 0;
        int yCor = 0;
        for (int x = 0; x < n; x ++) {
            if (randomNum >= 0.0 && randomNum < 0.25) {
                xCor += 1;
            }
            else if (randomNum >= 0.25 && randomNum < 0.50) {
                yCor += 1;
            }
            else if (randomNum >= 0.50 && randomNum < 0.75) {
                xCor -= 1;
            }
            yCor -= 1;
        }
        double distance = Math.sqrt(xCor * xCor + yCor * yCor); 
        System.out.println("The final distance after " + n + " steps is " + distance);
    }
}

/*
import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            double randomValue = Math.random();
            int choice = randomValue < 0.5 ? x : y;
            int direction = randomValue < 0.5 ? -1 : 1;
            if (choice == x) {
                x += direction;
            } else {
                y += direction;
            }
        }
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("The final distance after " + N + " steps is " + distance);
    }
}

import java.util.Random;
import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int N = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int choice = random.nextBoolean() ? x : y;
            int direction = random.nextBoolean() ? 1 : -1;
            if (choice == x) {
                x += direction;
            } else {
                y += direction;
            }
        }
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("The final distance after " + N + " steps is " + distance);
    }
}

*/
