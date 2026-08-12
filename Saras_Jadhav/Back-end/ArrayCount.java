package streamlinetech.com.array;

import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		
		int[] a1= new int[n];
		
		System.out.println("Enter Array Elements:");
		for(int i = 0; i<a1.length; i++) {
			a1[i]= sc.nextInt();
		}
		
		System.out.println("Enter Number To Search How Many time in Array:");
		int num = sc.nextInt();
		
		for(int i=0; i<a1.length; i++) {
			if(num == a1[i]) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Number is Not Found");
		}
		else {
			System.out.println(num+" "+"is"+" "+count+" "+"time in array ");
		}

	}

}
