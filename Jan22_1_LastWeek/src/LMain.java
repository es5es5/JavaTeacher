
public class LMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.name = "c-1211";
		c.jejosa = "casio";
		c.price = 10000;
		
		c.printCalculatorInfo();
		int i = 10;
		int j = 20;
		c.calculate(i, j);
		int k = c.getHab(i, j);
		System.out.println(k);
	}
}










