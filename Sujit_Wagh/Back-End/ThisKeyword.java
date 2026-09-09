package STREAM;

public class ThisKeyword {
String name;
String password;
String email;
void setUser(String name, String password , String email)
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
		ThisKeyword t = new ThisKeyword();
		ThisKeyword t1 = new ThisKeyword();
		
		t.setUser("sahil", "54637","shil@123");
		t.display();
		
       System.out.println("============");
       t1.name="sujit";
       t1.password="123";
       t1.email="sujit@123";
       t1.display();

	}

}
