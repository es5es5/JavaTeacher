
public class OMain {
	public static void main(String[] args) {
		// 개 나이가 3살
		//int age = 3;
		//System.out.println(age);
		
		// 개 이름이 뽀삐
		//String name = "뽀삐";
		//System.out.println(name);
		
		// 개 몸무게가 3.5
		//double weight = 3.5;
		//System.out.println(weight);
		
		// 나이가 3살이고, 이름이 뽀삐이고, 몸무게가 3.5인 개
		// 실생활에 존재하는 어떤것 : 객체
		// 객체를 만들려면 : 클래스 만드는게 먼저
		
		// 클래스명 변수명 = new 클래스명();
		Dog d1 = new Dog();
		d1.name = "뽀삐";
		d1.age = 3;
		d1.weight = 3.5;
		d1.bark();
		d1.printInfo();
		
		Dog d2 = new Dog();
		d2.name = "철수";
		d2.age = 4;
		d2.weight = 2.5;
		d2.bark();
		d2.printInfo();
		
		// 컴퓨터
			// cpu
			// ram
			// hdd
		
		// cpu가 3G, ram 4G, hdd 128G
		Computer c1 = new Computer();
		c1.cpu = 3;
		c1.ram = 4;
		c1.hdd = 128;
		c1.printInfo();
		
		// cpu가 2.5G, ram 8G, hdd 256G
		Computer c2 = new Computer();
		c2.cpu = 2.5;
		c2.ram = 8;
		c2.hdd = 256;
		c2.printInfo();
		
	}
}















