package rushi.main.demo;

import java.util.Scanner;

public class Arthmatic {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		
		System.out.println("Addition:   " +(a+b));
		System.out.println("Multiplication:  " +(a*b));
		System.out.println("Division:  " +(a/b));
		System.out.println("Modulo:  " +(a%b));
		
		

	}

}
