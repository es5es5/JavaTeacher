import java.util.Scanner;

public class RSMain2 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i);
//			if (i % 2 == 0) {
//				// continue; // 이번 반복 종료
//				break; // 반복문 종료
//			}
//			System.out.println("ㅋ");
//		}

		Scanner keyboard = new Scanner(System.in);

		int menu = 0;
		String name = "";
//		while (true) {
//			System.out.println("1. 상품등록");
//			System.out.println("2. 상품검색");
//			System.out.println("3. 상품조회");
//			System.out.println("4. 종료");
//			System.out.print("메뉴 : ");
//			menu = keyboard.nextInt();
//
//			if (menu == 3) {
//				continue;
//			} else if (menu == 4) {
//				break;
//			}
//
//			System.out.print("품명 : ");
//			name = keyboard.next();
//		}

		aaa : for (int i = 0; i < 3; i++) {
			bbb : while (true) {
				System.out.println("1. 상품등록");
				System.out.println("2. 상품검색");
				System.out.println("3. 상품조회");
				System.out.println("4. 종료");
				System.out.print("메뉴 : ");
				menu = keyboard.nextInt();
				
				ccc : switch (menu) {
				case 1:
					System.out.println("등록합니다.");
					break;
				case 2:
					System.out.println("검색합니다.");
					break;
				case 3:
					System.out.println("조회합니다.");
					break;
				case 4:
					System.out.println("종료합니다.");
					break aaa;
				default:
					break;
				}
				
			}
		}
		
		
	}
}















