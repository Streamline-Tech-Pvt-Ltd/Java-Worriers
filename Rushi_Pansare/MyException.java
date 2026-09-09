package com.main.Exception;

public class MyException extends Exception{
	MyException (String m){
		super(m);
	}

	public class Demo {

		public static void main(String[] args) {
			try {
			int age =15;
			
			if(age<18) {
				throw new ArithmeticException("not eligibal to vote");
			}
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}

	