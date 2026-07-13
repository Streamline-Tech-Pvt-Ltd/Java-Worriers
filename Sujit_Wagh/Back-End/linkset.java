package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class linkset {

	public static void main(String[] args) {
		LinkedHashSet<Object> li = new LinkedHashSet<Object>();
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(null);
		li.add(null);
		li.add(45.2f);
		li.add(45.2f);
		li.add("ram");
		li.add("ram");
		// simple printing
		System.out.println(li);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(i);
		}
//		
//		printing in for each loop
		for(Object i:li)
		{
			System.out.println(i);
		}
		// printing in iterator
		Iterator<Object> itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// method
		System.out.println(li.size());
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.isEmpty());
		System.out.println(li.equals(li));
		System.out.println(li.contains("ram"));
		System.out.println(li.remove(1));
		System.out.println(li);
		
	}

}
