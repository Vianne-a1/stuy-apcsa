import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "your_data.txt"; // Replace with the actual path to your file

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int[][] twoDArray = new int[4][4]; // Assuming a 4x4 array

            int row = 0;
            while ((line = br.readLine()) != null && row < 4) {
                String[] values = line.split("\\s+");

                for (int col = 0; col < values.length && col < 4; col++) {
                    twoDArray[row][col] = Integer.parseInt(values[col]);
                }

                row++;
            }

            // Print the 2D array
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(twoDArray[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error converting string to integer: " + e.getMessage());
        }
    }
}
