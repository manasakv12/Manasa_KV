import java.util.Scanner;

class Calculator {
    double a;
    double b;
    String operator;

    public Calculator(double a, double b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        Calculator calculator = new Calculator(a, b, operator);

        try {
            double result = calculator.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
