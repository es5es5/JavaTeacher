
public class Product {
	String name;
	int price;
	Company jejosa;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, Company jejosa) {
		super();
		this.name = name;
		this.price = price;
		this.jejosa = jejosa;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);

		if (jejosa != null) {
			jejosa.printInfo();	
		}
		
		System.out.println("-----");
	}
	
}








