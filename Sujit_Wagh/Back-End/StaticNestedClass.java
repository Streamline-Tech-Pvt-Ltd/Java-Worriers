package streamlinetech.com.program;

public class StaticNestedClass {
	
	 static int age= 30;
	
	static class Inner{
		void show() {
			System.out.println("age:" +age);
		}
	}

	public static void main(String[] args) {
		 
		StaticNestedClass.Inner sc = new StaticNestedClass.Inner();
		sc.show();
		
			}

}
