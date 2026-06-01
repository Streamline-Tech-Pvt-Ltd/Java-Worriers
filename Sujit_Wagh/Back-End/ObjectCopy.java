package STREAM;

public class ObjectCopy {
String name;
String password;
String email;
ObjectCopy (){
	System.out.println("Non Parameter");
}
ObjectCopy(String name, String password,String email)

{
this.name=name;
this.password=password;
this.email=email;


}
ObjectCopy(ObjectCopy u)
{
	this.name=u.name;
	this.password=u.password;
	this.email=u.email;
	
}
void display() {
	System.out.println(name);
	System.out.println(password);
	System.out.println(email);
}
public static void main(String[] args) {
		
	ObjectCopy u = new ObjectCopy("sujit","123","sujitwagh@532gmail.com");
	u.display();
	System.out.println("==========");
	ObjectCopy u1= new ObjectCopy(u);
	u1.display();
	}

}
