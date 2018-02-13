public class Calculator {
	String name;
	String jejosa;
	int price;
	// int hab; int cha; int gob; int mok;

	public void printCalculatorInfo() {
		System.out.printf("품명 : %s\n", name);
		System.out.printf("제조사 : %s\n", jejosa);
		System.out.printf("가격 : %d\n", price);
	}

	// 숫자 두개를 넣어주면, 그 두 숫자의 합,차,곱,몫을 출력하는 메소드
	public void calculate(int a, int b) {
		int hab = a + b;
		int cha = a - b;
		int gob = a * b;
		int mok = a / b;

		System.out.printf("합 : %d\n", hab);
		System.out.printf("차 : %d\n", cha);
		System.out.printf("곱 : %d\n", gob);
		System.out.printf("몫 : %d\n", mok);
	}

	// 숫자 두개를 넣어주면, 그 두 숫자의 합을 구해주는 메소드
	public int getHab(int zxc, int asd) {
		int hab = zxc + asd;
		return hab;
	}

}



















