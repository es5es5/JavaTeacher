import java.util.Scanner;

public class Nurse {

	public void sendPaperToGuest(Guest g, Doctor d) {
		// 간호사가 종이 한장 새로 프린트
		Paper p = new Paper();

		// 간호사가 볼펜 하나 사옴
		Scanner pen = new Scanner(System.in);
		g.write(p, pen);
		sendPaperToDoctor(p, d);
	}

	public void sendPaperToDoctor(Paper p, Doctor d) {
		d.calculate(p);
	}
}











