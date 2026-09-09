public class StaticToNonStatic {

	public static void main(String[] args) {
		StaticToNonStatic obj = new StaticToNonStatic();
		System.out.println("Hello World...");
        obj.sub(11,5);
	}
	public void sub(int x, int y) {
		System.out.println(x-y);
	
	}
}
