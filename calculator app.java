package com.college.calculator;

import java.util.Scanner;

/** Console user interface for the DevOps Calculator. */
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== DevOps Calculator ===");
            System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide  0. Exit");
            while (true) {
                System.out.print("\nChoose an option: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a number from 0 to 4.");
                    scanner.next();
                    continue;
                }
                int choice = scanner.nextInt();
                if (choice == 0) {
                    System.out.println("Thank you for using the calculator!");
                    break;
                }
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid option. Choose 0 to 4.");
                    continue;
                }
                System.out.print("Enter first number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number.");
                    scanner.next();
                    continue;
                }
                double first = scanner.nextDouble();
                System.out.print("Enter second number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number.");
                    scanner.next();
                    continue;
                }
                double second = scanner.nextDouble();
                try {
                    double result = switch (choice) {
                        case 1 -> calculator.add(first, second);
                        case 2 -> calculator.subtract(first, second);
                        case 3 -> calculator.multiply(first, second);
                        case 4 -> calculator.divide(first, second);
                        default -> throw new IllegalStateException("Unexpected option");
                    };
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }
}
