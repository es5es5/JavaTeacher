/**
 * �ǻ� ....
 * @author �Ǳ��
 *
 */
public class Doctor {
	String name;
	int age;

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * �̸�, ���� ���
	 */
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

	/**
	 * bmi���
	 * @param h ����� Ű(cm������)
	 * @param w ����� ������(kg������)
	 * @return bmi��
	 */
	public double calculateBMI(double h, double w) {
		h /= 100;
		return w / (h * h);
	}
	
}







