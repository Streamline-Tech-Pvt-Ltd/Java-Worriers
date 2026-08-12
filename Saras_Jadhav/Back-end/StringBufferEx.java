package streamlinetech.com.string;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer ("Hello");
		
		System.out.println(buf.append("+wold"));
		System.out.println(buf.reverse());
		System.out.println(buf.replace(2, 4, "**"));
		System.out.println(buf.insert(5, "$"));

	}

}
