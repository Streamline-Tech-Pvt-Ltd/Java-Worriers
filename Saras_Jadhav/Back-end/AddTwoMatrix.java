package streamlinetech.com.array;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] sum = new int[3][3];
		
		
		System.out.println("enter first 3 by 3 array:");
		for(int i = 0; i<3 ; i++) {
			for(int j= 0; j<3; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("enter first 3 by 3 array:");
		for(int i = 0; i<3 ; i++) {
			for(int j= 0; j<3; j++) {
				b[i][j]= sc.nextInt();
			}
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0 ; j<3 ; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("addition of array: ");
		for(int i = 0; i<3; i++) {
			for(int j = 0 ; j<3 ; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}


