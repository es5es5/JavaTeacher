
public class TCMain {
	public static void main(String[] args) {
		// ����ȯ : �ڷ��� �ٲٴ°�
		byte b = 65;
		System.out.println(b); // b ���

		char c = (char) b; // byte -> char�� �ٲ�
		System.out.println(c);

		// �⺻�ڷ���
		//		�ƹ� ó�� ���� ���� ��������
		//			���� : int
		//			�Ǽ� : double	
				
		// int�� int�� ���� : ��� int�� ����
		// int�� double�� ���� : ��� double�� ����
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















