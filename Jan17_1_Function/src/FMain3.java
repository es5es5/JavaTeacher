
public class FMain3 {
	// 1) 함수 정의
	// 함수의 인자, parameter : 그 함수를 수행하는데 필요한 것들
	// public static 자료형 함수명(자료형 변수명, 자료형 변수명, ...) {
	// 리턴타입 : 이 함수의 결과의 자료형
	// 내용
	// 내용
	// return 결과값; 함수 끝
	// }

	public static int go(int a) {
		a += 10;
		a *= 3;
		a /= 1;
		a -= 5;
		return a;
	}

	// 중간고사점수, 기말고사점수를 넣으면 평균을 구해주는 함수
	public static double getAverage(int mid, int finalExam) {
		double avg = (mid + finalExam) / 2.0;
		return avg;
	}

	public static int getBiggerNum(int a, int b) {
		// if(a < b) {
		// return b;
		// } else {
		// return a;
		// }

		// if(a < b) {
		// return b;
		// }
		// return a;

		return (a < b) ? b : a;
	}

	public static String say(int age) {
		if (age >= 30) {
			return "안녕하십니까";
		} else if (age >= 20) {
			return "안녕하세요";
		} else if (age >= 10) {
			return "안녕";
		}
		return "";
	}

	public static int getVAT(int price) {
		return price / 10;
	}

	public static int getSalary(int month) {
		return month * 12;
	}

	public static void main(String[] args) {
		System.out.println(say(29));
		System.out.println(getVAT(100000));
		System.out.println(getSalary(2000000));

		double avg1 = getAverage(100, 90);
		System.out.println(avg1);

		double avg2 = getAverage(78, 54);
		System.out.println(avg2);

		System.out.println(getAverage(10, 50));
	}

}
