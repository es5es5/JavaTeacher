// static 메소드 : 객체 없이 사용 가능한 메소드
public class Product {
	String name;
	int price;
	static final String JEJOSA = "애플";
	
	// static메소드에서 static이 아닌거에 접근 불가능
	public static void testMethod() {
		//System.out.println(name);
		System.out.println(JEJOSA);
		System.out.println("테스트");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(JEJOSA);
		System.out.println("-----");
	}
	
}
