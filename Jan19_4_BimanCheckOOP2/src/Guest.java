import java.util.Scanner;

public class Guest {
	
	public void write(Paper p, Scanner pen) {
		System.out.print("�̸� : ");
		p.guestName = pen.next();
		
		System.out.print("Ű : ");
		p.guestHeight = pen.nextDouble();
		
		System.out.print("������ : ");
		p.guestWeight = pen.nextDouble();
	}
	
}
