
public class CSMain4 {
	public static void main(String[] args) {
		int age = 10;

		switch (age) {
		case 10:
			System.out.println("���");
			break;
		case 20:
			System.out.println("�������");
			break;
		case 30:
			System.out.println("����ʽÿ�");
			break;
		default:
			System.out.println("????");
			break;
		}

		/////////////////////////////////////
		String line = "��μ�";

		switch (line) {
		case "��μ�":
			System.out.println("Ÿ�°� 1������ ��");
			break;
		case "�����":
			System.out.println("Ÿ�°� 2������ ��");
			break;
		case "ȣ����":
			System.out.println("Ÿ�°� 3������ ��");
			break;
		default:
			break;
		}
		//////////////////////////////////////
		String grade = "��";
		switch (grade) {
		case "�̺�":
			System.out.println("��ġ");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		case "����":
			System.out.println("��");
		default:
			break;
		}
		/////////////////////////////////////
		String role = "DBA";
		switch (role) {
		case "DBA":
			System.out.println("��������");
			System.out.println("���/����");
		case "DBP":
			System.out.println("�����Ͱ���");
		case "DBU":
			System.out.println("���");
		default:
			break;
		}
		
		if (role == "DBA") {
			System.out.println("��������");
			System.out.println("���/����");
			System.out.println("�����Ͱ���");
			System.out.println("���");
		}else if(role == "DBP") {
			System.out.println("�����Ͱ���");
			System.out.println("���");
		} else if(role == "DBU") {
			System.out.println("���");
		}
		
	}
}







