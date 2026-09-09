package PRA;

import java.util.Arrays;

public class Loop {
 public static  int LargetsElement(int[] arr)
 {
	 Arrays.sort(arr);
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 if(arr[i]==arr[arr.length-1])
		 {
			 return arr[i];
			 
		 }
	 }
	 return 0;

	 
 }
	public static void main(String[] args) {
		int [] arr= {80,50,45,90,60};
		System.out.println(LargetsElement(arr));
	}

}
