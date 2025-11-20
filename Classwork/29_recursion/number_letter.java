public class NumberToWords {

    private static final String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String numberToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        return convertToWords(number);
    }

    private static String convertToWords(int number) {
        if (number < 10) {
            return ONES[number];
        } else if (number < 20) {
            return TEENS[number - 10];
        } else if (number < 100) {
            return TENS[number / 10] + convertToWords(number % 10);
        } else if (number < 1000) {
            return ONES[number / 100] + "hundred" + ((number % 100 != 0) ? "and" + convertToWords(number % 100) : "");
        } else {
            // Handle the case for one thousand
            return "onethousand";
            
            //quiz 1 recursive, 1 i forgor, 1 faq
    }

    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 1000; i++) {
            String words = numberToWords(i);
            result += words.replaceAll("[^a-zA-Z]", "").length(); // Remove non-letter characters and calculate length
        }
        System.out.println("Total number of letters: " + result);
    }
}
