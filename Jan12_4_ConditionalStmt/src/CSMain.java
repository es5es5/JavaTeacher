// if (조건식){
//		조건 만족했을때 실행할 문장
// }

public class CSMain {
	public static void main(String[] args) {
		int age = 80;

		if (age >= 70) {
			System.out.println("어이구 어르신");
		}

		// 나이가 홀수이고, 10살 미만이면 ㅋㅋㅋ출력
		if ((age < 10) && (age % 2 == 1)) {
			System.out.println("ㅋㅋㅋ");
		}

		// 나이가 30살 미만이고, 나이가 2살 미만이면 ㅎㅎㅎ출력
		if (age < 2) {
			System.out.println("ㅋㅋㅋ");
		}
		
		System.out.println("어서오세요");
	}
}















