package corejavademo;

public final class Product {
	
 public String name = "Mobile";
	
	public void discount(int price,int disc) {
		
		float offer = price/100*(disc);
		float finalprice = price - offer; 
		System.out.println(" After Disc of "+disc + " ::: "+ finalprice);
	}

}
