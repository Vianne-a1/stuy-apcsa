import java.util.Scanner;
import java.util.Stack;

public class Calculator {
/* DO NOT CHANGE THE METHOD SIGNATURE */
    public static double eval(String expression) {
        if (expression.isEmpty()) {
            throw new IllegalArgumentException("Too few operands");
        }
        Stack<Double> stack = new Stack<>();
        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()) {
            String operation = scanner.next();
            if (isOperator(operation)) {
                double y = stack.pop();
                double x = stack.pop();
                switch (operation) {
                    case "+": stack.push(x + y); break;
                    case "-": stack.push(x - y); break;
                    case "*": stack.push(x * y); break;
                    case "/": stack.push(x / y); break;
                    case "%": stack.push(x % y); break;
                }
            } else {
                stack.push(Double.parseDouble(operation));
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Too many operands");
        }
        return stack.pop();
    }

    private static boolean isOperator(String operation) {
        return operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%");
    }

    public static String infixToPostfix(String infix) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(infix);
        while (scanner.hasNext()) {
            String operation = scanner.next();
            if (isOperator(operation)) {
                while (!stack.isEmpty() && order(operation) <= order(stack.peek())) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(operation);
            } else if (operation.equals("(")) {
                stack.push(operation);
            } else if (operation.equals(")")) {
                while (!stack.peek().equals("(")) {
                    result.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else {
                result.append(operation).append(" ");
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }
        return result.toString();
    }

    private static int order(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
            case "%":
                return 2;
            default:
                return 0;
        }
    }
}
