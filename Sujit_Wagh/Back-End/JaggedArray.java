package TwoArray;

public class JaggedArray {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		
		
		arr[0] = new int[2];
		arr[1]= new int[3];
		arr[2] = new int[4];
		arr[0][0]=1;
		arr[0][1]=2;
		
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		
		arr[2][0]=8;
		arr[2][1]=9;
		arr[2][2]=10;
		arr[2][3]=11;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);
		
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
