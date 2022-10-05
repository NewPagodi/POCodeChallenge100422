package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateTest {

	/*
	 validate("121317") ➞ true
     validate("1234") ➞ true
     validate("45135") ➞ false
     validate("89abc1") ➞ false
     validate("900876") ➞ true
     validate(" 4983") ➞ false
	 */
	
	@Test
	void ValidateTestEmptyString() {
		String testCase = "";
		assertFalse(Main.validate(testCase));
	}
	
	@Test
	void ValidateTest01() {
		String testCase = "121317";
		assertTrue(Main.validate(testCase));
	}

	@Test
	void ValidateTest02() {
		String testCase = "1234";
		assertTrue(Main.validate(testCase));
	}
	
	@Test
	void ValidateTest03() {
		String testCase = "45135";
		assertFalse(Main.validate(testCase));
	}
	
	@Test
	void ValidateTest04() {
		String testCase = "89abc1";
		assertFalse(Main.validate(testCase));
	}

	@Test
	void ValidateTest05() {
		String testCase = "900876";
		assertTrue(Main.validate(testCase));
	}
	
	@Test
	void ValidateTest06() {
		String testCase = " 4983";
		assertFalse(Main.validate(testCase));
	}
}
