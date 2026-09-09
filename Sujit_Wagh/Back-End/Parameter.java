package STREAM;

public class Parameter {
	String name;
	String password;
	String email;
	 
	Parameter(){
		System.out.println("This is nonparameter ");
	}
	Parameter(String name,String password,String email)
	{
		this.name=name;
		this.password=password;
		this.email=email;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
	}
	public static void main(String[] args) {
		Parameter p = new Parameter("sujit","123","ram@13");
		p.display();

	}

}
