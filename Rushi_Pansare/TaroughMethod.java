package com.main.Exception;

import rushi.main.Strings.intern;

public class TaroughMethod {
	//througjh with method
	
	static void checkNumber(int n) {
		if(n<0) {
			throw new ArithmeticException("Negative number not allowed");	
		}else {
			System.out.println("number is positive");
		}
	}
	public static void main(String[] args) {
		checkNumber(2);
	}
}
