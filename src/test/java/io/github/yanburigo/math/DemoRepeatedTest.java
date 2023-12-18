package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class DemoRepeatedTest {

	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
	}
	
	//@RepeatedTest(3)
	@RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo) {
    	
		System.out.println("Repetition Nº " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
		
		System.out.println("Running " + testInfo.getTestMethod().get().getName());
		
    	//Given
    	double firstNumber = 6.2D;
        double secondNumber = 0D;
        
        var expectedMessage = "Impossible to divide by zero";
        
        //When & Then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
        	math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");
        
        //Then
        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }
}
