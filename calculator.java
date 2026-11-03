package com.college.calculator;

/** Provides the four basic arithmetic operations. */
public class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
