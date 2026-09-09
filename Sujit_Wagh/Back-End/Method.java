public package map;

import java.util.HashMap;
import java.util.Map;

public class Method {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Sujit");
		map.put(2, "Sahil");
		map.put(3, "kishor");
		map.put(4, "akash");
		// print the only key  
		for(Integer m:map.keySet()) {
			System.out.println(m);
		}
		// print the only values
		for(String m:map.values())
		{
			System.out.println(m);
		}
		// print the key and values
		for(Map.Entry<Integer, String>ma:map.entrySet())
		{
			System.out.println(ma.getKey()+":"+ma.getValue());
		}
		// contains Method 
		System.out.println(map.containsKey(map));
		// is empty 
		System.out.println(map.isEmpty());
	}

}
 Method {
    
}
