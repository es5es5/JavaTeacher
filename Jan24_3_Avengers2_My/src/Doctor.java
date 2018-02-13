/**
 * 의사 ....
 * @author 권기웅
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
	 * 이름, 나이 출력
	 */
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

	/**
	 * bmi계산
	 * @param h 사람의 키(cm단위로)
	 * @param w 사람의 몸무게(kg단위로)
	 * @return bmi값
	 */
	public double calculateBMI(double h, double w) {
		h /= 100;
		return w / (h * h);
	}
	
}







