
public class Dog {
	String name;
	int age;
	String type;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
		System.out.println("-----");
	}
}
