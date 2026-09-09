package src.in.sp;
class GrandFather{
	void Properties() {
		System.out.println("The Grand Father Properties is 500cr");
	}
}
class partent extends GrandFather{
	void Properties() {
		super.Properties();
		System.out.println("The Partent properties is 1000cr");
	}
}
class child extends partent{
	
	void Properties() {
		System.out.println("The Child Properties is 200cr");
		super.Properties();
	}
}
public class MultiLevelInher {

	public static void main(String[] args) {
child ch = new child();
ch.Properties();

	}

}
