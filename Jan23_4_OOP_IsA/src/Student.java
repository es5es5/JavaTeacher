// @xxx : ���� �ڹٹ���x, �ڹٹ������� �ذ��ؾ� �ɰŸ� �ڵ����� �ذ�
// @Override : �ٷ� �ؿ� �ִ� �޼ҵ尡 �������̵� �� �޼ҵ����� ���� 

// Student is a Human(o) : ��� 
public class Student extends Human{
	// HumanŬ������ ���������� �� �����޾Ƽ� ��밡��
	int korScore;
	
	// introduce()�޼ҵ�� Human���� ��� �޾ƿͼ� �⺻������ ��� ����
	// �����޾ƿ� introduce()�޼ҵ尡 ����� ����
	// introduce()�޼ҵ带 ������ : �������̵�(overriding)
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(korScore);
	}
	
	public void doYaja() {
		System.out.println("����");
	}
	
}








