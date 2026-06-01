package STREAM;

public class chaining {
	chaining (){
		this(2);
		System.out.println("Non parameter");
	}
	chaining(int a)
	{
		this(3,4);
		System.out.println("This is our first chain");
	}
	chaining(int a, int b)
	{
		System.out.println("This is ouer second chain");
	}

	public static void main(String[] args) {
		new chaining ();
		

	}

}
