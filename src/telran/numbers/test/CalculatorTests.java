package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;

import static telran.numbers.Calculations.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.numbers.Calculations;

class CalculatorTests {
	
	double op1 = 10.5;
	double op2 = 0.5;
	double op1Negative = -10.5;
	double op2Negative = -0.5;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	@DisplayName("sum of two numbers")
	void testSum() {
		double expected = 11;
		assertEquals(expected, Calculations.sum(op1, op2));

		expected = 10;
		assertEquals(expected, sum(op1, op2Negative));

		expected = -11;
		assertEquals(expected, Calculations.sum(op1Negative, op2Negative));
	}

	@Test
	void testSubtract() {
		assertEquals(10, Calculations.subtract(op1, op2));
		assertEquals(11, Calculations.subtract(op1, op2Negative));
		assertEquals(-10, subtract(op1Negative, op2Negative));
	}

	@Test
	void testMultiply() {
		assertEquals(5.25, multiply(op1, op2));
		assertEquals(-5.25, multiply(op1, op2Negative));
		assertEquals(5.25, multiply(op1Negative, op2Negative));
	}
	
	@Test
	@DisplayName("div of two numbers")
	void testDivide() {
		assertEquals(21, divide(op1, op2), 0.1);
		assertEquals(-21, divide(op1, op2Negative));
		assertEquals(21, divide(op1Negative, op2Negative));
		assertEquals(Double.POSITIVE_INFINITY, divide(op1, 0));
		assertEquals(Double.NEGATIVE_INFINITY, divide(op1Negative, 0));
	}
}
