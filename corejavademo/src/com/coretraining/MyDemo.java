package com.coretraining;

public class MyDemo {

	public void getMessage() {
		System.out.println("MyDemo");
		
	}
	
	public static void main(String[] args) {
		Sample s =	new Sample();
		s.someMethod();
		System.out.println(s.somemsg);
		System.out.println(s.defaultmsg);
		s.defaultMethod();
	
		s.callPrivate();
		
		System.out.println(Sample.staticmsg);
		Sample.somesaticmethod();
	}
}
