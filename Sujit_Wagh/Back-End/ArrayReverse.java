package Array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		// create a array
		int[] arr=new int[n];
		
		System.out.println("Enter the "+n+"elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--)

		{
			System.out.println(arr[i]);
		}
		

	}

}
