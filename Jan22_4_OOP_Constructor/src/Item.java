
public class Item {
	String name;
	int price;
	static String madeIn = "중국";
	
	// 기본 생성자(constructor)
	//		직접 만들어 놓지 않으면 자동으로 만들어줌
	public Item() {
		// 객체가 만들어질때 하고 싶은거
		System.out.println("새로운 상품이 등록됨");
	}
	
	public void printItem() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(madeIn);
		System.out.println("-----");
	}
}
