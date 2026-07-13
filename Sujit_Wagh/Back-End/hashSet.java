package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashSet {

	public static void main(String[] args) {
		HashSet<Object> hs= new HashSet<Object>();
		hs.add(1);
		hs.add("ram");
		hs.add("ram");
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(45.2f);
		hs.add(45.2f);
		// simple printing method
System.out.println(hs);
		// for loop printing 
		for(int i=0;i<hs.size();i++)
		{
			System.out.println(i);
		}
		// printing method in for each loop
		for(Object i :hs)
		{
			System.out.println(hs);
		}
// printing in iterator
		Iterator<Object> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	// method
		System.out.println(hs.size());
		System.out.println(hs.remove(1));
		System.out.println(hs.equals(45.2f));
		System.out.println(hs.hashCode());
		
		
	}

}
