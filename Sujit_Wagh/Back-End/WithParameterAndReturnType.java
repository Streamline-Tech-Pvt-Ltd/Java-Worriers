package Str;

public class WithParameterAndReturnType {

	public static void main(String[] args) {
		WithParameterAndReturnType w = new WithParameterAndReturnType();
		System.out.println(w.name("sujit"));
		System.out.println(w.add(20, 50));

	}
	String name(String c)
	{
		return c;
	}
	int add(int a , int b)
	{
		return a+b;
	}

}
