package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testAlgoritmos {
	
	static algoritmos a;
	
	@BeforeAll
	static void setup() {
		a = new algoritmos() {};
	}
	
	@Test
	void testFibonacci() {
		assertEquals(5, a.fibonacci(5));
		assertEquals(21, a.fibonacci(8));
		assertEquals(55, a.fibonacci(10));
	}

	@Test
	void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testPrimo() {
		fail("Not yet implemented");
	}

}
