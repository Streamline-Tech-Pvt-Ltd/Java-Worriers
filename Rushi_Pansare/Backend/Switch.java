package rushi.main.Strmline;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter first number");
		int a=sc.nextInt();
		System.out.println( "enter second number");
		int b=sc.nextInt();
		System.out.println("enter choice");
		System.out.println(" 1.addition");
		System.out.println("2.multiplication");
		System.out.println("3.division");
		System.out.println("4.modulos");
		int choice =sc.nextInt();
		
		
		switch(choice) {
		case 1:
		System.out.println("Adiition" +"  "+(a+b));
			break;
		case 2:
				System.out.println("multiplication   :" +(a*b));
				break;
		case 3:
			System.out.println("division   :" +(a/b));
			 break;
		case 4:
			System.out.println("modulo   :" +(a%b));
			break;
		
		default:
			System.out.println("invalid choice");
			
			
		}
	}
}
