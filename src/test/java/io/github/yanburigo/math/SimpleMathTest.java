package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

	SimpleMath math;
	
	@BeforeAll
	static void setup() {
		System.out.println("Running @BeforeAll method!");
	}
	
	@AfterAll
	static void cleanUp() {
		System.out.println("Running @AfterAll method!");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Running @BeforeEach method!");
		math = new SimpleMath();
	}
	
	@AfterEach
	void afterEachMethod() {
		System.out.println("Running @AfterEach method!");
	}
	
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
    	
    	//Given
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;
        
        //When
        Double actual = math.sum(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
            () -> firstNumber + "+" + secondNumber +
            " did not produce " + expected + "!");
    }
    
    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
    	
    	//Given
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 4.2D;
        
        //When
        Double actual = math.subtraction(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {
    	
    	//Given
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 12.4D;
        
        //When
        Double actual = math.multiplication(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
                () -> firstNumber + "*" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
    	
    	//Given
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 3.1D;
        
        //When
        Double actual = math.division(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    @Test
    @Disabled("TODO: We need still work on it!")
    @DisplayName("Test Division by Zero")
    void disabledTestExample() {
    	fail();
    }
    
    @Test
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
    	
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
    
    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {
    	
    	//Given
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 4.1D;
        
        //When
        Double actual = math.mean(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
            () -> "(" + firstNumber + "+" + secondNumber + ")/2" +
            " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test Square Root of 81 = 9")
    void testSquareRoot() {
    	
    	//Given
        double number = 81D;
        double expected = 9D;
        
        //When
        Double actual = math.squareRoot(number);
        
        //Then
        assertEquals(expected, actual,
            () -> "Square Root of " + number +
            " did not produce " + expected + "!");
    }
}