package Str;

public class WithParameterNoReturn {

	void add(int a,int b)
	{
		System.out.println(a+b);
		
		
	}
	void name(String c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		WithParameterNoReturn w= new WithParameterNoReturn();
		System.out.println("The Main Method");
		w.add(10, 52);
      w.name("sujit");
	}

}
