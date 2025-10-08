// CalculatorApp.java
// Simple Calculator Application using Method Overloading

import java.util.Scanner;

class Calculator {

    // Method overloading for addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    double multiply(double a, double b) {
        return a * b;
    }

    // Division (with error handling)
    double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}

class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    // Perform Addition
    void performAddition() {
        System.out.println("Choose type of addition:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter two integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
            }
            case 2 -> {
                System.out.print("Enter two doubles: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Result: " + calc.add(a, b));
            }
            case 3 -> {
                System.out.print("Enter three integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b, c));
            }
            default -> System.out.println("Invalid choice!");
        }
    }

    // Perform Subtraction
    void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // Perform Multiplication
    void performMultiplication() {
        System.out.print("Enter two doubles: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // Perform Division
    void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + calc.divide(a, b));
    }

    // Main Menu
    void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> performAddition();
                case 2 -> performSubtraction();
                case 3 -> performMultiplication();
                case 4 -> performDivision();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice, try again!");
            }
        } while (choice != 5);
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
