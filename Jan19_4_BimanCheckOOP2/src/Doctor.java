
public class Doctor {
	
	public void calculate(Paper p) {
		p.guestStdWeight = (p.guestHeight - 100) * 0.9;
		p.guestBimando = (p.guestWeight / p.guestStdWeight) * 100;
		p.result = "저체중";
		if(p.guestBimando > 120) {
			p.result = "비만";
		}else if(p.guestBimando > 80) {
			p.result = "정상";
		}
		sayResult(p);
	}
	public void sayResult(Paper p) {
		System.out.printf("표준체중 : %.1fkg\n", p.guestStdWeight);
		System.out.printf("비만도 : %.1f%%\n", p.guestBimando);
		System.out.println(p.result);
	}
}
