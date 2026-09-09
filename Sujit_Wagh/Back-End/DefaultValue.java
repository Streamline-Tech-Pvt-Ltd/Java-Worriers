package STREAM;

public class DefaultValue {
	String name;
	String password;
	String email;
	
	DefaultValue(){
		System.out.println("The default constructer");
	}
	DefaultValue(String name, String password,String email) {
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
		DefaultValue d = new DefaultValue("ram","ram123","Ram@123");
		d.display();
		DefaultValue d1 = new DefaultValue();
		d1.display();
		

	}

}
