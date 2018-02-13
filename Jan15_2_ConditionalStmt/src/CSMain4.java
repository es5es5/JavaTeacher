
public class CSMain4 {
	public static void main(String[] args) {
		int age = 10;

		switch (age) {
		case 10:
			System.out.println("어서와");
			break;
		case 20:
			System.out.println("어서오세요");
			break;
		case 30:
			System.out.println("어서오십시오");
			break;
		default:
			System.out.println("????");
			break;
		}

		/////////////////////////////////////
		String line = "경부선";

		switch (line) {
		case "경부선":
			System.out.println("타는곳 1번으로 가");
			break;
		case "경원선":
			System.out.println("타는곳 2번으로 가");
			break;
		case "호남선":
			System.out.println("타는곳 3번으로 가");
			break;
		default:
			break;
		}
		//////////////////////////////////////
		String grade = "상병";
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
		default:
			break;
		}
		/////////////////////////////////////
		String role = "DBA";
		switch (role) {
		case "DBA":
			System.out.println("전원관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("데이터관리");
		case "DBU":
			System.out.println("사용");
		default:
			break;
		}
		
		if (role == "DBA") {
			System.out.println("전원관리");
			System.out.println("백업/복구");
			System.out.println("데이터관리");
			System.out.println("사용");
		}else if(role == "DBP") {
			System.out.println("데이터관리");
			System.out.println("사용");
		} else if(role == "DBU") {
			System.out.println("사용");
		}
		
	}
}







