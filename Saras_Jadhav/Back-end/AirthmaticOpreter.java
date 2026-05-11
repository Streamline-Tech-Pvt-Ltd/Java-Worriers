package streamlinetech.com.hello;

import java.util.Scanner;

public class ArthmacticOpertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number:");
		int a = sc.nextInt();
		
		System.out.println("enter secound number:");
		int b = sc.nextInt();
		
		System.out.println("addition:" +(a+b));
		System.out.println("substraction:" +(a-b));
		System.out.println("Multipilcation:" +a*b);
		System.out.println("Division:" +a/b);
		System.out.println("Modular:" +a%b);

	}

}
