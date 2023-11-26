package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}

}
