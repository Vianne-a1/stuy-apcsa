import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
        public static void main(String[] args) {
                String fileName = "my_text.txt";

                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        String longestWord = "";

                        while ((line = br.readLine()) != null) {
                                String[] words = line.split("\\s+"); // Split the line into words

                                for (String word : words) {
                                        // Remove non-alphabetic characters for a simple word comparison
                                        word = word.replaceAll("[^a-zA-Z]", "");

                                        // Check if the current word is longer than the longest word found so far
                                        if (word.length() > longestWord.length()) {
                                                longestWord = word;
                                        }
                                }
                        }

                        System.out.println("Longest word: " + longestWord);

                } catch (IOException e) {
                        System.err.println("Error reading the file: " + e.getMessage());
                }
        }
}
