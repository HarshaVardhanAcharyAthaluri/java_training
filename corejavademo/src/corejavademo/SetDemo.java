package corejavademo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("SAMSUNG");
		hs.add("APPLE");
		hs.add("SONY");
		hs.add("PHILIPS");
		hs.add(123);
		hs.add(123);
		hs.add(true);
		hs.add(true);
		hs.add("SONY");
		System.out.println("HashSet : " + hs);
		
		Set ls = new LinkedHashSet<>();
		ls.add("SAMSUNG");
		ls.add("APPLE");
		ls.add("SONY");
		ls.add("PHILIPS");
		ls.add(123);
		ls.add(123);
		ls.add(true);
		ls.add(true);
		ls.add("SONY");
		System.out.println("LinkedHashSet : " + ls);
		
		
		Set ts = new TreeSet();
		ts.add("SAMSUNG");
		ts.add("APPLE");
		ts.add("SONY");
		ts.add("PHILIPS");
		ts.add("SONY");
		System.out.println("TreeSet : " + ts);
		
		
	}
}
