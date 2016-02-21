import java.util.Scanner;

public class TopPupils {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] name = new String[n];
		double[] average = new double[n];
		double first, second, third;
		first = second = third = 0;

		for (int i = 0; i < average.length; i++) {
			name[i] = sc.next() + " " + sc.next();
			average[i] = (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;
			if (first < average[i]) {
				third = second;
				second = first;
				first = average[i];
			}
		}

		for (int i = 0; i < average.length; i++) {
			if (average[i] == first || average[i] == second || average[i] == third) {
				System.out.println(name[i]);
			}
		}

	}
}
