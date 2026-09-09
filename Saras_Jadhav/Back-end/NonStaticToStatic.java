public class NonStaticToStatic {

	public static void main(String[] args) {
		NonStaticToStatic obj = new NonStaticToStatic();
		System.out.println("hello..");
		obj.mul(2,3);
   }
	public void mul(int x,int y) {
		System.out.println(x*y);
		add(10,10);
	}
	public static void add(int x, int y) {
		System.out.println(x+y);
	}
}
