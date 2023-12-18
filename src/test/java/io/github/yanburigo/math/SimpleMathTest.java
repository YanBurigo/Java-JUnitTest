package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
    	
    	//Given
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
    	fail();
    }
    
    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {
    	
    	//Given
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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