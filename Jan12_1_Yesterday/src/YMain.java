import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		
		// Ű���� �Է� ���� �غ�
		Scanner keyboard = new Scanner(System.in);
		// ���
		System.out.print("ǰ�� : ");
		// int ���� �ϳ� ����, Ű����� �Է¹��� ���ڸ� �ű⿡ ���� 
		int no = keyboard.nextInt();
		System.out.print("ǰ�� : ");
		String name = keyboard.next();
		System.out.print("���� : ");
		int price = keyboard.nextInt();
		System.out.print("���� : ");
		double weight = keyboard.nextDouble();
		System.out.print("������ : ");
		String madeIn = keyboard.next();
		
		System.out.printf("%05d)--------\n", no);
		System.out.printf("\t��ǰ��\t: \"%s\"\n", name);
		System.out.printf("\t����\t: \"%d��\"\n", price);
		System.out.printf("\t����\t: \"%.1fg\"\n", weight);
		System.out.printf("\tMade in %s\n", madeIn);
	}
}










