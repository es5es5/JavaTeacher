import java.util.Scanner;

public class RSMain2 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i);
//			if (i % 2 == 0) {
//				// continue; // �̹� �ݺ� ����
//				break; // �ݺ��� ����
//			}
//			System.out.println("��");
//		}

		Scanner keyboard = new Scanner(System.in);

		int menu = 0;
		String name = "";
//		while (true) {
//			System.out.println("1. ��ǰ���");
//			System.out.println("2. ��ǰ�˻�");
//			System.out.println("3. ��ǰ��ȸ");
//			System.out.println("4. ����");
//			System.out.print("�޴� : ");
//			menu = keyboard.nextInt();
//
//			if (menu == 3) {
//				continue;
//			} else if (menu == 4) {
//				break;
//			}
//
//			System.out.print("ǰ�� : ");
//			name = keyboard.next();
//		}

		aaa : for (int i = 0; i < 3; i++) {
			bbb : while (true) {
				System.out.println("1. ��ǰ���");
				System.out.println("2. ��ǰ�˻�");
				System.out.println("3. ��ǰ��ȸ");
				System.out.println("4. ����");
				System.out.print("�޴� : ");
				menu = keyboard.nextInt();
				
				ccc : switch (menu) {
				case 1:
					System.out.println("����մϴ�.");
					break;
				case 2:
					System.out.println("�˻��մϴ�.");
					break;
				case 3:
					System.out.println("��ȸ�մϴ�.");
					break;
				case 4:
					System.out.println("�����մϴ�.");
					break aaa;
				default:
					break;
				}
				
			}
		}
		
		
	}
}















