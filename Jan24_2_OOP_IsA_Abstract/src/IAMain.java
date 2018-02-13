
public class IAMain {
	public static void main(String[] args) {
		Kwon k = new Kwon("", 32, "010");
		k.introduce();
		k.gongboo();
		k.hyodo();
		k.play();
		
		Smoker s = new Smoker() {

			@Override
			public void smoke() {
				// TODO Auto-generated method stub
				System.out.println("담배 피우기");
			}
		};
		// Smoker인터페이스를 구현하는, 클래스명은 모르겠는 객체
		s.smoke();

		Ironman i = new Ironman("토니", 40);
		i.print();
		i.attack();
		i.smoke();
		i.playGame();

		Hulk h = new Hulk("배너", 30);
		h.print();
		h.attack();

		// 익명 내부 클래스(anonymous inner class)
		Avengers a = new Avengers() {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("방패 던지기");
			}
		};

		// Avengers의 하위 클래스, 클래스명??? 로 만든 객체 : a
		// a는 캡틴아메리카려니
		a.attack();

		Menu m = new Menu() {
			@Override
			public void printDesc() {
				// TODO Auto-generated method stub
				System.out.println("국내산 돼지 뒷다리만 써서...");
			}
		};
		// Menu로 부터 상속받는 클래스명은 밝혀지지 않은 m
		m.name = "족발A세트";
		m.price = 29000;
		m.printInfo();
		m.printDesc();

	}
}
