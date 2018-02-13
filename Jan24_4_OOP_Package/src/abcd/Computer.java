package abcd;

public class Computer extends Product {
	String cpu;
	double ram;
	int hdd;

	public Computer() {
	}

	public Computer(String name, int price, String cpu, double ram, int hdd) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}

}
