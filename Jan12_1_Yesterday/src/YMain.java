import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		
		// 키보드 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		// 출력
		System.out.print("품번 : ");
		// int 변수 하나 만들어서, 키보드로 입력받은 숫자를 거기에 저장 
		int no = keyboard.nextInt();
		System.out.print("품명 : ");
		String name = keyboard.next();
		System.out.print("가격 : ");
		int price = keyboard.nextInt();
		System.out.print("무게 : ");
		double weight = keyboard.nextDouble();
		System.out.print("원산지 : ");
		String madeIn = keyboard.next();
		
		System.out.printf("%05d)--------\n", no);
		System.out.printf("\t제품명\t: \"%s\"\n", name);
		System.out.printf("\t가격\t: \"%d원\"\n", price);
		System.out.printf("\t무게\t: \"%.1fg\"\n", weight);
		System.out.printf("\tMade in %s\n", madeIn);
	}
}










