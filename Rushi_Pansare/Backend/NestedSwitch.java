package rushi.main.Strmline;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice that you want to buy");
		System.out.println("1.car");
		System.out.println("2.bike");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("you want to buy car");
			System.out.println("chooce car");
			System.out.println("1 verna");
			System.out.println("2 fortuner");
			int car = sc.nextInt();
			switch (car) {
			case 1:
				System.out.println("you selected  verna");
				break;
			case 2:
				System.out.println("you selected fortuner");
				break;
			default:
				System.out.println("invalid choice");
			}
			break;
		case 2:
			System.out.println("you want to buy bike");
			System.out.println("1 zx10R");
			System.out.println("2 h2R");
			int bike = sc.nextInt();
			switch (bike) {
			case 1:
				System.out.println("you selectes zx10R");
				break;
			case 2:
				System.out.println("you selected h2r");
				break;
			default:
				System.out.println("invalid choice");
			}
			break;

		default:
			System.out.println("invalid both choice");
		}

	}

}
