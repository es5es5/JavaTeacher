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
		
		System.out.print("이름 : ");
		name = mouth.next();
		
		System.out.print("키 : ");
		height = mouth.nextDouble();
		
		System.out.print("몸무게 : ");
		weight = mouth.nextDouble();
	}
	
}












