package com.main.Exception;

import rushi.main.Strings.intern;

public class Demo {

	public static void main(String[] args) {
		try {
		int age =15;
		
		if(age<18) {
			throw new ArithmeticException("not eligibal to vote");
		}
		//System.out.println("eligibal to vote");  //new keyword varun through karta exception
		}catch (Exception e) {
			System.out.println(e.getMessage());// exception class and get method callng the .getmethod()
		}
		
	}

}
