
public class HAMain {
	public static void main(String[] args) {
		// 홍길동, 20살은 신발을 
		// 나이키에서 만든 에어조던12 260mm를 신는데, 
		// 나이키는 서울에 있고,
		// 서울시장은 박원순, 60살이고 신발을,
		// 랜드로바에서 만든 버팔로캐쥬얼 265mm를 신는다.
		Company co0 = new Company("랜드로바", null);
		Shoes s1 = new Shoes("버팔로캐쥬얼", 265, co0);
		Human h1 = new Human("박원순", 60, s1);
		City c1 = new City("서울", h1);
		Company co1 = new Company("나이키", c1);
		Shoes s2 = new Shoes("에어조던12", 260, co1);
		Human h2 = new Human("홍길동", 20, s2);
		
		// h2의 이름
		System.out.println(h2.name);
		// h2 신발의 사이즈
		System.out.println(h2.shoes.size);
		// h2 신발 메이커 이름
		System.out.println(h2.shoes.maker.name);
		// h2 신발 메이커의 위치
		System.out.println(h2.shoes.maker.location.name);
		// h2 신발 메이커가 있는 도시 시장 이름
		System.out.println(h2.shoes.maker.location.mayor.name);
		// h2 신발 메이커가 있는 도시 시장이 신는 신발 이름
		System.out.println(h2.shoes.maker.location.mayor.shoes.name);
		// h2 신발 메이커가 있는 도시 시장이 신는 신발 메이커
		System.out.println(h2.shoes.maker.location.mayor.shoes.maker.name);
	}
}







