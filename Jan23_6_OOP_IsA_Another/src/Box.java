import java.util.Random;

// 0~100사이의 짝수값만 랜덤하게 뽑히는 박스
public class Box extends Random{
	
	@Override
	public int nextInt(int bound) {
		// 일단 랜덤한 숫자 하나 뽑기
		int t = super.nextInt(bound);
		if(t % 2 == 1) {
			return nextInt(bound);
		}
		return t;
	}
}
