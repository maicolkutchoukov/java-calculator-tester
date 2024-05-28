package org.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0f, 3.0f), 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.subtract(5.0f, 4.0f), 0.0001);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6.0f, 3.0f), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1.0f, 0.0f));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15.0, calculator.multiply(3.0f, 5.0f), 0.0001);
    }
}