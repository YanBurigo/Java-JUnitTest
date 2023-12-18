package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathAdvanceTest {

	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
	}
	
    @ParameterizedTest
    @DisplayName("Test MethodSource")
    //@MethodSource("testDivisionInputParameters")
    @MethodSource
    void testDivision(double firstNumber, double secondNumber, double expected) {
    	
    	//Given
        
        //When
        Double actual = math.division(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual, 2D,
                () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    //Name testDivisionInputParameters or same name
    public static Stream<Arguments> testDivision() {
		return Stream.of(
			Arguments.of(6.2D, 2D, 3.1D),
			Arguments.of(71D, 14D, 5.07D),
			Arguments.of(18.3D, 3.1D, 5.90D)
		);
	}
    
    @ParameterizedTest
    @DisplayName("Test File CSV")
    @CsvSource({
    	"6.2, 2, 3.1",
    	"71, 14, 5.07",
    	"18.3, 3.1, 5.90"
    })
    void csvTestDivision(double firstNumber, double secondNumber, double expected) {
    	
    	//Given
        
        //When
        Double actual = math.division(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual, 2D,
                () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    @ParameterizedTest
    @DisplayName("Test File CSV")
    @CsvFileSource(resources = "/testDivision.csv")
    void csvFileTestDivision(double firstNumber, double secondNumber, double expected) {
    	
    	//Given
        
        //When
        Double actual = math.division(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual, 2D,
                () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Moon"})
    void testValueSource(String firstName) {
    	assertNotNull(firstName);
    }
}