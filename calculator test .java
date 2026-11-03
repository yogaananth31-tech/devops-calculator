package com.college.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test void addsNumbers() { assertEquals(8.0, calculator.add(5, 3)); }
    @Test void subtractsNumbers() { assertEquals(2.0, calculator.subtract(5, 3)); }
    @Test void multipliesNumbers() { assertEquals(15.0, calculator.multiply(5, 3)); }
    @Test void dividesNumbers() { assertEquals(2.0, calculator.divide(6, 3)); }
    @Test void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
