
public class Chicken extends Menu{
	public Chicken() {
		// TODO Auto-generated constructor stub
	}

	public Chicken(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printDesc() {
		System.out.println("국내산 기름으로...");
	}
}
