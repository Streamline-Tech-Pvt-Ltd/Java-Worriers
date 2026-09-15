public class NonStaticToNonStatic {

	public static void main(String[] args) {
		NonStaticToNonStatic obj = new NonStaticToNonStatic();
		System.out.println("hello..");
        obj.add(6,6);
	}
	public void add(int x, int y) {
	  System.out.println(x+y);
	  sub(6,5);
	}
	public void sub(int x, int y) {
		  System.out.println(x-y);
}
}