public class Gejang {
	String name;
	int price;
	double weight;
	// ������ ��� ������ �����
	// ���� ������ ������ ��밡���� ����
	static GejangProducer producer = new GejangProducer("�����", 60);

	public Gejang() {
		// TODO Auto-generated constructor stub
	}

	public Gejang(String name, int price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
	}

}
