
public class Cat {
	String name;
	int age;

	// 생성자 오버로딩
	public Cat(String n, int a) {
		name = n;
		age = a;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(age);
	}
}
