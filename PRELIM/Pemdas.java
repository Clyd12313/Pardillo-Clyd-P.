// Name: Clyd Pardillo #35
// Yr & Sec: BSIT 2B
// Activity #1

import java.util.Scanner;
import java.util.Stack;

public class Pemdas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the PEMDA Calculator!");
        System.out.println("Enter an equation to compute (e.g., 3 + 4 * (2 - 1)):");

        String input = scanner.nextLine();

        try {
            double result = calculate(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input or calculation error: " + e.getMessage());
        }

        scanner.close();
    }

    public static double calculate(String input) {
        input = input.replaceAll("\\s", "");


        if (!input.matches("[0-9+*/().]+")) {
            throw new IllegalArgumentException("Invalid characters in the input.");
        }

        return evaluateExpression(input);
    }

    private static double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    double b = numbers.pop();
                    double a = numbers.pop();
                    char operator = operators.pop();
                    double result = applyOperator(a, b, operator);
                    numbers.push(result);
                }
                operators.pop();             } else if (isOperator(c)) {
                while (!operators.isEmpty() && hasHigherPrecedence(c, operators.peek())) {
                    double b = numbers.pop();
                    double a = numbers.pop();
                    char operator = operators.pop();
                    double result = applyOperator(a, b, operator);
                    numbers.push(result);
                }
                operators.push(c);
            } else {
                StringBuilder numStr = new StringBuilder();
                numStr.append(c);
                while ((i + 1) < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numStr.append(expression.charAt(++i));
                }
                numbers.push(Double.parseDouble(numStr.toString()));
            }
        }

        while (!operators.isEmpty()) {
            double b = numbers.pop();
            double a = numbers.pop();
            char operator = operators.pop();
            double result = applyOperator(a, b, operator);
            numbers.push(result);
        }

        return numbers.pop();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '*' || c == '/';
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+');
    }

    private static double applyOperator(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
