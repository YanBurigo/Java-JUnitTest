package io.github.yanburigo.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathAdvanceTest {

	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
	}
	
    @ParameterizedTest
    @DisplayName("Test 6.2 / 2 = 3.1")
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
}