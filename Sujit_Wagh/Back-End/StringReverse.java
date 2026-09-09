package PRA;

import java.util.Scanner;

public class StringReverse {

	

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s =sc.next();
		String rev = new StringBuilder(s).reverse().toString();
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("is paldram");
		}
		else
		{
			System.out.println("not paldraom");
		}

	}

}
