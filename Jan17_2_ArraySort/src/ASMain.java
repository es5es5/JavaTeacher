import java.util.Arrays;

public class ASMain {

	public static void selectionSort(int[] ar) {
		int min = 0;
		int minIndex = 0;
		int t = 0;
		for (int turn = 0; turn < (ar.length - 1); turn++) {
			min = ar[turn];
			minIndex = turn;
			for (int i = turn + 1; i < ar.length; i++) {
				if (min > ar[i]) {
					min = ar[i];
					minIndex = i;
				}
			}
			t = ar[turn];
			ar[turn] = ar[minIndex];
			ar[minIndex] = t;
		}
	}

	public static void bubbleSort(int[] ar) {
		int t = 0;

		for (int turn = 0; turn < (ar.length - 1); turn++) {
			for (int i = 0; i < (ar.length - 1 - turn); i++) {
				if (ar[i] > ar[i + 1]) {
					t = ar[i + 1];
					ar[i + 1] = ar[i];
					ar[i] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = { 10, 1, 11, 4 };

		// bubbleSort(ar);
		Arrays.sort(ar);

		for (int i : ar) {
			System.out.println(i);
		}
	}

}











