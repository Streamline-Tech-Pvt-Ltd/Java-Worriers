// throw with try catch

package streamlinetech.com.program;

public class ThrowTryCatch {

	public static void main(String[] args) {
		try {
			int balanace = 5000;
			if(balanace<10000) {
				throw new Exception ("Insufficient balance");
			}
		}catch(Exception e){
				System.out.println(e.getMessage());
			
		}

	}

}
