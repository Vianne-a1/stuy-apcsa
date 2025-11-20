/* Write a Java program (Calculator.java) that calculates the sum of two numbers (int or double).
Output:

10 + 12 = 22
  */

public class Calculator {
    public static void main(String[] args) {
        double addend1 = 10;
        double addend2 = 12;
        double sum = addend1 + addend2;
        if (sum % 1 == 0) {
            int res = (int) sum;
            System.out.print(res);
        } else {
            System.out.print(sum);
        }
    }
}
