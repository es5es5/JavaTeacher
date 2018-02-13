// 함수
//		관련있는 작업을 한데 묶어서 정의해놓고
//		필요할때마다 그걸 호출해서 사용 => 코드 양을 줄일 수 있음

// ctrl + shift + /
// ctrl + shift + *
public class FMain {
	// 1. 함수 정의
	// public static void 함수명() {
	// 내용
	// 내용
	// }

	public static void yaDambae() {
		System.out.println("엄마한테 가서 돈 받아서");
		System.out.println("슈퍼에 가서");
		System.out.println("아줌마한테 한라산 1갑 달라 그러고 돈 드려라");
		System.out.println("그거 가져와");
	}

	public static void yaNaga() {
		System.out.println("창고가서 축구공 하나 농구공 두개 꺼내서");
		System.out.println("축구할 사람은 운동장 나가");
		System.out.println("농구할 사람은 강당 가");
		System.out.println("놀고");
		System.out.println("쉬는시간 5분전에 공 창고에 갖다놔");
	}

	public static void pushUp(int count) {
		System.out.println("손 짚고 엎드려서");
		for (int i = 0; i < count; i++) {
			System.out.println("팔 굽혀서 내려갔다가");
			System.out.println("팔 피면서 올라와");						
		}
	}
	
	public static void main(String[] args) {
		// 2. 함수 호출
		// 함수명();
		yaDambae();
		yaDambae();
		System.out.println("---------");
		pushUp(5);
		System.out.println("-----");
		pushUp(3);
	}

}








