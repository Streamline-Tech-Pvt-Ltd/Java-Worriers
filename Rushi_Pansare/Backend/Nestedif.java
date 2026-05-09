package rushi.main.Strmline;

import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount");
		int amount = sc.nextInt();

		
		if( amount>3) {
			 if(amount>14) {
				 System.out.println("alto");
			 }
			 else if(amount>7) {
				 System.out.println("city");
			 }
             else if(amount>5) {
            	 System.out.println("kia");
				 
			 }else
			 {
				 System.out.println("maruti");
			 }
			 
		}
		else {
			System.out.println("dont buy car");
		}
	

	}
}
