package corejavademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		List al = new ArrayList();		
		al.add("SAMSUNG");
		al.add("APPLE");
		al.add("SONY");
		al.add("PHILIPS");
		al.add(123);
		al.add(true);
		al.add("SONY");
		System.out.println("ArrayList: "+al);
		
		Iterator ir = al.iterator();
		System.out.println("Iteration :::: ");
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
		
		List ll = new LinkedList();
		ll.add("SAMSUNG");
		ll.add("APPLE");
		ll.add("SONY");
		ll.add("PHILIPS");
		ll.add(123);
		ll.add(true);
		ll.add("SONY");
		System.out.println("LinkedList: "+ll);
		
		List v = new Vector();
		v.add("SAMSUNG");
		v.add("APPLE");
		v.add("SONY");
		v.add("PHILIPS");
		v.add(123);
		v.add(true);
		v.add("SONY");
		System.out.println("Vector : "+ll);
		
		List s = new Stack();
		s.add("SAMSUNG");
		s.add("APPLE");
		s.add("SONY");
		s.add("PHILIPS");
		s.add(123);
		s.add(true);
		s.add("SONY");
		System.out.println("Stack : "+ll);

	}

}
