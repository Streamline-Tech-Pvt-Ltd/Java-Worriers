package streamlinetech.com.hello;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age number:");
		int age = sc.nextInt();
		
		if(age >=18) {
			System.out.println("you can vote");
		}else {
			System.out.println("youn can not vote");
		}

	}

}
