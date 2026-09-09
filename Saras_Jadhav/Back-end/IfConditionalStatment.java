package streamlinetech.com.hello;

import java.util.Scanner;

public class IfConditionalStatment {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("enter First number:");
			int age = sc.nextInt();		
		
		if(age<18) {
			System.out.println("child");
			return;
		}
		if(age>=18 && age<34) {
			System.out.println("young");
			return;
		}
		if(age>=34 && age<=100) {
			System.out.println("old");
		}
		}
		

	}


