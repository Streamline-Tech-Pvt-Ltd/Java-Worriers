package Str;

public class NoParameterReturnType {

	String name()
	{
		return "Hey Sujit";
		
	}
	int add() {
		int a=4;
		int b=6;
		return a+b;
		
	}
	public static void main(String[] args) {
		NoParameterReturnType n = new NoParameterReturnType();
		System.out.println("The Main Method");
		System.out.println(n.name());
		System.out.println(n.add());
		
		
		
	}

}
