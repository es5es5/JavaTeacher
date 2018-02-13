
public class VMain {
	public static void main(String[] args) {
// 변수란
		// 프로그램 진행되다가 발생하는 데이터들을 임시로 저장하는 장소
		// 데이터 담는 그릇
		// 데이터는 수정 가능함
		
// 문법
		// 변수 만들기
		//		자료형(그릇종류) 변수명(그릇이름);
		
		// 변수명
		//		자유
		//		자바 문법은 안됨(예약어)
		//		숫자로 시작x
		//		특수문자 _만($도 가능은 함)
		
		//		의미 전달은 되어야
		//		소문자로 시작
		//		한글 피하고
		//		띄어쓰기 대신 _ or 중간중간대문자(낙타체)	
		//		자바 문법을 정 써야겠으면 앞자리에 _
		
		// 자료형
		//		정수형(소수점 없는 숫자)
		
		//	내 나이를 저장
		int myAge; // 그릇 만든거
		myAge = 52; // 그릇에 32 담은거
		
		System.out.println("myAge"); // myAge라는 글자 출력
		System.out.println(myAge); // myAge변수에 들어있는거 출력
		
		// 핸드폰 가격 저장
		int phonePrice = 300000;	// 변수 만들면서 초기화까지
		
		System.out.print("폰 가격 : ");		
		System.out.print(phonePrice); 
		System.out.println("원");	// 출력
		
		// 신발 사이즈
		int shoesSize; // 변수 만들기
		shoesSize = 265; // 최초 값 넣기(초기화)
						// 변수는 초기화 한 후에 사용해야 함
		
		System.out.print("신발 사이즈 : ");
		System.out.print(shoesSize);
		System.out.println("mm");
		
		shoesSize = 270;
		
		System.out.print("신발 사이즈 : ");
		System.out.print(shoesSize);
		System.out.println("mm");
		
	}
}


















