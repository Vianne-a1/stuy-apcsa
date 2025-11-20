public class Driver {
    public static void main(String[] args) {
        // Array of strings
        String[] words = {"Hi", "there", "Tyler", "Sam", "Hi", "there"};

        // Create a WordPairList object
        WordPairList list = new WordPairList(words);

        // Print the list (optional)
        // System.out.println(list);

        // Print the number of matched pairs
        System.out.println("The number of matched pairs is: " + list.numMatches());

        // ADD MORE TEST CASES (at least 2 more)

        // Test case 1
        String[] words2 = {"Hello", "Hello", "Hello", "World", "World"};
        WordPairList list2 = new WordPairList(words2);
        System.out.println("Test Case 1 - The number of matched pairs is: " + list2.numMatches());

        // Test case 2
        String[] words3 = {"Apple", "Banana", "Cherry"};
        WordPairList list3 = new WordPairList(words3);
        System.out.println("Test Case 2 - The number of matched pairs is: " + list3.numMatches());
    }
}
