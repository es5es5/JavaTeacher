
public class HAMain2 {
	public static void main(String[] args) {
		Company c1 = new Company("�Ｚ", 1900, "����");
		Product p1 = new Product("������s", 100000, c1);
		p1.printInfo();
		System.out.println(p1.price);
		System.out.println(p1.jejosa.year);
		
		System.out.println("===========");
		
		Product p2 = new Product(
					"������3s", 
					100000, 
					new Company("����", 1901, "�̱�")
					);
		p2.printInfo();
		System.out.println(p2.jejosa.location);
		
		System.out.println("=============");
		
		Product p3 = new Product("XX��", 50000);
		p3.printInfo();
		
		
		
		
	}
}












