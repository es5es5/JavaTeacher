
public class Ironman extends Avengers {
	public Ironman() {}
	public Ironman(String name, int age) {
		super(name, age);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println("¼Õ¿¡¼­ ºö");
	}
}
