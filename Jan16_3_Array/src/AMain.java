
public class AMain {
	public static void main(String[] args) {
		// 학생의 국어점수가 90
		int kor = 90;
		// 출력
		System.out.println(kor);

		// 배열은 참조형
		// 학생 5명의 영어점수가
		int[] eng = new int[5];
		eng[0] = 80;
		eng[1] = 50;
		eng[2] = 90;
		eng[3] = 10;
		eng[4] = 100;

		// 출력
		System.out.println(eng[1]);
		System.out.println(eng.length); // 배열 크기

		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}

		for (int e : eng) {
			System.out.println(e);
		}

		//////////////////////////////

		// 홍길동, 김길동, 최길동
		// String[] name = new String[3];
		// name[0] = "홍길동";
		// name[1] = "김길동";
		// name[2] = "최길동";

		// String[] name = new String[] { "홍길동", "김길동", "최길동" };

		String[] name = { "홍길동", "김길동", "최길동" };

		for (int i = 0; i < name.length; i++) {
			String s = name[i];
			System.out.println(s);
		}

		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("----------------");
		// 학생의 키, 몸무게
		int[][] student = { { 180, 80 }, { 170, 70 }, { 150, 50 } };

		// 첫번째 학생의 키
		System.out.println(student[0][0]);
		// 세번째 학생의 키
		System.out.println(student[2][0]);
		// 세번째 학생의 몸무게
		System.out.println(student[2][1]);

	}
}

