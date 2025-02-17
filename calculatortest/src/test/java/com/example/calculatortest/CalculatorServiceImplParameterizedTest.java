package com.example.calculatortest;

import exceptions.DivideByZeroException;
import impl.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({"10, 20, 30", "20, 15, 35"})
    void shouldCorrectlyCalculateSum(int num1, int num2, int expectedResult) {
        Integer actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 20, -10", "20, 15, 5"})
    void shouldCorrectlyCalculateMinus(int num1, int num2, int expectedResult) {
        Integer actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 20, 200", "5, 20, 100"})
    void shouldCorrectlyCalculateMultiply(int num1, int num2, int expectedResult) {
        Integer actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 10, 1", "50, 10, 5"})
    void shouldCorrectlyCalculateDivide(int num1, int num2, int expectedResult) {
        Integer actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 0})
    void shouldThrowExceptionsWhenSecondArgumentIsZero(int num2) {
        int num1 = 10;
        assertThrows(DivideByZeroException.class, () -> {
            calculatorService.divide(num1, num2);
        });
    }
}
