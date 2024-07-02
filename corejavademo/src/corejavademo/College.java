package corejavademo;

public class College implements Runnable{
    int seats;
	
    public College(int seats) {
		this.seats = seats;
	}
    
    
    public synchronized void allotment() {
    	Thread t = Thread.currentThread();
		String student= t.getName();
		System.out.println("Seats Before Allottment to ::: "+student + " seats:::: "+seats);
		if(seats>0) {
			
			try {
				Thread.sleep(2000);
				System.out.println("Congratuallations Seat Alloted to ::: "+ student);
				seats = seats-1;
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Sorry Not able to allot the seat to ::: "+ student);			
		}
		System.out.println("Seats left after Allotment ::: "+ seats);
    }
    
	@Override
	public void run() {
		this.allotment();
	}
	
	public static void main(String[] args) {
		College c= new College(1);
		
		Thread t1 = new Thread(c);
		t1.setName("Student1");
		t1.start();
		Thread t2 = new Thread(c);
		t2.setName("Student2");
		t2.start();

		
	}

}
