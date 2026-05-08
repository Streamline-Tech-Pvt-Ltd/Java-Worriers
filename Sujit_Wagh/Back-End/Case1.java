package Case;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first digit");
		int digit1 = sc.nextInt();
		System.out.println("Enter the operator + - * / %");
		char operators = sc.next().charAt(0);
		System.out.println("Enter the second digit");
		int digit2 =sc.nextInt();
		
		switch(operators)
		{
		case '+':{
			System.out.println("The addition of two numbers"+" "+(digit1+digit2));
			break;
		}
		case '-':{
			System.out.println("The sub of two numbers"+" "+(digit1-digit2));
			break;
		}
		case '*':{
			System.out.println("The multiplaction of two numbers"+" "+(digit1*digit2));
			break;
			
		}
		case '/':{
			System.out.println("The diviadtion of numbers "+" "+(digit1/digit2));
			break;
		}
		case '%':{
			System.out.println("The module of two numbers is"+" "+(digit1%digit2));
			break;
		}
		default:{
			System.out.println("Please enter the valid input");
		}
		
		}
		
				

	}

}
