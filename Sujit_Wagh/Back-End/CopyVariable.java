package STREAM;

public class CopyVariable {
String name;
String password;
String email;
CopyVariable(){
	System.out.println("This is our non parameter");
	
}
CopyVariable(String name,String password,String email){
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
		CopyVariable c= new CopyVariable("sujit","123","sujit@123");
		CopyVariable c2 = new CopyVariable();
		
		c.display();
		System.out.println("===========");
c2=c;
c2.display();

	}

}
