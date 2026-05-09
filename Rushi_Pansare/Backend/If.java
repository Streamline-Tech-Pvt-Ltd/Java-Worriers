package rushi.main.Strmline;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age ");
		int age=sc.nextInt();
		
		if(age<=18) {
			System.out.println("Child");
		}
		if(age>=18 && age<34) {
			System.out.println("young");
		}
		if(age>=34 && age<=100) {
			System.out.println("old");
		}
	}

}
