import java.util.Scanner;

// \t : ��Ű 
// \n : new line(�ٸ��ٲ�) : 
// \r : carriage return(Ŀ���� �� ������)
// ����� �ٹٲٱ⸦ ���ϸ� \r\n���� �����

// \b : 1byte �з��� ���� �����
//		(�ڹٴ� �ѱ��ڰ� 2byte�� ����� �۵� �ȵ�)

// \\ : \���
// \" : "���

// ��������� ������ ��� System.out.printf();
// %d : ������ ���� �� ���� �ڸ� - %05d : 5�ڸ��� ����
// %f : �Ǽ��� ���� �� ���� �ڸ� - %.2f : �Ҽ��� ���� 2�ڸ�
// %s : String ���� �� ���� �ڸ�
public class PAMain {
	public static void main(String[] args) {
		
//		int a = 13;
//		double b = 10.155555;
//		String c = "abc";
//		
//		System.out.printf("a�� ���� %d�̿�\nb�� %f��\nc�� %s��\n", a, b, c);
//		System.out.printf("a�� %03d�̴�\n", a);
//		System.out.printf("b�� %.2f��\n", b);
		
		// Ű���� �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = keyboard.next();
		
		System.out.print("���� : ");
		// xxx ������ = keyboard.nextXxx();
		// ���̸� �Է��Ұǵ�, �װ� �ӽ÷� ������ ���� ������ �� ��Ȳ
		int age = keyboard.nextInt();
		
		System.out.print("Ű : ");
		double height = keyboard.nextDouble();
		
		System.out.print("������ : ");
		double weight = keyboard.nextDouble();
		
		System.out.println("--------------");
		
		// printf�� ��� %d�ø�� ��밡��
		System.out.printf("�̸�\t: \"%s\"\n", name);
		System.out.printf("����\t: \"%03d��\"\n", age);
		System.out.printf("Ű\t: \"%.1fcm\"\n", height);
		System.out.printf("������\t: \"%.1fkg\"\n", weight);
	}
}













