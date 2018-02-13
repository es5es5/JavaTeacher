
public class Zealot extends GameUnit{
	int shield;
	
	public Zealot() {
		// TODO Auto-generated constructor stub
	}

	public Zealot(int hp, int atk, int def, int shield) {
		super(hp, atk, def);
		this.shield = shield;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(shield);
	}
}
