// static ������� : ����Ӽ�
//					- �޸� ����
//					- ���� ��ü�� ��� ��� ����
public class Gejang {
	// 1. �ȳ־ �Ǵϱ�
	// 2. ���� �ǹ̰� �ֳ�(���帶�� ���� �� �ٸ���)
	String name;
	int price;
	double weight;
	static String producer = "�����";
	static final String PRODUCER2 = "�����"; // ��� ���
	static Location madeIn = new Location();	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(producer);
		System.out.println(PRODUCER2);
		System.out.println(madeIn);
		System.out.println("-----");
	}
	
}




