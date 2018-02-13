
public class OSMain2 {
	public static void main(String[] args) {
		Product.testMethod();
		// Product.printInfo();
		
		Product p1 = new Product();
		p1.name = "아이폰x";
		p1.price = 1000000;
		p1.printInfo();
		
		Product p2 = new Product();
		p2.name = "iMac";
		p2.price = 2000000;
		p2.printInfo();
		
		Product p3 = new Product();
		p3.name = "아이패드";
		p3.price = 800000;
		p3.printInfo();
	}
}
