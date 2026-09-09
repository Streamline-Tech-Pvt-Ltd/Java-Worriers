package STREAM;

public class WithConstructor {
String name;
String password;
String email;

void setUser(String n , String p , String e)
{
name=n;
password=p;
email=e;
	
}
void display() {
	System.out.println(name);
	System.out.println(password);
	System.out.println(email);
}
	public static void main(String[] args) {
		WithConstructor w = new WithConstructor();
		w.setUser("sujit", "123", "soifhuehf");
		w.display();
	}

}
