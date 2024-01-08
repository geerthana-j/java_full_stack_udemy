package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathFunctionsTest {
	MathFunctions mathFunctions;

	@BeforeAll
	void beforeAll() {
		System.out.println("Before All");
	}

	@AfterAll
	void afterAll() {
		System.out.println("After All");
	}

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
	@DisplayName("AssertAll Example")
	@Disabled
	void testDivide() {
		
		assertAll(() -> assertEquals(0, mathFunctions.divide(10, 30)),
				  () -> assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, 0)),
                  () -> assertEquals(5, mathFunctions.divide(5, 25)
		));

	}
}
