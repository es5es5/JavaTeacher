import java.util.Arrays;
import java.util.Random;

// 로또 번호 자동
//		1 ~ 6중에 랜덤한 숫자 6개 뜨는 프로그램
//		중복이 안나와야
public class LMain {

	public static int pick(int i, int[] lotto) {
		Random r = new Random();
		int l = r.nextInt(45) + 1;
		for (int j = 0; j < i; j++) {
			if (l == lotto[j]) {
				return pick(i, lotto);
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(i, lotto);
		}
		Arrays.sort(lotto);

		for (int i : lotto) {
			System.out.println(i);
		}

	}

}
