
public class Computer extends Product{
	String cpu;
	double ram;
	int hdd;
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
