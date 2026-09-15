package streamlinetech.com.array;

public class JaddedArray {

	public static void main(String[] args) {
		int [][] arr= new int [3][];
		
		arr [0] = new int[3];
		arr [1] = new int[2];
		arr [2] = new int[4];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=1;
		arr[1][1]=2;
		
		arr[2][0]=1;
		arr[2][1]=2;
		arr[2][2]=3;
		arr[2][3]=4;
		
		for(int[] element: arr) {
			for(int j=0 ; j< element.length;j++) {
				System.out.print(element[j]+ " ");
			}
			System.out.println();
			
		}

	}

}
