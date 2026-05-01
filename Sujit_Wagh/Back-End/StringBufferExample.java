import java.util.Scanner;

public class StringBufferExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		
		StringBuffer s1 = new StringBuffer();
		
		System.out.println(s1.append("+wagh"));
		System.out.println(s1.reverse());
		System.out.println(s1.replace(1,3,"###" ));
		System.out.println(s1.insert(2, "t"));
		System.out.println(s1.delete(1, 2));
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		

	}

}
