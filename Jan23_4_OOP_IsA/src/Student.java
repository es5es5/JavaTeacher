// @xxx : 정식 자바문법x, 자바문법으로 해결해야 될거를 자동으로 해결
// @Override : 바로 밑에 있는 메소드가 오버라이딩 된 메소드임을 보장 

// Student is a Human(o) : 상속 
public class Student extends Human{
	// Human클래스에 만들어놓은거 다 물려받아서 사용가능
	int korScore;
	
	// introduce()메소드는 Human에서 상속 받아와서 기본적으로 사용 가능
	// 물려받아온 introduce()메소드가 기능이 부족
	// introduce()메소드를 재정의 : 오버라이딩(overriding)
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(korScore);
	}
	
	public void doYaja() {
		System.out.println("야자");
	}
	
}








