package streamlinetech.com.string;

public class EqualTo {
	
	

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("JAVA");
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
//s1==s2   both strore in string consatnt pool
//            same refresnces

//s1== s3  s3 store in heap memory 

//.equal compare value inside "java"=="java"
