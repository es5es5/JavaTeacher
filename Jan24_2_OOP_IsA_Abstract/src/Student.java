
public class Student {
	String name;
	int age;
	String phoneNo;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	public void introduce() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneNo);
	}

	public void gongboo() {
		System.out.println("공부하기");
	}
}
