package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathFunctionsTest {

	@Test
	void testAdd() {
		MathFunctions mathFunctions = new MathFunctions();
		int expected = 41;
		int actual = mathFunctions.add(10, 30);
		assertEquals(expected, actual);
	}

}
