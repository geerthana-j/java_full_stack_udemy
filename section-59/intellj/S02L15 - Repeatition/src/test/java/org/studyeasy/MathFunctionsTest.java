package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class MathFunctionsTest {
	MathFunctions mathFunctions;

	/*@BeforeAll
	void beforeAll() {
		System.out.println("Before All");
	}

	@AfterAll
	void afterAll() {
		System.out.println("After All");
	}*/

	@BeforeEach
	void beforeEach() {
		mathFunctions = new MathFunctions();
	}
    /*
	@AfterEach
	void afterEach() {
		System.out.println("Execute after each");
	}
     */
	@Test
	@Tag("runIt")
	void testAdd() {
		int expected = 40;
		int actual = mathFunctions.add(10, 30);
		assertEquals(expected, actual, () -> "Addition operation failed");
	}

	@Test
	@Tag("runIt")
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
	//@RepeatedTest(5)
	void repeatMe(){

		System.out.println("I am alive");
	 }

}
