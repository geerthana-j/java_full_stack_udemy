package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathFunctionsTest {
	MathFunctions mathFunctions;
	
	@BeforeEach
	void beforeEach() {
		mathFunctions = new MathFunctions();
	}
    
	@AfterEach
	void afterEach() {
		System.out.println("Execute after each");
	}
	


		
	@Test
	void testAdd() {
		int expected = 40;
		int actual = mathFunctions.add(10, 30);
		assertEquals(expected, actual, "Addition operation failed");
	}

	@Test
	void testSub() {
		int expected = -20;
		int actual = mathFunctions.sub(10, 30);
		assertEquals(expected, actual, "Substraction operation failed");
	}

	@Test
	void testMultiple() {
		int expected = 300;
		int actual = mathFunctions.multiple(10, 30);
		assertEquals(expected, actual, "Muiltipication operation failed");
	}

	@Test
	void testDivide() {
		int expected = 0;
		int actual = mathFunctions.divide(10, 30);
		assertEquals(expected, actual, "Division operation failed");
		assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, 0),
				"Divide mmethod should throw exception");

	}
}
