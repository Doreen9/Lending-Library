package test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sumOfNumbers() {
    int value = Numbers.SumOfNumbers(32, 45);
    assertEquals(77, value);
    }

    @Test
    void isPositive() {
        boolean result = Numbers.IsPositive(-1);
        assertFalse(result);
    }

    @Test
    void isPositive1() {
        boolean result = Numbers.IsPositive(0);
        assertTrue(result);
    }

    @Test
    void isPositive2() {
        boolean result = Numbers.IsPositive(1);
        assertTrue(result);
    }

    @Test
    void isNegative() {

        boolean result = Numbers.IsNegative(0);
        assertFalse(result);
    }

    @Test
    void isNegative1() {

        boolean result = Numbers.IsNegative(-1);
        assertTrue(result);
    }

    @Test
    void isNegative2() {

        boolean result = Numbers.IsNegative(1);
        assertFalse(result);
    }

    @Test
    void isEvenAndGreaterThanZero() {
        boolean value = Numbers.IsEvenAndGreaterThanZero(-2);
        assertFalse(value);
    }

    @Test
    void isEvenAndGreaterThanZero1() {
        boolean value = Numbers.IsEvenAndGreaterThanZero(0);
        assertFalse(value);
    }

    @Test
    void isEvenAndGreaterThanZero2() {
        boolean value = Numbers.IsEvenAndGreaterThanZero(2);
        assertTrue(value);
    }

    @Test
    void isLeapYear() {
        boolean year = Numbers.IsLeapYear(2019);
        assertFalse(year);
    }

    @Test
    void isLeapYear1() {
        boolean year = Numbers.IsLeapYear(2008);
        assertTrue(year);
    }
}