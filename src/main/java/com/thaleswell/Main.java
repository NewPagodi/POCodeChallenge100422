package com.thaleswell;

public class Main {
	
	public static boolean validate(String s) {
		String regex = "\\d{4}|\\d{6}";
		
		return s.matches(regex);
	}
	
	
	public static void main(String[] args) {

	}

}
