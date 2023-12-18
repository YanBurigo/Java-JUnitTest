package io.github.yanburigo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Order(2)
class MethodOrderedByNameTest {

	@Test
	@Order(1)
	void testA() {
		System.out.println("Running Test A");
	}
	
	@Test
	@Order(2)
	void testB() {
		System.out.println("Running Test B");
	}
	
	@Test
	@Order(4)
	void testC() {
		System.out.println("Running Test C");
	}
	
	@Test
	@Order(3)
	void testD() {
		System.out.println("Running Test D");
	}

}
