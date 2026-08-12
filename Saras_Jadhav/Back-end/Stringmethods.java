package streamlinetech.com.string;

public class Stringmethods {

	public static void main(String[] args) {
		String s1= "saras";
		String s2= "saras";
		String s3= "java is a computer lauguae";
		
		System.out.println(s1.length());
		
		System.out.println("========================================================================================");
		
		System.out.println(s1.concat(s2));
		
		System.out.println("========================================================================================");
		
		System.out.println(s1.equals(s2));
		
		System.out.println("========================================================================================");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("========================================================================================");
	
	    System.out.println("Uppercase:"+" " +s1.toUpperCase());
	    
	    System.out.println("========================================================================================");
	
	    System.out.println("lowercase:"+" " +s1.toLowerCase());
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println("Compare:"+" "+s1.compareTo(s2));
	    
	    System.out.println("========================================================================================");
	    
	    String[] parts = s3.split(" ");
	    System.out.println(parts[0]);
	    System.out.println(parts[1]);
	    System.out.println(parts[2]);
	    System.out.println(parts[3]);
	    System.out.println(parts[4]);
	
	    System.out.println("========================================================================================");
	
	    System.out.println(s1.charAt(0));
	    System.out.println(s1.charAt(1));
	    System.out.println(s1.charAt(2));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.replace('s', 'j'));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.replaceFirst("s","j"));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.replaceAll("s","j"));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.contains("saras"));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.trim());
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.startsWith("s"));
	    System.out.println(s1.endsWith("a"));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.indexOf('1'));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.compareTo(s2));
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.isEmpty());
	    
	    System.out.println("========================================================================================");
	    
	    System.out.println(s1.intern());
	}

}
