package com.main.collactions; 
import java.util.HashMap;
import java.util.Map;


public class Demo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> set = new HashMap<>();
		set.put(1," om");
		set.put(2,"sai");
		set.put(3, "null");
		//set.put(1," ram");  update values same key  pass diff name 
		
		//System.out.println(set.containsKey(2));
//		System.out.println(set.remove(2));
//		System.out.println(set.size());
	//	System.out.println(set.keySet());
		for (String values : set.values()) {  //for print only the values
			System.out.println(values);
			
		}
		
//		for(Integer keyInteger : set.keySet()) {   //for only prints the keys 
//			System.out.println(key);
//		}
//		
		//System.out.println(set.get(2));//specific key cheack
		
		for(Map.Entry<Integer, String> entry:set.entrySet()) {
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		

	}

}
