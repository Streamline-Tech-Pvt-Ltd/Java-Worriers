
package main.in.sp;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterat {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Python");
		al.add("Java");
		al.add("MYSQL");
		al.add("SpringBoot");
		al.add("SQL");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
