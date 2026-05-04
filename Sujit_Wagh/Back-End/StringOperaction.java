import java.util.Scanner;

public class StringOperaction {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	String s1 = sc.next();
	System.out.println("Enter the second string");
	String s2 =sc.next();
	System.out.println("Enter the thired string");
	String s3=sc.nextLine();
	
	System.out.println("**String Length**");
	System.out.println(s1.length());
	System.out.println(s2.length());
	
	System.out.println("**String Concat **");
	System.out.println(s1.concat(s2));
	
	System.out.println("** String Equals **");
	System.out.println(s1.equals(s2));
	
	System.out.println("** String equalsignore **");
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println("** String equal **");
	System.out.println(s1==s2);
	
	System.out.println("** String UpperCase **");
	System.out.println(s1.toUpperCase());
	
	System.out.println("** String LowerCase");
    System.out.println(s2.toLowerCase());
    
    System.out.println("** String compare **");
    System.out.println(s1.compareTo(s2));
    
    System.out.println("** String Split **");
    String [] parts = s3.split("");
    
    System.out.println(parts[1]);
    System.out.println(parts[2]);
    System.out.println(parts[3]);

    System.out.println("** String Index check **");
    System.out.println(s1.charAt(0));
    
    System.out.println("** Replase String **");
    System.out.println(s1.replace('s', 'w'));
    
    System.out.println("** Replase First **");
    System.out.println(s1.replaceFirst("s", "w"));
    
    System.out.println("** Replace All");
    System.out.println(s1.replaceAll("s", "w"));
    
    System.out.println("** String Substring **");
    System.out.println(s1.substring(0,6));
    
    System.out.println("** String Contains **");
    System.out.println(s1.contains(s2));
    
    System.out.println("** Remove White Space **");
    System.out.println(s1.trim());
    
    System.out.println("** Check Start String **");
    System.out.println(s1.startsWith("s"));
    
    System.out.println("** Check Ends With **");
    System.out.println(s1.endsWith("w"));
    
    System.out.println(" ** Check Index **");
    System.out.println(s1.indexOf("s"));
    
    System.out.println("** Check String is impty **");
    System.out.println(s1.isEmpty());
    
    System.out.println(" ** Check String is intern **");
    System.out.println(s1.intern());
    
    System.out.println("** unicode White space **");
    System.out.println(s1.strip());
    
    System.out.println("** only white space count  ** ");
    System.out.println(s1.isBlank());
    
   System.out.println("** Convert the char array into string **");
   System.out.println(s1.toCharArray());
   
   System.out.println("** Check the code point of index ** ");
   System.out.println(s1.codePointAt(0));
    
    
    
	}

}
