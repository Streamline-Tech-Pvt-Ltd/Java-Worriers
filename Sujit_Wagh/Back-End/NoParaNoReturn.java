package Str;

public class NoParaNoReturn {
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		sub();
	}
	void sub() {
int a=10;
int b=90;
System.out.println(a-b);
	}
		

	public static void main(String[] args) {
		
		NoParaNoReturn n = new NoParaNoReturn();
		System.out.println("The main method ");
		n.add();
		
		
		
		
		
		
	}

}
