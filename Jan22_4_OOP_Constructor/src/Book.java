
public class Book {
	String title;
	int price;
	String choolpansa;

	public Book(String title, int price, String choolpansa) {
		super();
		this.title = title;
		this.price = price;
		this.choolpansa = choolpansa;
	}

	public void print() {
		System.out.println(title);
		System.out.println(price);
		System.out.println(choolpansa);
	}

}
