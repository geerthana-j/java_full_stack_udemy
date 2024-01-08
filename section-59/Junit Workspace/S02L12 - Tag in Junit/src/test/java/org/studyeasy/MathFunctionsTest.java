package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathFunctionsTest {
	MathFunctions mathFunctions;


	@BeforeEach
	void beforeEach() {
		mathFunctions = new MathFunctions();
	}

	@Test
	@Tag("runIt")
	void testAdd() {
		int expected = 40;
		int actual = mathFunctions.add(10, 30);
		assertEquals(expected, actual, "Addition operation failed");
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
	void testDivide() {
		
		assertAll(() -> assertEquals(0, mathFunctions.divide(10, 30)),
				  () -> assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, 0)),
                  () -> assertEquals(0, mathFunctions.divide(5, 25)
		));

	}
}
