package org.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0f, 3.0f), 0.0001);
        assertEquals(5.5, calculator.add(2.5f, 3.0f), 0.0001);
        assertEquals(8.20, calculator.add(6.10f, 2.10f), 0.0001);
        assertEquals(35.0, calculator.add(25.0f, 10.0f), 0.0001);
        assertEquals(50.0, calculator.add(30.0f, 20.0f), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(15.0f, 14.0f), 0.0001);
        assertEquals(11.0, calculator.subtract(30.0f, 19.0f), 0.0001);
        assertEquals(1.0, calculator.subtract(35.0f, 34.0f), 0.0001);
        assertEquals(1.0, calculator.subtract(5.9f, 4.9f), 0.0001);
        assertEquals(2.4, calculator.subtract(13.2f, 10.8f), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(16.0f, 8.0f), 0.0001);
        assertEquals(2.0, calculator.divide(22.0f, 11.0f), 0.0001);
        assertEquals(4.0, calculator.divide(12.0f, 3.0f), 0.0001);
        assertEquals(5.0, calculator.divide(15.0f, 3.0f), 0.0001);
        assertEquals(2.5, calculator.divide(5.0f, 2.0f), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1.0f, 0.0f));
    }

    @Test
    public void testMultiply() {
        assertEquals(20.0, calculator.multiply(4.0f, 5.0f), 0.0001);
        assertEquals(50.0, calculator.multiply(10.0f, 5.0f), 0.0001);
        assertEquals(26.0, calculator.multiply(13.0f, 2.0f), 0.0001);
        assertEquals(5.0, calculator.multiply(1.0f, 5.0f), 0.0001);
        assertEquals(15.0, calculator.multiply(3.0f, 5.0f), 0.0001);

    }
}