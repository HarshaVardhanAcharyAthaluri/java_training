package corejavademo;

public class ThreadDemo implements Runnable{

	private String name;
	
	public ThreadDemo(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+ " Number :: "+ i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo("THREAD 1");
		
		Thread t1 = new Thread(td);
		t1.start();
		
		ThreadDemo td1 = new ThreadDemo("THREAD 2");
		Thread t2 = new Thread(td1);
		t2.start();
	}
}
