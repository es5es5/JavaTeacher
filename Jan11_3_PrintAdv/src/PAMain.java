import java.util.Scanner;

// \t : 탭키 
// \n : new line(줄만바꿈) : 
// \r : carriage return(커서를 맨 앞으로)
// 제대로 줄바꾸기를 원하면 \r\n으로 적어야

// \b : 1byte 분량의 글자 지우기
//		(자바는 한글자가 2byte라서 제대로 작동 안됨)

// \\ : \출력
// \" : "출력

// 출력형식을 잡을때 사용 System.out.printf();
// %d : 정수형 변수 값 들어올 자리 - %05d : 5자리를 보장
// %f : 실수형 변수 값 들어올 자리 - %.2f : 소수점 이하 2자리
// %s : String 변수 값 들어올 자리
public class PAMain {
	public static void main(String[] args) {
		
//		int a = 13;
//		double b = 10.155555;
//		String c = "abc";
//		
//		System.out.printf("a의 값은 %d이요\nb는 %f요\nc는 %s요\n", a, b, c);
//		System.out.printf("a는 %03d이다\n", a);
//		System.out.printf("b는 %.2f다\n", b);
		
		// 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = keyboard.next();
		
		System.out.print("나이 : ");
		// xxx 변수명 = keyboard.nextXxx();
		// 나이를 입력할건데, 그걸 임시로 저장할 공간 만들어야 할 상황
		int age = keyboard.nextInt();
		
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		
		System.out.println("--------------");
		
		// printf를 써야 %d시리즈를 사용가능
		System.out.printf("이름\t: \"%s\"\n", name);
		System.out.printf("나이\t: \"%03d살\"\n", age);
		System.out.printf("키\t: \"%.1fcm\"\n", height);
		System.out.printf("몸무게\t: \"%.1fkg\"\n", weight);
	}
}













