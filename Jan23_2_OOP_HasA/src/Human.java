
public class Human {
	String name;
	int age;
	char gender;
	Dog pet;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Human(String name, int age, char gender, Dog pet) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pet = pet;
	}

	public void introduce() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		// pet.printInfo();
		if(pet != null) {
			System.out.println(pet.name);
			System.out.println(pet.age);
			System.out.println(pet.type);
		}
		System.out.println("-----");
	}

}













