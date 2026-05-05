package TwoArray;

public class ArrayLiterate {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3,4},{5,6,7,8}};
		
		System.out.println("Array Print simple ways");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
//		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
