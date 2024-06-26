package corejavademo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap(); 
		hashMap.put(1, "Joe");
		hashMap.put(2, "Ross");
		hashMap.put(3, "Chandler");
		hashMap.put(4, "Monika");
		hashMap.put(5, "Pheebe");
		hashMap.put(6, "Rachel");
		System.out.println("HashMap : "+ hashMap);
		
		Map<Integer, String> lm = new LinkedHashMap<>(); 
		lm.put(1, "Joe");
		lm.put(2, "Ross");
		lm.put(4, "Monika");
		lm.put(6, "Rachel");
		lm.put(3, "Chandler");
		lm.put(5, "Pheebe");
		System.out.println("LinkedHashMap : "+ lm);
		
		Map<Integer, String> tm = new TreeMap(); 
		tm.put(1, "Joe");
		tm.put(2, "Ross");
		tm.put(4, "Monika");
		tm.put(6, "Rachel");
		tm.put(3, "Chandler");
		tm.put(5, "Pheebe");
		System.out.println("TreeMap : "+ tm);
		
		Map<Integer, String> ht = new Hashtable<>(); 
		ht.put(1, "Joe");
		ht.put(2, "Ross");
		ht.put(4, "Monika");
		ht.put(6, "Rachel");
		ht.put(3, "Chandler");
		ht.put(5, "Pheebe");
		ht.put(5, "someuser");
		ht.put(6, "ganthar");
		ht.put(7, "ganthar");
		System.out.println("HashTable : "+ ht);
		
		
		
	}
	
}
