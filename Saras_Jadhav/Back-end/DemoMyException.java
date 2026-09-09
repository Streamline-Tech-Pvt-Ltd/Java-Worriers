package streamlinetech.com.program;

class MyClassException extends Exception{
	
	MyClassException(String m)
	{
	  super(m);
	}
}


public class DemoMyException {

	public static void main(String[] args) {
		
		int age = 15;
		
		try {
			if(age<18) {
				throw new MyClassException("Not Eligible to vote");
			}else {
				System.out.println("vote");
			}
		}catch(MyClassException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
