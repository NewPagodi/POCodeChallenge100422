package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class isFactorialTest {

	/*
		isFactorial(2) ➞ true
		// 2 = 2 * 1 = 2!
		
		isFactorial(27) ➞ false
		
		isFactorial(24) ➞ true
		// 24 = 4 * 3 * 2 * 1 = 4!
	 */
	
	
	@Test
	void isFactorialTest01() {
		assertTrue(Main.isFactorial(2));
	}
	
	
	@Test
	void isFactorialTest02() {
		assertFalse(Main.isFactorial(27));
	}
	
	@Test
	void isFactorialTest03() {
		assertTrue(Main.isFactorial(24));
	}
	

}
