
public class CSMain {
	public static void main(String[] args) {
		int age = 5;
		int height = 180;
		int weight = 70;

		// 1. 나이가 10살 이상이면
		// 어서오세요
		// 2. 5 <= 나이 < 10이면
		// 다음에 오세요
		// 3. 2 <= 나이 < 5이면
		// 나중에 와
		// 4. 나머지는
		// 나가
		if (age >= 10) {
			System.out.println("어서오세요"); // 나이 >= 10
		} else {
			// 나이 < 10
			if (age >= 5) {
				// 5 <= 나이 < 10
				System.out.println("다음에 오세요");
			} else {
				// 나이 < 5
				if (age >= 2) {
					System.out.println("나중에 와");
				} else {
					System.out.println("나가");
				}
			}
		}
		////////////////////////////////////////////////
		// 1. 키가 150 이상이면 어서오세요
		// 2. 130 <= 키 < 150이면 어서와
		// 3. 100 <= 키 < 130이면 안녕
		// 4. 나머지는 나가
		if (height >= 150) {
			System.out.println("어서오세요");
		} else {
			if (height >= 130) {
				System.out.println("어서와");
			} else {
				if (height >= 100) {
					System.out.println("안녕");
				} else {
					System.out.println("나가");
				}
			}
		}
		/////////////////////////////////////
		if (height >= 150) {
			System.out.println("어서오세요");
		} else if (height >= 130) {
			System.out.println("어서와");
		} else if (height >= 100) {
			System.out.println("안녕");
		} else {
			System.out.println("나가");
		}
		/////////////////////////////////////
		
	}
}







