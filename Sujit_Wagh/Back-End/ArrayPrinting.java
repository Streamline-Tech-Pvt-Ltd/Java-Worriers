package main.in.sp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayPrinting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("SpringBoot");
		al.add("MYSQL");
		al.add("Java");
		al.add("Python");
	
		// looping print for loop print indexing of number
		for(int i=0;i<al.size();i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(String s:al)
		{
			System.out.println(s);
		}
		
		
	}

}
