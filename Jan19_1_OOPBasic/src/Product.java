
public class Product {
	// 멤버변수(member variable) : 메소드 밖에서 만든 변수
	// 초기화 할 필요 없음 
	// 따로 값을 넣지 않으면 기본형은 0으로, 참조형들은 null로 자동 초기화
	String name;
	int price;
	String madeIn;
	
	public void showInfo() {
		int test = 0; // 지역변수(local variable) : 메소드 안에서 만든 변수
				      // 반드시 초기화 하고 사용해야
		System.out.println(test);
		
		System.out.printf("품명 : %s\n", name);
		System.out.println(price);
		System.out.println(madeIn);
		System.out.println("-----------------");
	}
}
