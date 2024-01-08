package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class MathFunctionsTest {
	MathFunctions mathFunctions;
 
	@BeforeEach
	void init() {
		mathFunctions = new MathFunctions();
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

		assertEquals(0, mathFunctions.divide(10, 30));
		assertEquals(0, mathFunctions.divide(5, 25));
		int zero = 0;
		assumeTrue(zero == 1);
	    System.out.println("Zero value in denominator");
	    assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, zero));
		

	}
}
