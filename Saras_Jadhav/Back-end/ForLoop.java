package streamlinetech.com.loops;

public class ForLoop {

	public static void main(String[] args) {
		for(int i =1 ; i<=5 ; i++) {
			for(int j = 1 ; j<=5; j++ ) {
				
			    if(i==3) {
				   System.out.print("#"+ "\t");
			   }
			   else if(i==5) {
				   System.out.print("@"+ "\t");
			   }
			   else if(j==5) {
					System.out.print("!" + "\t");
				}
			   else {
				   System.out.print("Ram"+ "\t");
			   }
			}
			System.out.println();
		}

	}

}
