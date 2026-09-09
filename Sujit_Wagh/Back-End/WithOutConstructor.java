package STREAM;

public class WithOutConstructor {
// global variable
	String name;
	String password;
	String email;
	public static void main(String[] args) {
//		WithOutConstructor w = new WithOutConstructor();
		WithOutConstructor w = new WithOutConstructor();
		w.name="sujit";
		w.password="7895";
		w.email="sujit@123";
		System.out.println(w.name);
		System.out.println(w.password);
		System.out.println(w.email);

	}

}
