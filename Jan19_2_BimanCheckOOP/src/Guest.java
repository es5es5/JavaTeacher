import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth;
	double stdWeight;
	double bimando;
	
	public void say() {
		mouth = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = mouth.next();
		
		System.out.print("Ű : ");
		height = mouth.nextDouble();
		
		System.out.print("������ : ");
		weight = mouth.nextDouble();
	}
	
}












