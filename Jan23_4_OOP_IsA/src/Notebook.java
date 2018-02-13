
public class Notebook extends Computer{
	double weight;
	int battery;
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(weight);
		System.out.println(battery);
	}
}
