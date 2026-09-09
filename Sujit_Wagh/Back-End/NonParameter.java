package STREAM;

public class NonParameter {
	String name;
	String password;
	String email;
	
	NonParameter(){
		
	}
	void setUser(String name, String password,String email) {
		this.name=name;
		this.password=password;
		this.email=email
		;
	}
	void display() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
	}

	public static void main(String[] args) {
		NonParameter n = new NonParameter();
		n.setUser("sujit","123","sujit@23");
		n.display();

	}

}
