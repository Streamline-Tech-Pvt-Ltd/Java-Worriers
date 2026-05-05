package Array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the "+n+"elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
			
		}
		System.out.println(sum);
		
		

	}

}
