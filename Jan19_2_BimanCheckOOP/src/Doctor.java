
public class Doctor {
	//???????
	// 손님한테 정보 물어보기
	public static void start(Guest g) {
		g.say();
		calculate(g);
		sayResult(g);
	}

	public static void calculate(Guest g) {
		g.stdWeight = (g.height - 100) * 0.9;
		g.bimando = (g.weight / g.stdWeight) * 100;
	}

	public static void sayResult(Guest g) {
		System.out.printf("표준체중 : %.1fkg\n", g.stdWeight);
		System.out.printf("비만도 : %.1f%%\n", g.bimando);
		
		if (g.bimando > 120) {
			System.out.println("비만");
		} else if (g.bimando > 80) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
	}

}






