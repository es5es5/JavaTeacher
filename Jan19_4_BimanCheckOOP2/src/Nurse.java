import java.util.Scanner;

public class Nurse {

	public void sendPaperToGuest(Guest g, Doctor d) {
		// ��ȣ�簡 ���� ���� ���� ����Ʈ
		Paper p = new Paper();

		// ��ȣ�簡 ���� �ϳ� ���
		Scanner pen = new Scanner(System.in);
		g.write(p, pen);
		sendPaperToDoctor(p, d);
	}

	public void sendPaperToDoctor(Paper p, Doctor d) {
		d.calculate(p);
	}
}











