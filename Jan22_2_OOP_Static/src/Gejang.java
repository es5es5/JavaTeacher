// static 멤버변수 : 공통속성
//					- 메모리 절약
//					- 실제 객체가 없어도 사용 가능
public class Gejang {
	// 1. 안넣어도 되니까
	// 2. 무슨 의미가 있나(게장마다 값이 다 다른데)
	String name;
	int price;
	double weight;
	static String producer = "김수미";
	static final String PRODUCER2 = "김수미"; // 멤버 상수
	static Location madeIn = new Location();	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(producer);
		System.out.println(PRODUCER2);
		System.out.println(madeIn);
		System.out.println("-----");
	}
	
}




