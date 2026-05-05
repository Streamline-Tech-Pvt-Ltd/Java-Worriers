package Array;

import java.util.Arrays;

public class ArrayLiteralEx {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		double[] arr1= {60,70,80,90,100};
		
		System.out.println("Printing array ways");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("Second Method of array printing");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);	
		}
		System.out.println("Print array length");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	System.out.println("print for each loop");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("Print hash code of array");
		System.out.println(arr);
		System.out.println(arr1);
		
		System.out.println("Array to string");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}

}
