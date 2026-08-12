package streamlinetech.com.string;

public class TryCatch {

	public static void main(String[] args) {
		String str = null;
		
		try {
			
			System.out.println(str.length());
			
		}
		catch(Exception e) {
			System.out.println("becase str is null");
		}

	}

}
