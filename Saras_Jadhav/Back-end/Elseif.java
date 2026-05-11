package streamlinetech.com.hello;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter percentage number:");
		int per = sc.nextInt();
       
		if(per>=80) {
			System.out.println("first class");
		}
		else if(per>=60 && per<80) {
			System.out.println("second class");
		}
		else if(per>=35 && per<60) {
			System.out.println("thrid class");
		}
		else {
			System.out.println("fail");
		}
	}

}
