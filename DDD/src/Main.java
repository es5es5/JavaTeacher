import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		String[] line2 = null;
		String[] line3 = null;
		int count = 1;
		while ((line = br.readLine()) != null) {
			if (count == 1) {
				line2 = line.split(":");
				line3 = line2[1].split("x");
				for (String string : line3) {
					string = string.replace(" ", "");
					System.out.println(Integer.parseInt(string));
				}
				count++;
			} else if (count == 2) {
				line2 = line.split(":");
				line2[1] = line2[1].replace(" 0x", "");
				int r = Integer.parseInt(line2[1], 16);
				System.out.println(r);
				count++;
			} else if (count == 3) {
				line2 = line.split(":");
				line2[1] = line2[1].replace(" ", "");
				System.out.println(line2[1]);
				line = br.readLine();
				count++;
			} else {
				line2 = line.split(" ");
				System.out.print(line2[1] + "x" + line2[2] + ", ");
				System.out.print(line2[4] + ", ");
				if (line2[3].equals("yes")) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}

	}
}