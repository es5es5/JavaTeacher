
public class Baby {
	String name;
	int age;
	static final String SAY = "���";
	
	public Baby() {
		// TODO Auto-generated constructor stub
	}

	public Baby(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void play(String item) {
		System.out.println("������ ������");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
