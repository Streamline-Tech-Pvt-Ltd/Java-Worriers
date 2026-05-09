package rushi.main.Strmline;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month number....");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :case 3: case 7:case 8: case 9: case 12:
			System.out.println("31day ");
			break;

		case 2:
			System.out.println("28 or 29 day");
			break;
			
		case 4: case 5: case 6: case 10: case 11: 
			System.out.println("30 day ");
			break;
		default:
			System.out.println("invalid");
		}

	}
}