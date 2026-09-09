package STREAM;

public class anonymous {
	String name;
	String password;
	String email;
	
	anonymous  (){
		System.out.println("This is non parameter");
	}
	anonymous(String name, String password, String email)
	{
		this.name=name;
		this.password=password;
		this.email=email;
		display();
	}
	void display() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
		
	}

	public static void main(String[] args) {
		new anonymous ("Sujit","123","sujit@123");
	    new anonymous ("sahil","456","sahil@123");

	}

}
