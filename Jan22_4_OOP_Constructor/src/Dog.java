
public class Dog {
	String name;
	int age;
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void changeAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
