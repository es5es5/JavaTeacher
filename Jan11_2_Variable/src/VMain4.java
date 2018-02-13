import java.util.Scanner;

public class VMain4 {
	public static void main(String[] args) {
		
		// 키보드 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
		// 키보드로 적은 숫자가 변수 age에 저장
		int age = keyboard.nextInt();
		
		System.out.print("나이는 ");
		System.out.print(age);
		System.out.println("살");
	}
}








