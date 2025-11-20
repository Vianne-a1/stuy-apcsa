import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter expression:");
        String infixExpression = input.nextLine();

        if (infixExpression.equals("")) {
            throw new Exception("No input found");
        }

        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);

        double result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }

    public static double evaluatePostfix(String postfix) {
        Deque<Double> stack = new ArrayDeque<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } else if (c == ' ') {
                continue;
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case '%':
                        stack.push(operand1 % operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop();
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> operatorStack = new ArrayDeque<>();

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == ' ') {
                continue;
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // Discard the '('
            } else {
                while (!operatorStack.isEmpty() && order(operatorStack.peek()) >= order(c)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    public static int order(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 0;
        }
    }
}
