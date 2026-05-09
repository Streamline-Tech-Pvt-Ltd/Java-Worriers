package rushi.main.Strmline;

import java.util.Scanner;

public class Nestedelseif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks");
		int marks = sc.nextInt();

		if (marks >= 80) {
			System.out.println("First Class");
		}
		else if (marks >= 60) {
			System.out.println("Second Class");
		}
		else if (marks >= 40) {
			System.out.println("Third Class");
		}
		else {
			System.out.println("Fail");
		}

		sc.close();
	}
}