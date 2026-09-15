package streamlinetech.com.hello;

import java.util.Scanner;

public class RelationOperter {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			
			System.out.println("enter First number:");
			int a = sc.nextInt();
			System.out.println("enter secound number:");
			int b = sc.nextInt();
			
			System.out.println("==" + (a == b));
			System.out.println("<" + (a <b));
			System.out.println(">" + (a>b));
			System.out.println("<=" + (a<=b));
			System.out.println(">=" + (a>=b));
			System.out.println("!=" + (a != b));
            sc.close();
	}

}
