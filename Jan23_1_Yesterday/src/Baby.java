
public class Baby {
	String name;
	int age;
	static final String SAY = "울기";
	
	public Baby() {
		// TODO Auto-generated constructor stub
	}

	public Baby(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void play(String item) {
		System.out.println("입으로 가져가");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
