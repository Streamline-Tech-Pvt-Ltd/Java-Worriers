package com.main.Exception;

public class Test {
	
	

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Java";
		String s4="Rushi";
		String s5="Rushi";
		String s3= new String("Java");
		
		System.out.println(s1==s2);         		//s1 == s2 both storing string constant pool ; same meomery share karto therfore same refrence 
		System.out.println(s1==s3);					// false because s3 created in heap memory so diffrent refrence and diff address 
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));			//.equal comapre value inside the string "Java"  == "Java"
		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());	
		System.out.println(s4.hashCode());			//hashcode() used to check memory address of an variable;
		System.out.println(s5.hashCode());									

	}

}
