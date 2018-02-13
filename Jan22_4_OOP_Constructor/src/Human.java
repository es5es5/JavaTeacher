
public class Human {
	// 멤버변수
	String name;
	String gender;
	public Human() {
		System.out.println("응애");
	}
	
	// 나머지 메소드
	public void changeName(String name) {
		// 자바는 멤버변수, 지역변수 이름 같다고 에러가 아님
		// 가까운걸 우선
		//System.out.println(name);
		// 멤버변수, 지역변수 이름 같을때 구별 하고 싶으면
		//System.out.println(this.name);
		
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(gender);
	}
	
}













