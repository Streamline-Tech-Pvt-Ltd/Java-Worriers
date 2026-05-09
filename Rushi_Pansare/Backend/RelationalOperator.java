package rushi.main.demo;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		System.out.println("eual to   :" +(a==b));
		System.out.println("less than  :" +(a<b));
		System.out.println("Greater than :" +(a>b));
		System.out.println("less than equal  :" +(a<=b));
		System.out.println("greater than  eual :" +(a>=b));
	}
}
