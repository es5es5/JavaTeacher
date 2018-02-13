
public class HAMain {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30, '남');
		Dog d1 = new Dog("뽀삐", 2, "진돗개");
		//h1.introduce();
		
		
		// h1.name = "김길동"; 
		h1.pet = d1;
		h1.introduce();
		
		// h1의 pet의 정보출력
		h1.pet.printInfo();
		
		// h1의 pet의 종만 출력
		System.out.println( h1.pet.type );
		System.out.println("=====");
		
		Human h2 = new Human("김길동", 20, '여');
		Dog d2 = new Dog("철수", 2, "삽살개");
		h2.pet = d2;
		System.out.println( h2.name );
		System.out.println( h2.pet.name );
		System.out.println( h2.age  );
		System.out.println( h2.pet.age );
		
		System.out.println("=====");
		
		Human h3 = new Human("최길동", 25, '남');
		h3.pet = new Dog("영희", 3, "불독");
		System.out.println(h3.name);
		System.out.println(h3.pet.name);
		
//		h3.name = "고길동";
//		
//		String t = "박길동";
//		h3.name = t;
		
		System.out.println("=====");
		Human h4 = new Human("박길동", 13, '남', new Dog("럭키", 2, "풍산개"));
		System.out.println(h4.name);
		System.out.println(h4.pet.name);
		
	}
}










