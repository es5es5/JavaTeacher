
public class OMain2 {
	public static void main(String[] args) {
		// 논리 연산자 : 결과로 boolean나오는거
		//		>(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(다르다)
		int xx = 10;
		int yy = 20;
		
		boolean a = xx != yy;
		System.out.println(a);
		
		// 결합 연산자 : 논리 연산 여러개 묶을때
		//		&& (AND) :  A && B : A와 B를 모두 만족하면 true
		//					확률 낮은거를 앞쪽으로 배치하면 연산횟수를 줄일수 있음
		
		//		|| (OR)	 :	A || B : A나 B나 둘중에 하나라도 만족하면 true
		//					확률 높은거를 앞쪽으로 배치하면 연산횟수를 줄일수 있음
		
		//		^ (XOR)  :  A ^ B : A나 B나 둘중에 하나만 만족해야 true
		
		// 단항 연산자
		//		! (NOT)	 :  !A : A의 결과를 반대로 
		
		// xx가 5보다 크고, yy가 30보다 작냐
		boolean b = (xx > 5) && (yy < 30);
		System.out.println(b);
		
		// xx가 5보다 크거나, yy가 30보다 작냐
		boolean c = (xx > 5) || (yy < 30);
		System.out.println(c);
		
		// 놀이동산 놀이기구 타도 되는지 체크하는 프로그램
		int height = 180;
		int age = 30;
		
		// 나이가 10살 이상이고, 키가 200넘으면 타도됨
		boolean ok = (height > 200) && (age >= 10);
		System.out.println(ok);
		
		// 키가 200넘거나, 나이가 10살 이상이면 타도 됨 
		boolean ok2 = (age >= 10) || (height > 200);
		System.out.println(ok2);
		
		// 키가 200넘든지, 나이가 10살 이상이든지 둘중에 하나만
		boolean ok3 = (age >= 10) ^ (height > 200);
		System.out.println(ok3);
	
		// 키가 200넘으면 타면안됨
		boolean ok4 = !(height > 200);
		System.out.println(ok4);
		
		//////////////////////////////
		// 삼항연산자
		//		조건식 ? 조건만족하면사용할값 : 조건만족안하면사용할값 
		
		String aaa = "asdasd";
		int aasasd = 123;
		
		// 나이가 8살 넘으면 "어서오세요", 8살 이하면 "나가"
		String msg = (age > 8) ? "어서오세요" : "나가";
		System.out.println(msg);
		
		// 키가 200이상이거나, 나이가 20넘으면 10000원 아니면 5000원
		int money = ((age > 20) || (height > 200)) ? 10000 : 5000;
		
		// 나이를 2로 나눈 나머지가 0이면
		// 나이가 짝수면 500, 아니면 450 
		int discount = (age % 2 == 0) ? 500 : 450;
		
		// 할인
		// int money2 = money - discount;
		// money = money - discount;
		money -= discount;
		System.out.println(money);
		
	}
}













