package streamlinetech.com.hello;

import java.util.Scanner;

public class IfIfIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter budget number:");
		int b = sc.nextInt();
		
		if(b>=100000) {
			System.out.println("buy Iphone");
			return;
		}
		if(b>=70000) {
			System.out.println("buy sumsung");
		    return;
		}
		if(b>=50000) {
			System.out.println("buy vivo");
		}
		else {
			System.out.println("buy nokia");
		}

	}

}
