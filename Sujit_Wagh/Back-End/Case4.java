package Case;

import java.util.Scanner;

public class Case4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUMBER OF MONTH");
		int digit = sc.nextInt();
		switch (digit) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
          System.out.println("this month having 31 days...");
			break;
		}

		case 2: {
           System.out.println("this month having 28 or 29 days ");
			break;
		}

		case 4: case 6: case 9 : case 11: {
			System.out.println("this month having 30 days ");
			break;
		}
		default:
			System.out.println("enter the valid input");
		}
	}

}
