package rushi.main.Strmline;

import java.util.Scanner;

public class Elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age =sc.nextInt();
		
		if(age>=18) {
			System.out.println("YOur eligible to vote");
		}
		else {
			System.out.println("you an not eligible vote");
		}
	
			
	}
}
