package io.github.yanburigo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Same class for all methods, similar singleton
class MethodOrderedByOrderIndexTest {

	@Test
	void testA() {
		System.out.println("Running Test A");
	}
	
	@Test
	void testB() {
		System.out.println("Running Test B");
	}
	
	@Test
	void testC() {
		System.out.println("Running Test C");
	}
	
	@Test
	void testD() {
		System.out.println("Running Test D");
	}

}
