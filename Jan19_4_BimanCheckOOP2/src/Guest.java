import java.util.Scanner;

public class Guest {
	
	public void write(Paper p, Scanner pen) {
		System.out.print("이름 : ");
		p.guestName = pen.next();
		
		System.out.print("키 : ");
		p.guestHeight = pen.nextDouble();
		
		System.out.print("몸무게 : ");
		p.guestWeight = pen.nextDouble();
	}
	
}
