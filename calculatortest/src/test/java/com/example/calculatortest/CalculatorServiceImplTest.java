package com.example.calculatortest;

import exceptions.DivideByZeroException;
import impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CalculatorService;

public class CalculatorServiceImplTest {
	private final CalculatorService calculatorService = new CalculatorServiceImpl();

	@Test
	public void shouldCorrectlyCalculateSum() {
		int num1 = 10;
		int num2 = 20;
		int expectedResult = 30;

		Integer actualResult = calculatorService.plus(num1, num2);

		Assertions.assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldCorrectlyCalculateMinus() {
		int num1 = 10;
		int num2 = 20;
		int expectedResult = -10;

		Integer actualResult = calculatorService.minus(num1, num2);

		Assertions.assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldCorrectlyCalculateMultiply() {
		int num1 = 10;
		int num2 = 20;
		int expectedResult = 200;

		Integer actualResult = calculatorService.multiply(num1, num2);

		Assertions.assertEquals(expectedResult,actualResult);
	}
	@Test
	public void shouldCorrectlyCalculateDivide() {
		int num1 = 10;
		int num2 = 10;
		int expectedResult = 1;

		Integer actualResult = calculatorService.divide(num1, num2);

		Assertions.assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldThrowExceptionsWhenSecondArgumentIsZero(){
		int num1 = 10;
		int num2 = 0;

		Assertions.assertThrows(
				DivideByZeroException.class,
				() -> {calculatorService.divide(num1, num2);}
		);

	}
}