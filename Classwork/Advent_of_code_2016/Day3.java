import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        String filename = "/workspaces/apcsa-assignments-Vianne-a1/Classwork/Advent_of_code_2016/Day3.txt"; // specify the filename here
        int validTriangles = 0;

        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.trim().split("\\s+");

                if (parts.length != 3) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                int a, b, c;
                try {
                    a = Integer.parseInt(parts[0]);
                    b = Integer.parseInt(parts[1]);
                    c = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                if (isValidTriangle(a, b, c)) {
                    validTriangles++;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(1);
        }

        System.out.println("Valid triangles: " + validTriangles);
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}