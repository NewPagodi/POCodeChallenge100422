package com.thaleswell;

public class Main {
	/**
	 * Check if the input is the factorial of another number.
	 * 
	 * @param i the input integer. It assumed to always be a positive integer.
	 * @return true if the input is a factorial
	 */
	public static boolean isFactorial(int i) {
		
		boolean isFact = false;
		int curFact = 1;
		int curInt = 1;
		
		// Check subsequent factorials until one either matches the input
		// or exceeds the input. If a match is found, return true. Otherwise,
		// since the factorial is an increasing function, if we exceed the input
		// without finding a match then we know no match will be found and
		// can return false.
		while ( curFact <= i ) {
			curFact = curFact * curInt;
			
			if ( curFact == i ) {
				isFact = true;
				break;
			}
			
			++curInt;
		}
		
		return isFact;
	}
	
	public static boolean validate(String s) {
		String regex = "\\d{4}|\\d{6}";
		
		return s.matches(regex);
	}
	
	
	public static void main(String[] args) {

	}

}
