import java.util.Scanner;

/** Created by glebsabirzanov on 23/03/16. */
public class Stupid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

		}
	}

	public double getAverage(int[] points) {
		double sum = 0;
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum /= points.length;
	}

}
