package com.main.collactions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo3 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> set = new LinkedHashMap<String, String>();
		set.put("mahrastra", "ahilynagar");
		set.put("gujrat", "modval");
		set.put("utaarpradesh", "gondia");
		for(Map.Entry<String, String> entry:set.entrySet()) {
			System.out.println(entry.getKey()  + "  "   + entry.getValue());
		}
	}

}
