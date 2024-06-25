package com.coretraining;

public class Sample {
	
	public String message="Hello Iam Public Valiable";
	
	protected String somemsg="Hello Iam protected Valiable";
	
	String defaultmsg="Hello Iam Default Valiable";
	
	private String privatemsg="Hello Iam Private Message";
	
	public static String staticmsg="Hello Iam static Message";
	
	
	public void display() {
		System.out.println("Public Method");
	}
	
	protected void someMethod() {
		System.out.println("Protected Method");
	}

	void defaultMethod() {
		System.out.println("Default Method");
	}
	
	private void privateMethod() {
		System.out.println("private Method");
	}
	

	public void callPrivate() {
		System.out.println(privatemsg);
		privateMethod();
	}
	
	public static void  somesaticmethod() {
		System.out.println("Some static metho");
	}
}
