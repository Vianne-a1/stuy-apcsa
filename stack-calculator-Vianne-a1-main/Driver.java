import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter expression:");
        String infixExpression = input.nextLine();

        if (infixExpression.equals("")) {
            throw new Exception("No input found");
        }

        String postfixExpression = Calculator.infixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);

        double result = Calculator.eval(postfixExpression);
        System.out.println("Result: " + result);
    }
}
