
public class OMain2 {
	public static void main(String[] args) {
		Human h = new Human();
		System.out.println(h);
		
		h.name = "홍길동";
		h.age = 30;
		h.introduce();
		
		Human h2 = h;
		System.out.println(h2);
		h2.name = "김길동";
		h.introduce();
		
		h2 = null; // 참조형 변수속에 있는 번지값 지워
		System.out.println(h2);
		h.name = "최길동";
		
		h = null; // Garbage Collection 발동
		
		// Garbage Collection
		//		heap영역 자동 정리
		//		그 번지를 더이상 가리키는 변수가 없을때
	}
}













