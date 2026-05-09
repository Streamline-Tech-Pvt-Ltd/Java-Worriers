package rushi.main.Strmline;

import java.util.Scanner;

public class IfIfIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("price budget");
		int price=sc.nextInt();
		
		if(price>=10000) {
			System.out.println("iphone");
			
		}
		if(price<=70000) {
			System.out.println("samsunge");
			
		}
		if(price<50000) {
			System.out.println("1plus");
		}
		if(price<20000) {
			System.out.println("mi");
			
		}
		else {
			System.out.println("make the budget first according to price");
		}
	}
}
