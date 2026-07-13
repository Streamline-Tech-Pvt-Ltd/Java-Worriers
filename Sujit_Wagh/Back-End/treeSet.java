package Set;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(1);
		tr.add(2);
		tr.add(3);
		tr.add(1);
		tr.add(2);
		tr.add(0);
//		tr.add(null);
//		tr.add(null);
		tr.add(-44);
	System.out.println(tr);
		for(int i=0;i<tr.size();i++)
		{
			System.out.println(i);
		}
		for(Integer i:tr)
		{
			System.out.println(i);
		}
		Iterator<Integer> itr = tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// Method
		System.out.println(tr.size());
		System.out.println(tr.contains(1));
		System.out.println(tr.isEmpty());
		System.out.println(tr.getFirst());
		System.out.println(tr.getLast());
		System.out.println(tr.remove(1));
		System.out.println(tr);
		System.out.println(tr.equals(tr));
		tr.clear();
		System.out.println(tr);

		

	}

}
