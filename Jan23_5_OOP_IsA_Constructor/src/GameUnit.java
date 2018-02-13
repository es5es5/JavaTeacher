// 생성자는 상속이 안됨
// 객체를 만들면 상위클래스 기본생성자를 자동으로 불러버림

public class GameUnit {
	int hp;
	int atk;
	int def;
	
	public GameUnit() {
		// TODO Auto-generated constructor stub
		System.out.println("게임유닛 기본생성자");
	}
	
	
	
	public GameUnit(int hp, int atk, int def) {
		//this(); // 이 클래스 기본 생성자 부른거
		// 자바는 원래 객체를 만들면 상위클래스 기본생성자를 자동으로 불러버림
		// 그걸 명시한 정도
		super(); // 상위 클래스 기본 생성자 부른거
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public void printInfo() {
		
		System.out.println(hp);
		System.out.println(atk);
		System.out.println(def);
	}
}





