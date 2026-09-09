package com.main.Exception;




public class Multiple {

	public static void main(String[] args) {
		try {
			int data =25/0;
			System.out.println("result  :"+data);
			
		} catch (ArithmeticException e) {
			System.out.println("not devisible by 0");
		
		}
		finally {													//finally always execute for both if exceptios for try and catch also
			System.out.println("finally block executes");
		}
		System.out.println("program is runiige");
		
		
	}

}

