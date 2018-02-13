
public class TCMain {
	public static void main(String[] args) {
		// 형변환 : 자료형 바꾸는거
		byte b = 65;
		System.out.println(b); // b 출력

		char c = (char) b; // byte -> char로 바꿈
		System.out.println(c);

		// 기본자료형
		//		아무 처리 없이 값만 적었을때
		//			정수 : int
		//			실수 : double	
				
		// int와 int를 연산 : 결과 int로 나옴
		// int와 double를 연산 : 결과 double로 나옴
		double d = 10 / (double)4;
		System.out.println(d);
		
		double ddddd = 10 / 4.0;
		
		int aa = 10;
		long bb = aa; 			// int -> long
		int cc = (int) bb;  	// long -> int
		
		double dd = cc;			// int -> double
		int ee = (int) dd;		// double -> ee
		
								// String + ? = String
		String ff = "" + ee;	// int -> String
		String gg = "" + dd;	// double -> String
		
		
	}
}















