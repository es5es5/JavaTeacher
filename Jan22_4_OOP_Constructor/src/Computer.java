
public class Computer {
	double cpu;
	double ram;
	int hdd;

	// 기본 생성자 : 생성자를 전혀 건들지 않으면 자동으로 만들어줌
	// 		JSP, Spring, ...이 자동으로 객체를 만들때 기본생성자를 사용
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(double cpu, double ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
