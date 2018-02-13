
public class Company {
	String name;
	int year;
	String location;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int year, String location) {
		super();
		this.name = name;
		this.year = year;
		this.location = location;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(year);
		System.out.println(location);
	}
}
