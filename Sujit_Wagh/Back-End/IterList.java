package main.in.sp;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Python");
		al.add("Java");
		al.add("MYSQL");
		al.add("SpringBoot");
		al.add("SQL");
		ListIterator<String> itr =al.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
System.out.println();
while(itr.hasPrevious())
{
	System.out.print(itr.previous()+" ");
}
	}

}
