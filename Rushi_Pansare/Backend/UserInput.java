package rushi.main.demo;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number");

		int a = sc.nextInt();


		System.out.println("Enter the name");
		String s = sc.next();

		System.out.println("Enter the full name");
		String s1 = sc.nextLine();
		
		sc.nextLine();

		System.out.println("enter the percentage");
		float f = sc.nextFloat();

		System.out.println("enter the value");
		long l = sc.nextLong();

		System.out.println("enter the double value");
		double d = sc.nextDouble();

	}

}
