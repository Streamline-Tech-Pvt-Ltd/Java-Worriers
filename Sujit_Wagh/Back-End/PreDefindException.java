package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import Array.Airthmatic;

public class PreDefindException {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a = sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			int result =a/b;
			int [] arr= {1,2,3,4};
			System.out.println(arr[2]);
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println(name.length());
			
			
			
		}catch (ArithmeticException e) {
			System.out.println("Enter the valid input");
			
			
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("Enter the valid index");
		}catch(InputMismatchException e)
		
		{
			System.out.println("Enter the valid input");
			
		}
	}

}
