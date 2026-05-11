package streamlinetech.com.hello;

import java.util.Scanner;

public class UneryOperter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter First number:");
		int a = sc.nextInt();
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);

	}

}
