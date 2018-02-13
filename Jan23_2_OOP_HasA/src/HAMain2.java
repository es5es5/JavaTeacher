
public class HAMain2 {
	public static void main(String[] args) {
		Company c1 = new Company("삼성", 1900, "수원");
		Product p1 = new Product("갤럭시s", 100000, c1);
		p1.printInfo();
		System.out.println(p1.price);
		System.out.println(p1.jejosa.year);
		
		System.out.println("===========");
		
		Product p2 = new Product(
					"아이폰3s", 
					100000, 
					new Company("애플", 1901, "미국")
					);
		p2.printInfo();
		System.out.println(p2.jejosa.location);
		
		System.out.println("=============");
		
		Product p3 = new Product("XX폰", 50000);
		p3.printInfo();
		
		
		
		
	}
}












