
public class Doctor {
	
	public void calculate(Paper p) {
		p.guestStdWeight = (p.guestHeight - 100) * 0.9;
		p.guestBimando = (p.guestWeight / p.guestStdWeight) * 100;
		p.result = "��ü��";
		if(p.guestBimando > 120) {
			p.result = "��";
		}else if(p.guestBimando > 80) {
			p.result = "����";
		}
		sayResult(p);
	}
	public void sayResult(Paper p) {
		System.out.printf("ǥ��ü�� : %.1fkg\n", p.guestStdWeight);
		System.out.printf("�񸸵� : %.1f%%\n", p.guestBimando);
		System.out.println(p.result);
	}
}
