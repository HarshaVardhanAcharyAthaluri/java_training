package corejavademo;

public class ExceptionDemo {
	
	public void calcuation(int a, int b){
		System.out.println("Calculation Started");
		
			float res = a/b;
			System.out.println(" devison of "+ a + " & "+b+" = "+res);
		
		System.out.println("Calculation Completed");
		System.out.println("LOGIC 1");
		System.out.println("LOGIC 2");
		System.out.println("LOGIC 3");
		System.out.println("LOGIC 4");
	}
	
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			ed.calcuation(a, b);
			
	}
	

}
