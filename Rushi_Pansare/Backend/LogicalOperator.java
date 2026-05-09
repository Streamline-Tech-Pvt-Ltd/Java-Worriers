package rushi.main.demo;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		if(a>2 && b<10) {
			
			System.out.println( "a and b are equal");
		}else {
				System.out.println("not equal");
			}
		if(a<10||b>1) {
			System.out.println("in between a and b");	
		}else {
			System.out.println("not in between");
		}
		if(!(a>b)) {
			System.out.println("a is not greter than b");
		}else {
			System.out.println("a is grater than b");
		}
		}
		
		
		
	}

