package com.main.Exception;

public class ArithmaticException{
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


